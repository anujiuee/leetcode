class TimeMap {
    
    class Myobj {
        String key;
        int timestamp;
        
        Myobj(String key, int timestamp){
            this.key = key;
            this.timestamp = timestamp;
        }
    }
​
    /** Initialize your data structure here. */
    TreeMap<Myobj,String> map ;
    public TimeMap() {
        map = new TreeMap(new Comparator<Myobj>(){
            @Override
            public int compare(Myobj s1, Myobj s2) {
                if(!s1.key.equals(s2.key)) return s1.key.compareTo(s2.key);
                else {
                    return s1.timestamp-s2.timestamp;
                }
            }
        });
    }
    
    public void set(String key, String value, int timestamp) {
        map.put(new Myobj(key,timestamp),value);          
    }
    
    public String get(String key, int timestamp) {
        Myobj k = map.floorKey(new Myobj(key,timestamp));
        if(k==null || !k.key.equals(key)) return "";
        
        
        return map.get(k);
    }
}
​
/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */
