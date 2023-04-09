public class ArrayList<T> {

    private Object[] data;
    private int size;

    public ArrayList() {
        data = new Object[10];
        size = 0;
    }

    public void add(T value) {
        if (size == data.length) {  // если массив заполнен
            Object[] newData = new Object[data.length * 2];  // создаем новый массив с удвоенной длиной
            System.arraycopy(data,0, newData,0, data.length);  // копируем элементы из старого массива в новый
            data = newData;  // заменяем старый массив на новый
        }
        data[size] = value;  // добавляем новый элемент в конец массива
        size++;  // увеличиваем размер на 1
    }

    public T get(int index) {
        if (index < 0 || index >= size) {  // если индекс выходит за границы массива
            throw new IndexOutOfBoundsException();  // выбрасываем исключение
        }
        return (T) data[index];  // возвращаем элемент под указанным индексом
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {  // если индекс выходит за границы массива
            throw new IndexOutOfBoundsException();  // выбрасываем исключение
        }
        System.arraycopy(data, index + 1, data, index, size - index - 1);  // перемещаем элементы после удаляемого на 1 позицию влево
        size--;  // уменьшаем размер на 1
    }

    public void clear() {
        size = 0;  // сбрасываем размер на 0
    }

    public int size() {
        return size;  // возвращаем текущий размер массива
    }

}
