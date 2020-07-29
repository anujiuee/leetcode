class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
        int result=0;
        for(int i: nums){
            if(map.get(i) == null){
                int left = map.containsKey(i-1)? map.get(i-1):0;
                int right = map.containsKey(i+1)?map.get(i+1):0;
                
                int count = left+right+1;
                
                map.put(i, count);
                result = Math.max(result, count);
                
                //This is to keep the boundary values of the sequences in sync
                map.put(i-left, count);
                map.put(i+right, count);
            }
        }
        
        return result;
    }
}
