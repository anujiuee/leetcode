class Solution {
    public int jump(int[] nums) {
        
        int jump=0;int curr_end =0;int curr_far =0;;
        
    for(int i=0;i<nums.length-1;i++){
        curr_far = Math.max(nums[i]+i,curr_far);
        if(curr_end==i){
            curr_end=curr_far;
            jump++;
        }
    }
        
        
        return jump;
   
    }
}