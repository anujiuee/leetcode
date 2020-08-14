class Solution {
    public int longestPalindrome(String s) {
        
        int n = s.length();
        
        int a [] = new int [58];
        
        
        for (int i=0;i<n;i++){
            a[s.charAt(i)-'A']++;
        }
        
        int ans =0;
        
        boolean m = false;
        
        for (int i=0;i<58;i++){
         ans+= (a[i]/2);  
           if(a[i]%2==1) m =true; 
        }
        
        if(m==true) return 2*ans+1;
        else return 2*ans;
        
               
        
    }
}
