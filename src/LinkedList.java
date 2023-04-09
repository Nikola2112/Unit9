public class LinkedList {

    private Node first; // первый  элемент списка
    private Node last; // последний  элемент списка
    private int size; // количество элементов в списке

    private class Node {
        Object data; // данные элемента
        Node next; // ссылка на следующий элемент
        Node prev; // ссылка на предыдущий элемент

         Node(Object data) {
            this.data = data;
        }
    }

    // добавление элемента в конец списка
    public void add( Object value) {
        Node newNode = new Node( value);
        if (last != null) { // если хвостовой элемент не null, значит список не пустой
            last.next = newNode; // ссылка на следующий элемент последнего элемента будет указывать на новый элемент
            newNode.prev = last; // ссылка на предыдущий элемент нового элемента будет указывать на последний элемент
        } else { // если список пустой
            first = newNode; // новый элемент будет первыйм элементом
        }
        last = newNode; // устанавливаем ссылку на последний  элемент
        size++; // увеличиваем счетчик элементов
    }

    // удаление элемента по индексу
    public void remove(int index) {
        if (index < 0 || index >= size) { // если индекс выходит за пределы списка, выбрасываем исключение
            throw new IndexOutOfBoundsException();
        }
        Node currentNode = first ;
        for (int i = 0; i < index; i++) { // находим элемент, который нужно удалить
            currentNode = currentNode.next;
        }
        if (currentNode.prev != null) { // обновляем ссылки на предыдущий и следующий элементы, чтобы они обходили текущий элемент
            currentNode.prev.next = currentNode.next;
        } else { // если элемент находится на краю списка (первого)
            first = currentNode.next;
        }
        if (currentNode.next != null) {
            currentNode.next.prev = currentNode.prev;
        } else { // если элемент находится на краю списка (последнего)
            last = currentNode.prev;
        }
        size--; // уменьшаем счетчик элементов
    }

    // очистка списка
    public void clear() {
        first = null; // устанавливаем ссылки на первый  и последний  элементы в null
        last = null;
        size = 0; // устанавливаем счетчик элементов в 0
    }

    // получение количества элементов в списке
    public int size() {
        return size;
    }

    // получение элемента по индексу
    public Object get(int index) {
        if (index < 0 || index >= size) { // если индекс выходит за пределы списка, выбрасываем исключение
            throw new IndexOutOfBoundsException();
        }
        Node currentNode = first;
        for (int i = 0; i < index; i++) { // находим элемент по индексу
            currentNode = currentNode.next;
        }
        return currentNode.data; // возвращаем данные элемента

    }
}