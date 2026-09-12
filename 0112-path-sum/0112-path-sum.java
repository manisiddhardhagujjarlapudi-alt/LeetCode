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
class Solution {
    boolean flag = false;
    public boolean hasPathSum(TreeNode root, int t) {
        int sum = 0;
        travel(root,t,sum);
        return flag;
    }
    public void travel(TreeNode root, int t,int sum) {
        if(root == null) return;
        sum += root.val;
        if(root.left == null && root.right == null && sum == t ){
            flag = true;
            return;
        }
        travel(root.left,t,sum);
        travel(root.right,t,sum);
        sum -= root.val;
    }
}