class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points.length == 0) return 0;
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
         int i = 0;
        
        int j =0;
        
        int count =0;
        
        while(i<points.length){
            
           count++;
            
            j=i;
            int end = Math.min(points[i][1],points[j][1]);
​
            while(j<points.length && points[j][0]<=end){
                end = Math.min(end,points[j][1]);
                j++;
            }
            
            i=j;
        }
        
        
        return count;
    }
}
