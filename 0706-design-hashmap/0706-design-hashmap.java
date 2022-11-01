class MyHashMap {
    static Map<Integer,Integer>mp;
    public MyHashMap() {
        mp = new HashMap<>();
    }
    
    public void put(int key, int value) {
        mp.put(key,value);
    }
    
    public int get(int key) {
        if(mp.containsKey(key))
        return (int)mp.get(key);
        return -1;
    }
    
    public void remove(int key) {
        if(mp.containsKey(key))
            mp.remove(key);
        
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */