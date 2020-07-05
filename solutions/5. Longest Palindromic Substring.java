class Solution {
    public String longestPalindrome(String s) {
         int n = s.length();
  String res = "";
    
  boolean[][] dp = new boolean[n][n];
    
  int len =0;
    
  for (int i = n - 1; i >= 0; i--) {
    for (int j = i; j < n; j++) {
      dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 3 || dp[i + 1][j - 1]);
            
      if (dp[i][j] && ( j - i + 1 > len)) {
        res = s.substring(i, j + 1); len =j-i+1;
      }
    }
  }
    
  return res;
        
    }
   
    
      /*

 int max=Integer.MIN_VALUE;
    String result="";
    
    private int checkForPalindrome(String s, int start, int end){
        if(s.charAt(start) != s.charAt(end)) return 0;
        while(start>=0 && end <s.length() && s.charAt(start) == s.charAt(end)){
            start--;
            end++;
        }
        return end-start-1;
    }
    
    public String longestPalindrome(String s) {
        if(s.length()<2) return s;
        for(int i=0;i<s.length()-1;i++){
            int l1 = checkForPalindrome(s,i,i);
            int l2 = checkForPalindrome(s,i,i+1);
            int most = Math.max(l1,l2);
            if(most>max){
                max=most;
                if(most%2==0){
                    result = s.substring(i-((most/2)-1),i+(most/2)+1);
                }else{
                    result = s.substring(i-((most/2)),i+(most/2)+1);
                }
            }
        }
        return result;
    }




*/
  
}


