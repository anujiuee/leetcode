
class Solution {
    
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        int leftcount;
        int count=1;
        TreeNode(int val){
            this.val=val;
        }
    }
    
    
    public List<Integer> countSmaller(int[] nums) {
        if(nums.length==0) return new ArrayList();
        List<Integer> ans = new ArrayList();
        TreeNode t = new TreeNode(nums[nums.length-1]);
        ans.add(0);
            
        for (int i=nums.length-2;i>=0;i--){
            
            ans.add(insert(t,nums[i]));
        }
      Collections.reverse(ans) ; 
     return ans;
    }
    
    public int insert (TreeNode a, int b){
        
        if(b==a.val){
            a.count++;
            return a.leftcount;
        }
        
        if(b<a.val){
            a.leftcount++;
            if(a.left==null){
                a.left=new TreeNode(b);
                return 0;
            }
            return insert(a.left,b);
        }
        
        if(a.right==null){
            a.right=new TreeNode(b);
            return a.leftcount+a.count;
        }
        return a.leftcount+a.count+insert(a.right,b);
        
        
    }
    
}