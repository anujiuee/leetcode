class Solution {
    public int change(int amount, int[] coins) {
        int[] temp=new int[amount+1];
        temp[0]=1;
        
        for(int i=0;i<coins.length;i++){
            
          for(int j=1;j<=amount;j++){
            
            if(j>=coins[i]){
               temp[j]= temp[j-coins[i]]+temp[j];
            }
            
        }   
            
        }
        
        return temp[amount];
    }
}