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
    
    int ans=0;
    public int diameterOfBinaryTree(TreeNode root) {
        
        diameterOfBinaryTree1(root);
        return ans;
    }
    
     public int diameterOfBinaryTree1(TreeNode root) {
        
        if(root==null) return 0;
        
        
        
        int left = diameterOfBinaryTree1(root.left);
        int right = diameterOfBinaryTree1(root.right);
        
        ans=Math.max(left+right,ans);
        return Math.max(left,right)+1;
    }
    
}
