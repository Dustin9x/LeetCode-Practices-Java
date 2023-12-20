public class _701_InsertIntoABinarySearchTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode insertIntoBST(TreeNode root, int value) {
        if(root == null){
            return new TreeNode(value);
        }

        if(value < root.val){
            root.left = insertIntoBST(root.left,value);
        }else{
            root.right = insertIntoBST(root.right,value);
        }
        return root;
    }
}
