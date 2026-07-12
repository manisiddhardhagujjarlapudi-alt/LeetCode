class Solution {
    public TreeNode invertTree(TreeNode root) {
        travel(root);
        return root;
    }public void travel (TreeNode root) {
        if(root == null) return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
    }
    
}