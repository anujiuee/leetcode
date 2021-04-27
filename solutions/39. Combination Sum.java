class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Set<List<Integer>> result = new HashSet();
        
        List<Integer> curr = new ArrayList();
        
        combinationSum2(candidates,0,target,result,curr);
        
        return new ArrayList(result);
    }
    
    
    public void combinationSum2(int[] candidates,int i,int target,Set<List<Integer>> ans, List<Integer> curr) {
        
         
         if(target<0) return;
         
         if(i==candidates.length){
          if(target==0){
             List<Integer> curr1 = new ArrayList(curr);
             Collections.sort(curr1);
             ans.add(curr1);
         }
         return;
        }
         
         
        combinationSum2(candidates,i+1,target,ans,curr);
​
         curr.add(candidates[i]);
         
         combinationSum2(candidates,i,target-candidates[i],ans,curr);
         
         
         curr.remove(curr.size()-1);
         
​
         
         
    }
}
