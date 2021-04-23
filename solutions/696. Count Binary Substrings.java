class Solution {
    public int countBinarySubstrings(String s) {
     
        int n = s.length();
                
        List<Integer> list = new ArrayList();
        
        int count = 1;
        Character ch = s.charAt(0);
        
        int ans =0;
        
        for (int i=1;i<n;i++){
            if(s.charAt(i)==ch) count++;
            else {
                ch = s.charAt(i);
                list.add(count);
                //System.out.println(count);
                count = 1;
            }
        }
        //System.out.println(count);
        list.add(count);
        
         for (int i=1;i<list.size();i++){
            ans+=Math.min(list.get(i),list.get(i-1));
        }
        
        
        return ans;
        
        
        
    }
}
