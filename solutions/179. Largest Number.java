class Solution {
    public String largestNumber(int[] nums) {
        
       List<String> arr = new ArrayList<>();
        
        for (int i=0;i<nums.length;i++){
            arr.add(String.valueOf(nums[i]));
        }
        
        Collections.sort(arr,(x,y) ->(y+x).compareTo(x+y));
        
        StringBuilder s = new StringBuilder();
        
        for (int i=0;i<nums.length;i++){
            s.append(arr.get(i));
        }
        
        if(s.charAt(0) == '0') return "0";
        
        return s.toString();
    }
}
