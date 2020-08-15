class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        
        int n = intervals.length;
        
        int ans = 0 ;
        int a = 0; 
        int b=0;
        
        int i=0;
        while(i<n){
            a = intervals[i][0];
            b = intervals[i][1];
            
            while(i<n-1 && b>intervals[i+1][0]){
                b = Math.min(b,intervals[i+1][1]);
                ans++;
                i++;
            }
                
                
                i++;
            
            }
        
        return ans;
    }
}
