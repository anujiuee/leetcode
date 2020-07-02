class Solution {
    public int minMeetingRooms(int[][] intervals) {
        if (intervals.length == 0) {
      return 0;
    }

    Integer[] start = new Integer[intervals.length];
    Integer[] end = new Integer[intervals.length];

    for (int i = 0; i < intervals.length; i++) {
      start[i] = intervals[i][0];
      end[i] = intervals[i][1];
    }

    // Sort the intervals by end time
    Arrays.sort(end);

    // Sort the intervals by start time
    Arrays.sort(start);
    int index=0;
    int index1=0;
    int count=0,max=Integer.MIN_VALUE;
    while(index<start.length && index1<end.length  )  {
        if(start[index]<end[index1]){
            count++;
            index++;  
        }
        else{
            count--;
            index1++;
        }
        
    max=Math.max(max,count);
     //index++;   
    }  
        
   return max;     
    }
}