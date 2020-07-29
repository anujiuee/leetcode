class Solution {
    
    List<List<Integer>> output;
    
    private void recurse(List<Integer> numbers, int index){
        if(index == numbers.size()){
            output.add(new ArrayList<Integer>(numbers));
        }
        for(int i=index;i<numbers.size();i++){
            Collections.swap(numbers,index,i);
            recurse(numbers,index+1);
            Collections.swap(numbers,i,index);
        }
    }
    
    public List<List<Integer>> permute(int[] nums) {
        if(nums.length == 0) return new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();
        for(int num: nums){
            numbers.add(num);
        }
        
        output = new ArrayList<>();
        recurse(numbers, 0);
        return output;
    }
}
