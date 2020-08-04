class Solution {
    public int maxSumTwoNoOverlap(int[] A, int L, int M) {
        
        int n = A.length;
        
        int sum [] = new int [n+1];
        
        sum[0] = 0;
        
        for (int i=1;i<n+1;i++){
            sum[i]=A[i-1]+sum[i-1];
        }
        
        
        int ans =0;
        
        if(M>L){
            int temp = L;
            L=M;
            M=temp;
        }
        
        
        for (int i=L-1;i<n;i++){
            int a = sum[i+1]-sum[i-L+1];
            
            // i-L+1  to i
            for (int j=M-1;j<n;j++){
                
                //j-M+1 to j
                
                if(j>=i-L+1 && j<=i) continue;
                if(j-M+1>=i-L+1 && j-M+1<=i) continue;
​
                
                int b = sum[j+1]-sum[j-M+1];
                
                //System.out.println(i+ " "+j+ " "+(a+b));
                ans = Math.max(ans,a+b);
            }
            
        }
        
        
        return ans;
        
        
