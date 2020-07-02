class Solution {
    public int[] runningSum(int[] nums) {
        
        int arr[] = new int[nums.length];
        
        if(nums.length == 0)
            return arr;
        
        arr[0] = nums[0];
        
        for(int i=1; i<nums.length; i++){
            arr[i] = nums[i] + arr[i-1];
        }
        
        return arr;
    }
}