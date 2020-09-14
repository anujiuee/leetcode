class Solution {
    public boolean canCross(int[] stones) {
        
        int n = stones.length;
        
        if(stones[1]!=1) return false;
        
        //hashset to remove same jump multiple time
                
        HashMap<Integer,HashSet<Integer>> map = new HashMap();
        
        for (int i=0;i<n;i++){
             map.put(stones[i],new HashSet());
        }
        
               
        for (int i=1;i<n;i++){
            if(i==1) {map.get(stones[i]).add(1);}
            
            for (int m:map.get(stones[i])){
                
                for(int t=m-1;t<=m+1;t++){
                   if(t>0 && map.containsKey(stones[i]+t)){
                     map.get(stones[i]+t).add(t);
                 } 
                }
                
            }
            
        }
        
       return map.get(stones[n-1]).size()>0;
    }
}
