public class _437_PathSumIII {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    int count = 0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) return 0;
        dfs(root, targetSum);
        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);
        return count;
    }

    public void dfs(TreeNode node, long target){
        if(node == null) return;
        if(node.val == target) count++;
        dfs(node.left, target-node.val);
        dfs(node.right, target-node.val);
    }
}
