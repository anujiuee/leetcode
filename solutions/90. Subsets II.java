class Solution {
    Set<List<Integer>> result = new HashSet(); 
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        helper(nums, 0, new ArrayList());
        List<List<Integer>> resultList = new ArrayList();
        for(List<Integer> l : result)
            resultList.add(l);
        
        return resultList;
    }
    
    void helper(int[] nums, int index, List<Integer> list){
        
        if(index >= nums.length){
            List<Integer> temp = new ArrayList();
            temp.addAll(list);
            Collections.sort(temp);
            result.add(temp);
            return;
        }
        
        helper(nums, index+1, list);
        list.add(nums[index]);
        helper(nums, index+1, list);
        list.remove(list.size()-1);
    }
}
