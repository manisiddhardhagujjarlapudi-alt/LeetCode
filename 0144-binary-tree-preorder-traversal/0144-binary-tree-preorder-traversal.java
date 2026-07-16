
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        travel(root,ans);
        return ans;
    }
    public void travel(TreeNode root, List<Integer> ans ){
        if(root == null) return;
        ans.add(root.val);
        travel(root.left,ans);
        travel(root.right,ans);
    }
}