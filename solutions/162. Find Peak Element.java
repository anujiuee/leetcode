class Solution {
    public int findPeakElement(int[] nums) {
       return findPeakElements(0,nums.length-1,nums); 
    }
    
    public int findPeakElements(int start, int end, int[] arr) {
        
        int mid = start + (end-start)/2;
        
        if((mid==0|| arr[mid-1]<arr[mid]) && (mid==arr.length-1 || arr[mid+1]<arr[mid])){
            return mid;
        }
        
        else if(mid<arr.length-1 && arr[mid+1]>arr[mid]) return findPeakElements(mid+1,end,arr); 
        
          return findPeakElements(start,mid-1,arr);
        
    }
    
    /*
    
     public int findPeakElement(int[] nums) {
        int start=0;
        int end = nums.length-1;
        while(start<end){
            int mid = (start+end)/2;
            if(nums[mid+1]<nums[mid]){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
    
    */
    
}
