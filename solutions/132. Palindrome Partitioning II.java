class Solution {
    public int minCut(String s) {
        
        int n = s.length();
        
        boolean dp[][] = new boolean [n][n];
        
        int ans[]= new int [n];
        
        int min=0;
        
        for (int i=0;i<n;i++){
            min=i;
            for(int j=0;j<=i;j++){
                
                if(s.charAt(i)==s.charAt(j) && (i-j<2 || dp[j+1][i-1])){
                    if(j==0) min=0;
                    else {dp[j][i]=true;
                  min=Math.min(min,ans[j-1]+1);}

                } 
                
            }
            
            ans[i]=min;
            
        }
        
        
        
        return ans[n-1];
    }
    

}