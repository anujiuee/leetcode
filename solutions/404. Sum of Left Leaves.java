/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    int sum =0;
    public int sumOfLeftLeaves(TreeNode root) {
         sumOfLeftLeaves(root,false);
        
        return sum;
    }
    
    
     public void sumOfLeftLeaves(TreeNode root,Boolean isLeft){
         
         if(root==null) return ;
         
         if(root.left==null && root.right==null){
             if(isLeft) sum+=root.val;
         }
         
         
          sumOfLeftLeaves(root.left,true);
          sumOfLeftLeaves(root.right,false);
         
    }
    
    
}
