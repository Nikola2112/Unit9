public class StackTest {
    public static void main(String[] args) {
        // создание стека с помощью конструктора по умолчанию
        Stack<Integer> stack = new Stack<>();

        // добавление элементов в стек
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // вывод размера стека
        System.out.println("Size: " + stack.size()); // ожидаемый результат: 3

        // вывод первого элемента в стеке без удаления
        System.out.println("Peek: " + stack.peek()); // ожидаемый результат: 3

        // вывод всех элементов стека с удалением
        while (stack.size() > 0) {
            System.out.println("Pop: " + stack.pop()); // ожидаемые результаты: 3, 2, 1
        }

        // очистка стека
        stack.clear();

        // вывод размера стека после очистки
        System.out.println("Size: " + stack.size()); // ожидаемый результат: 0

        stack.push(9);
        stack.push(11);
        stack.push(77);
        stack.push(66);
        System.out.println("Size " + stack.size()); // ожидаемый результат 4

        //удаление значения под индексом 2
        stack.remove(2);
        System.out.println("Size " + stack.size()); // ожидаемый результат 3

    }
}
