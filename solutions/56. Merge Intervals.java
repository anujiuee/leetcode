class Solution {
    public int[][] merge(int[][] intervals) {
        
        if(intervals.length == 0)
            return intervals;
        
        
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] entry1, int[] entry2) {
                int int1 = entry1[0];
                int int2 = entry2[0];
                int int11 = entry1[1];
                int int21 = entry2[1];
                if (int1 > int2) 
                    return 1; 
               else {
                    if (int1 == int2)
                        return 0;
                   
                    return -1;
                }
                     
            }
        });
        
        int low = intervals[0][0];
        int high = intervals[0][1];
        List<int[]> list = new ArrayList();
        for(int i=1; i<intervals.length; i++){
            
            if(intervals[i][0] > high){
                int[] arr = new int[2];
                arr[0] = low;
                arr[1] = high;
                list.add(arr);
                low = intervals[i][0];
                high = intervals[i][1];
            } else{
                high = Math.max(high, intervals[i][1]);
            }
        }
        
        int[] arr = new int[2];
        arr[0] = low;
        arr[1] = high;
        
        list.add(arr);
        int[][] result = new int[list.size()][2];
        for(int i =0; i<list.size(); i++){
            result[i] = list.get(i);
        }
        
        return result;
    }
}