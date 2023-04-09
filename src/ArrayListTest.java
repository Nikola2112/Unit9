public class ArrayListTest<T> {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        // add elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("List after adding elements: " + list); // [1, 2, 3, 4, 5] (не работает )

        // get elements
        int element = list.get(2);
        System.out.println("Element at index 2: " + element); // 3

        // remove elements
        list.remove(1);
        System.out.println("List after removing element at index 1: " + list); // [1, 3, 4, 5] (не работает )

        // clear list
        list.clear();
        System.out.println("List after clearing: " + list); // [] ( не работает )

        // check size
        System.out.println("Size of list: " + list.size()); // 0

    }
}
