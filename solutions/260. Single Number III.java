class Solution {
    public int[] singleNumber(int[] nums) {
        
        int a = nums[0];
        
        for (int i=1;i<nums.length;i++){
            a= nums[i]^a;
        }
        
        int b = a & (a-1);
        b = b^a;
        
        int m =0;
        
        for (int i=0;i<nums.length;i++){
            if((b & nums[i]) !=0){
                m=m^nums[i];
            }
        }
        
        
        
        return new int []{m,m^a};
        
    }
}
