import Study.Tree.TreeNode;

public class _100_SameTree {
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
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null || p.val != q.val) return false;
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }


    public static void main(String[] args) {
        TreeNode n0 = new TreeNode(1);
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(1);
        TreeNode n3 = new TreeNode(1);
        TreeNode n4 = new TreeNode(2);
        TreeNode n5 = new TreeNode(2);
        TreeNode n7 = new TreeNode();
        TreeNode n8 = new TreeNode();

//        n0.left = n1;
//        n0.right = n2;

//        n3.left = n4;
//        n3.right = n5;

        System.out.println(isSameTree(n7,n8));
    }
}
