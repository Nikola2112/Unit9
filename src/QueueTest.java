public class QueueTest<T> {

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.add(2);
        queue.add(7);
        queue.add(10);

        System.out.println("Queue size: " + queue.size()); // 3

        System.out.println("Peek: " + queue.peek()); // 2


        Integer first = queue.poll();
        System.out.println("Poll: " + first); // 2

        System.out.println("Queue size after poll: " + queue.size()); // 2

        queue.clear();
        System.out.println("Queue size after clear: " + queue.size()); // 0

    }
}