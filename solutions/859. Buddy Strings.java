class Solution {
    public boolean buddyStrings(String A, String B) {
        
        if(A==null || B==null) return false;
        
        int n = A.length();
        int m = B.length();
        
        if(n!=m) return false;
        
      
        List<Integer> ans = new ArrayList(); 
        
        if(A.equals(B)){
            int[] count = new int[26];
            for (int i = 0; i < A.length(); ++i){
                count[A.charAt(i) - 'a']++;
                if(count[A.charAt(i) - 'a']>1) return true;
             }
​
        
            return false;
        }
        
        for (int i=0;i<n;i++){
            if(A.charAt(i)!=B.charAt(i)){
                ans.add(i);
            }
            if(ans.size()>2) return false;
        }
        
        if(ans.size()!=2) return false;
        
        if(A.charAt(ans.get(0))==B.charAt(ans.get(1)) && A.charAt(ans.get(1))==B.charAt(ans.get(0))) return true;
        
        return false;
        
    }
}
