/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> ans = new ArrayList();
        List<Integer> arr = new ArrayList();
        pathSum(root,sum,ans,arr);
        return ans;
    }
    
     public void pathSum(TreeNode root, int sum,List<List<Integer>> ans,List<Integer> arr){
         
       if(root==null) return ;
       arr.add(root.val);  
         
       if (root.val==sum && root.left==null && root.right==null){
          List<Integer> clone = new ArrayList(arr);
          ans.add(clone);
       } 
         
       pathSum(root.left,sum-root.val,ans,arr);
       pathSum(root.right,sum-root.val,ans,arr);
           
       arr.remove(arr.size()-1); 
     }
}
