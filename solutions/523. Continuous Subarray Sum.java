class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        
       
      
        Map<Integer,Integer> m = new HashMap();
        int sum =0;
        m.put(0, -1);
        for (int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(k!=0)sum=sum%k;
            
            //if(sum==0){ans=Math.max(ans,i+1);if(ans>=2) return true;}
         if(!m.containsKey(sum)){
                m.put(sum,i);
            } else {
                if(i-m.get(sum)>1) return true;
            }
        }
        
        return false;
        
        
    }
}