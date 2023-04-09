import java.util.NoSuchElementException;

public class Queue<T> {
    private Node<T> front; // указатель на первый элемент в очереди
    private Node<T> rear; // указатель на последний элемент в очереди
    private int size; // размер очереди

    private static class Node<T> {
        T value;
        Node<T> next;

        Node(T value) {
            this.value = value;
        }
    }

    //Добавляет элемент в конец очереди.
    public void add(T value) {
        Node<T> node = new Node<>(value);
        if (rear == null) { // если очередь пуста, первый элемент становится началом
            front = node;
        } else {
            rear.next = node; // связываем последний элемент со следующим
        }
        rear = node; // указываем, что добавленный элемент стал последним
        size++; // увеличиваем размер очереди
    }


    //Очищает очередь.

    public void clear() {
        front = rear = null; // удаляем ссылки на все элементы
        size = 0; // сбрасываем размер очереди
    }


    //Возвращает размер очереди.
    public int size() {
        return size;
    }


     //Возвращает первый элемент в очереди без его удаления
    public T peek() {
        if (front == null) {
            throw new NoSuchElementException();
        }
        return front.value;
    }


    //  Возвращает первый элемент в очереди и удаляет его из нее.

    public T poll() {
        if (front == null) {
            throw new NoSuchElementException();
        }
        T value = front.value; // запоминаем значение первого элемента
        front = front.next; // указываем, что следующий элемент станет первым
        if (front == null) { // если удалили последний элемент, обнуляем ссылку на последний элемент
            rear = null;
        }
        size--; // уменьшаем размер очереди
        return value;
    }
}
