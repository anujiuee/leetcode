class Solution {
        public void traverse(int[] nums, int x, List<Integer> value, List<List<Integer>> result) {
        if (x == nums.length) {
            result.add(new ArrayList<>(value));
            return;
        }
        // Leave it...
        traverse(nums, x + 1, value, result);
        // Take it...
        value.add(nums[x]);
        traverse(nums, x + 1, value, result);
        value.remove(value.size() - 1);  
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        traverse(nums, 0, new ArrayList<>(), result);
        return result;
    }
}
