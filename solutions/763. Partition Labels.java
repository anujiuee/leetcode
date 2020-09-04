class Solution {
    public List<Integer> partitionLabels(String S) {
        
        int n = S.length();
        
        HashMap<Character,Integer> map = new HashMap();
        
        for (int i=0;i<n;i++){
            map.put(S.charAt(i),i);
        }
        
        List<Integer> ans = new ArrayList();
        int max =0;
        int j = -1;
        
        for (int i=0;i<n;i++){
             int k = map.get(S.charAt(i));
             if(k>max) {max = k;}
             if (i==max) {ans.add(i-j);j=i;}
        }
        
        return ans;
        
    }
}
