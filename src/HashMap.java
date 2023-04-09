public class HashMap {
    private Node[] buckets;
    private int size;

    private static final int DEFAULT_CAPACITY = 16;

    public HashMap() {
        buckets = new Node[DEFAULT_CAPACITY];
        size = 0;
    }

    public void put(Object key, Object value) {
        int index = getIndex(key);
        Node node = buckets[index];
        while (node != null) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
            node = node.next;
        }
        Node newNode = new Node(key, value);
        newNode.next = buckets[index];
        buckets[index] = newNode;
        size++;
    }

    public Object get(Object key) {
        int index = getIndex(key);
        Node node = buckets[index];
        while (node != null) {
            if (node.key.equals(key)) {
                return node.value;
            }
            node = node.next;
        }
        return null;
    }

    public void remove(Object key) {
        int index = getIndex(key);
        Node node = buckets[index];
        if (node == null) {
            return;
        }
        if (node.key.equals(key)) {
            buckets[index] = node.next;
            size--;
            return;
        }
        Node prevNode = node;
        node = node.next;
        while (node != null) {
            if (node.key.equals(key)) {
                prevNode.next = node.next;
                size--;
                return;
            }
            prevNode = node;
            node = node.next;
        }
    }

    public void clear() {
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = null;
        }
        size = 0;
    }

    public int size() {
        return size;
    }

    private int getIndex(Object key) {
        int hashCode = key.hashCode();
        return Math.abs(hashCode) % buckets.length;
    }

    private class Node {
        private Object key;
        private Object value;
        private Node next;

        public Node(Object key, Object value) {
            this.key = key;
            this.value = value;
            next = null;
        }
    }
}
