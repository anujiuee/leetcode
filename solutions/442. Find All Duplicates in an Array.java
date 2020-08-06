        
         for (int i=1;i<nums.length;i++){
             
             if(nums[i]>2*n) ans.add(i);
         }
             
             
             return ans;*/
        
        
        for (int i=0;i<nums.length;i++){
         if(Math.abs(nums[i])==n){
             if(nums[0]<0) ans.add(n);
             nums[0] = -nums[0];
             continue;
         }
            
         if(nums[Math.abs(nums[i])]<0){
              ans.add(Math.abs(nums[i]));
          }
           
         nums[Math.abs(nums[i])] = -nums[Math.abs(nums[i])];
          
            
        }
        
        return ans;
        
        /*
         for (int num : nums) {
            if (nums[Math.abs(num) - 1] < 0) { // seen before
                ans.add(Math.abs(num));
            }
            nums[Math.abs(num) - 1] *= -1;
        }
​
        return ans;
        */
        
    }
}
