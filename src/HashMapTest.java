public class HashMapTest {
    public static void main(String[] args){
        // создание экземпляра MyHashMap
        HashMap map = new HashMap();

        // добавление пары ключ-значение
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        // проверка метода get
        System.out.println("Value of key 'one': " + map.get("one")); // 1
        System.out.println("Value of key 'two': " + map.get("two")); // 2
        System.out.println("Value of key 'three': " + map.get("three")); // 3
        System.out.println("Value of key 'four': " + map.get("four")); // null

        // проверка метода remove
        map.remove("two");
        System.out.println("Value of key 'two': " + map.get("two")); // null
        System.out.println("Size of map after remove: " + map.size()); // 2

        // проверка метода clear
        map.clear();
        System.out.println("Size of map after clear: " + map.size()); // 0
    }
    }


