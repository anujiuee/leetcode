class LRUCache {
​
    Map<Integer, Integer> map; 
    int cap = 0;
    
    public LRUCache(int capacity) {
        map = new LinkedHashMap();
        cap = capacity;
    }
    
    public int get(int key) {
        
        if(map.get(key) == null)
            return -1;
        else{
            Integer val = map.get(key);
            map.remove(key);
            map.put(key, val);
            
        }
            return map.get(key);
    }
    
    public void put(int key, int value) {
        if(map.get(key) == null){
            map.put(key, value); 
        } else {
           
            map.remove(key);
            map.put(key, value);
        }
        
        if(map.size() > cap){
            
            Integer k = map.entrySet().iterator().next().getKey();
            map.remove(k);
            
        }
    }
}
​
/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
