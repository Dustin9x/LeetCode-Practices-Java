public class _606_ConstructStringFromBinaryTree {

    public static class TreeNode {
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
    public static String tree2str(TreeNode root) {

        if (root == null) return "";

        StringBuilder res = new StringBuilder();
        res.append(root.val);

        String left = tree2str(root.left);
        String right = tree2str(root.right);

        if(root.left !=null){
            res.append("(").append(left).append(")");
        }
        if(root.left == null && root.right !=null){
            res.append("()");
        }
        if(root.right !=null){
            res.append("(").append(right).append(")");
        }

        return res.toString();
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        n1.left=n2;
        n1.right=n3;
        n2.left=n4;
        System.out.println(tree2str(n1));
    }
}
