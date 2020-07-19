/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Result{
    TreeNode node;
    int dist;
    Result(TreeNode node, int dist){
        this.node = node;
        this.dist = dist;
    }
}

class Solution {
    
    private Result dfs(TreeNode root){
        if(root == null) return new Result(root, 0);
        Result left = dfs(root.left);
        Result right = dfs(root.right);
        if(left.dist > right.dist) return new Result(left.node, left.dist+1);
        if(left.dist < right.dist) return new Result(right.node, right.dist+1);
        return new Result(root,left.dist+1);
    }

    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        return dfs(root).node;
    }
}