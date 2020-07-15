class Solution {
    public int findMaxLength(int[] nums) {
       int ans=0; 
      
        Map<Integer,Integer> m = new HashMap();
        int sum =0;
        for (int i=0;i<nums.length;i++){
           if(nums[i]==0) sum-=1;
           else sum+=1;
            
            if(sum==0){ans=Math.max(ans,i+1);}
            else if(!m.containsKey(sum)){
                m.put(sum,i);
            } else {
                ans=Math.max(ans,i-m.get(sum));
            }
        }
        
        return ans;
    }
}