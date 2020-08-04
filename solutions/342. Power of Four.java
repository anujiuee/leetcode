class Solution {
    public boolean isPowerOfFour(int num) {
        
        if(num==0 || num==Integer.MIN_VALUE || num<0) return false;
        
        if(num==1) return true;
                
        if((num & (num-1))!=0) return false;
        
        int count =0;
        
        while(num!=0){
            num= num>>1;
            count++;
        }
        
        if(count%2!=0) return true;
        return false;
        
        //return (num > 0) && ((num & (num - 1)) == 0) && (num % 3 == 1);
        
    }
}
