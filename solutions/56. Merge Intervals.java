class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (x,y)->x[0]-y[0]);
        int[][] result = new int[intervals.length][2];
        int index=0;
        int i=0;
        while(i<intervals.length){
            int low = intervals[i][0];
            int high = intervals[i][1];
            while(i<intervals.length && intervals[i][0] <= high){
                high = Math.max(high, intervals[i][1]);
                i++;
            }
            result[index][0]=low;
            result[index][1]=high;
            index++;
        }
        return Arrays.copyOfRange(result,0,index);
    }
}
