class Solution {
    public int lengthOfLongestSubstring(String s) {
       int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); 
        
        int i =0;
        
        int j=0;
        
         for ( j = 0; j < n; j++) {
             
             if(map.containsKey(s.charAt(j))){
                  
                 ans = Math.max(ans,j-i);
                 
                 //"abba"
                 
                 i=Math.max(map.get(s.charAt(j))+1,i);
             }
             
             map.put(s.charAt(j),j);
             
         }
        
        
        ans = Math.max(ans,j-i);
        
        return ans;
    }
}
