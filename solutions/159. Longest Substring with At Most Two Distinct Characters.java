class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        
        int j=0;
        
        Map<Character,Integer> map = new HashMap();
        
        int ans = 0;
        
        for (int i=0;i<s.length();i++){
            
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            
            
            while(map.size()==3){
                map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)-1);
                if(map.get(s.charAt(j))==0) map.remove(s.charAt(j));
                                j++;
​
            }
            
            if(map.size()==2 || map.size()==1){
                ans = Math.max(ans,i-j+1);
            }
        }
        
        
        if(map.size()==2 || map.size()==1){
                ans = Math.max(ans,s.length()-j);
            }
        return ans;
    }
}
