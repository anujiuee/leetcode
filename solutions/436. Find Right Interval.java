class Solution {
    public int[] findRightInterval(int[][] intervals) {
        
        TreeMap <Integer,Integer>  map = new TreeMap();
        
        int n = intervals.length;
        
        for (int i=0;i<n;i++){
            map.put(intervals[i][0],i);
        }
        
        int ans [] = new int [n];
        
        for (int i=0;i<n;i++){
            ans[i]=-1;
            
            if(map.get(intervals[i][1])!=null){
                ans[i]=map.get(intervals[i][1]); 
            }
            else if(map.higherKey(intervals[i][1])!=null)
              ans[i]=map.get(map.higherKey(intervals[i][1])); 
        }
        
        return ans;
        
    }
}
