class LRUCache {
    class Node {
        int key, value;
        Node prev, next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    Map<Integer, Node> map;
    Node head, tail;
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
    }

    public int get(int key) {
        if (!map.containsKey(key)) return -1;

        Node node = map.get(key);
        remove(node);
        addLast(node);

        return node.value;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            remove(node);
            addLast(node);
        } else {
            if (map.size() == capacity) {
                map.remove(head.key);
                remove(head);
            }

            Node node = new Node(key, value);
            addLast(node);
            map.put(key, node);
        }
    }

    private void remove(Node node) {
        if (node == head) head = head.next;
        if (node == tail) tail = tail.prev;

        if (node.prev != null) node.prev.next = node.next;
        if (node.next != null) node.next.prev = node.prev;
    }

    private void addLast(Node node) {
        node.next = null;
        node.prev = tail;

        if (tail != null) tail.next = node;
        tail = node;

        if (head == null) head = node;
    }
}