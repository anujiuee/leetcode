class Solution {
    int count;
    public int subarraySum(int[] nums, int k) {
      Map<Integer,Integer> map=new HashMap<>();
       int count=0;
        int currentSum=0;
        
        for(int i=0;i<nums.length;i++){
           currentSum+=nums[i];
            
            
            if(currentSum==k)
               
               count++;
            
            if(map.containsKey(currentSum-k))
            {
            Integer val=map.get(currentSum-k);               
            count+=val;             
            }
            
            Integer val=map.get(currentSum);            
            if(val != null)
                map.put(currentSum,val+1);
            else
                 map.put(currentSum,1); 
            
        }
            
        
        
        return count;
    }
    
     
}
