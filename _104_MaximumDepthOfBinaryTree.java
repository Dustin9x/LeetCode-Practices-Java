public class _104_MaximumDepthOfBinaryTree {

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
    public int maxDepth(TreeNode root) {
        //B1: dieu kien dung
        if(root == null) return 0;

        //B2: cong thuc de quy
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);

        int res = Math.max(leftHeight,rightHeight)+1; // +1 de tinh them root
        return res;
    }
}
