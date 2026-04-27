class LRUCache {
    Map<Integer , Integer> lru;
    int cap;

    public LRUCache(int capacity) {
        cap = capacity;
        lru = new LinkedHashMap<>(capacity, 0.75f, true);
    }
    
    public int get(int key) {
        return lru.getOrDefault(key,-1);
    }
    
    public void put(int key, int value) {
        if (!lru.containsKey(key) && lru.size() == cap) {
            Integer firstKey = lru.keySet().iterator().next();
            lru.remove(firstKey);
        }
        lru.put(key, value);
    }
}
