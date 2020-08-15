class Solution {
    public int[] findPermutation(String s) {
        int n = s.length();
        
       List<Integer> arr = new ArrayList();
        
        int j = 1;
        
        Stack<Integer> stack = new Stack ();
        stack.push(j++);
        
        for (int i=0;i<n;i++){
            
            if(s.charAt(i)=='I'){
                while(!stack.isEmpty()){
                    arr.add(stack.pop());
                }
                
            }
            stack.push(j++);
        }
        
        while(!stack.isEmpty()){
                    arr.add(stack.pop());
                }
        int[] array = new int[arr.size()];
  for(int i = 0; i < arr.size(); i++) array[i] = arr.get(i);
        return array;
    }
}
