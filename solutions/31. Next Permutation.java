class Solution {
    public void nextPermutation(int[] nums) {
        
        int n = nums.length;
        
        if(n==0 || n==1) return ;
        int i =0;
        
        for ( i=n-1;i>=1;i--){
            if(nums[i]>nums[i-1]) break;
        }
        
        int m = i-1;
        
        if(m==-1){
             int a = 0; 
       
       int b = n-1;
        
        while(a<=b){
            swap(nums,a,b);
            a++;
            b--;
           }
            return ;
        }
        
         for ( i=n-1;i>=m+1;i--){
            if(nums[i]>nums[m])break;
        }
        
        int k = i;
        
        swap(nums,m,k);
            
       int a = m+1; 
       
       int b = n-1;
        
        while(a<=b){
            swap(nums,a,b);
            a++;
            b--;
        }
       
        
        
        return ;
    
    }
    
    public void swap (int arr [], int m, int n){
        int temp = arr[m];
        arr[m] = arr[n];
        arr[n] = temp;
    }
}
