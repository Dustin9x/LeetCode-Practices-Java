import com.sun.source.tree.Tree;

public class _450_DeleteNodeInABST {

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

    //tim node con trai ben cung cua root
    public TreeNode findLeftTreeNode(TreeNode root){
        if(root == null) return null;
        TreeNode lestMostNode = root;
        while(lestMostNode.left != null) lestMostNode = lestMostNode.left;
        return lestMostNode;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;
        if(key < root.val){
            root.left = deleteNode(root.left, key); // gan lai root cha
        } else if (key > root.val){
            root.right = deleteNode(root.right, key);
        } else{ //root.val == key => xac dinh duoc node can xoa
            //TH1: root la not leaf
            if(root.right == null && root.left == null){
                return null;
            }
            //TH2: chi co 1 node con ben trai hoac phai
            if(root.right == null && root.left != null){
                return root.left;
            }
            if(root.left == null && root.right != null){
                return root.right;
            }
            //TH3: co ca 2 node con ben trai va phai
            //Xoa node trai cung cua cay con ben phai
            TreeNode leftMostNode = findLeftTreeNode(root.right);
            root.val = leftMostNode.val;
            root.right = deleteNode(root.right,leftMostNode.val);
        }
        return root;
    }
}
