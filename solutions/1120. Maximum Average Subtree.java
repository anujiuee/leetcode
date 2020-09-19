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
    
    class Sol{
        double sum;
        double count;
        
        public Sol(double sum , double count){
            this.sum=sum;
            this.count=count;
        }
    }
    
    double ans;
    
    public double maximumAverageSubtree(TreeNode root) {
        avg(root);
        return ans;
    }
    
    public Sol avg(TreeNode root){
        if(root==null) return new Sol(0,0);
        
        if(root.left==null && root.right==null){
            ans = Math.max(Double.valueOf(root.val),ans);
            return new Sol(root.val,1);
        } 
        
       Sol left = avg(root.left);
       Sol right = avg(root.right);
      
        
       double avg =  ((left.sum+right.sum+root.val)/(left.count+right.count+1));
       ans = Math.max(ans,avg); 
       return new Sol((left.sum+right.sum+root.val),(left.count+right.count+1));
        
    }
    
    
}
