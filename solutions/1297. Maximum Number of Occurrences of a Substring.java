class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        Map<String,Integer> map=new HashMap<>();
        
        int res=0;
        int len=s.length();
        
        for(int i=0;i<=(len-minSize);i++){
            String sub=s.substring(i,i+minSize);
            Set<Character> set=new HashSet<>();
            for(char c:sub.toCharArray()){
                set.add(c);
            }
            if(set.size()>maxLetters)
                continue;
            
            map.put(sub,map.getOrDefault(sub,0)+1);
            if(map.get(sub)>res)
                res=map.get(sub);
​
        }
        return res;
    }
}
