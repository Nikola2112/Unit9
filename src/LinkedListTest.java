public class LinkedListTest{

    public static void main(String[] args) {
        LinkedList list= new LinkedList();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        System.out.println("Size of list: " + list.size()); // размер листа: 3
        System.out.println("Element at index 2: " + list.get(2)); // второй  елемент : cherry
        list.remove(1);
        System.out.println("Size of list after removing an element: " + list.size()); // размер листа после удаления елемента : 2
        System.out.println("Element at index 1 after removing an element: " + list.get(1)); // елемент под индексом один после удаления : cherry
        list.clear();
        System.out.println("Size of list after clearing: " + list.size()); // размер после очистки : 0
        list.size();
        System.out.println("Size of list: " + list.size()); // проверка размера после очистки: 0
    }

}

