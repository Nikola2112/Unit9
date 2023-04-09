

public class Stack<T> {
    private Node<T> head; // головной узел списка
    private int size; // размер стека

    public Stack() {
        head = null; // инициализация головного узла
        size = 0; // инициализация размера стека
    }

    public void push(T value) {
        Node<T> newNode = new Node<>(value); // создание нового узла
        newNode.next = head; // новый узел становится головным
        head = newNode; // голова указывает на новый узел
        size++; // увеличение размера стека
    }

    public void remove(int index) {
        if (index == 0) { // если удаляем голову
            head = head.next; // переставляем голову
            size--; // уменьшаем размер стека
            return; // выходим из метода
        }

        Node<T> previous = getNode(index - 1); // находим узел, предшествующий удаляемому
        previous.next = previous.next.next; // удаляем узел
        size--; // уменьшаем размер стека
    }

    public void clear() {
        head = null; // обнуляем голову, чтобы все узлы были удалены сборщиком мусора
        size = 0; // устанавливаем размер стека в ноль
    }

    public int size() {
        return size; // возвращаем размер стека
    }

    public T peek() {
        if (head == null) {
            return null; // если стек пуст, возвращаем null
        }
        return head.value; // возвращаем значение головного узла
    }

    public T pop() {
        if (head == null) {
            return null; // если стек пуст, возвращаем null
        }

        T value = head.value; // сохраняем значение головного узла
        head = head.next; // переставляем голову
        size--; // уменьшаем размер стека
        return value; // возвращаем сохраненное значение
    }

    private Node<T> getNode(int index) {
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next; // переход к следующему узлу
        }
        return current; // возвращаем найденный узел
    }

    private static class Node<T> {
        T value; // значение узла
        Node<T> next; // ссылка на следующий узел

        Node(T value) {
            this.value = value; // конструктор узла
            next = null; // ссылка на следующий узел инициализируется null
        }
    }
}
