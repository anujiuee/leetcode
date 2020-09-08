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
    public int sumRootToLeaf(TreeNode root) {
   
     return dfs(root,0);
    }
    
    public int dfs(TreeNode root ,int sum) {
        
      sum = sum * 2 + root.val;
        if (root.left == null && root.right == null) return sum;
        int l = root.left == null ? 0 :dfs(root.left, sum);
        int r = root.right == null ? 0 :dfs(root.right, sum);
        return l + r;
        
    }
    
}
