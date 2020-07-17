class Solution {
    public int combinationSum4(int[] coins, int amount) {
         int[] temp=new int[amount+1];
        temp[0]=1;
        
        for(int i=1;i<=amount;i++){
            
          for(int j=0;j<coins.length;j++){
            
            if(i>=coins[j]){
               temp[i]= temp[i-coins[j]]+temp[i];
            }
            
        }   
            
        }
        
        return temp[amount];
    }
}