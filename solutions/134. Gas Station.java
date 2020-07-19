class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
       int  totalGas=0,index=0,require=0;
        for(int i=0;i<gas.length;i++){
           totalGas+=gas[i]-cost[i];   
            if(totalGas<0){
                require+=cost[i]-Math.abs(totalGas);
                index=i+1;
                totalGas=0;             
            }
        }
        
        return totalGas>=require?index:-1;
    }
}