class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        
        Arrays.sort(envelopes,(i,j)->(i[0]*i[1]-j[0]*j[1]));
        
        int n = envelopes.length;
        
        int ans[]= new int [n];
        
        int k =0;
        
        int t =0;
        
        for (int i=0;i<n;i++){
            ans[i]=1;k=0;
            for (int j=0;j<i;j++){
                if(envelopes[i][0]>envelopes[j][0] && envelopes[i][1]>envelopes[j][1]){
                  k= Math.max(ans[j],k);
                }
            }
            ans[i]=Math.max(ans[i],k+1);
            t=Math.max(ans[i],t);
        }
        
        return t;
    }
}
