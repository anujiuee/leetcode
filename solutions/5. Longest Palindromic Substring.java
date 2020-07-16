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
}