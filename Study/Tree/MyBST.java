package Study.Tree;

public class MyBST {
    public TreeNode mRoot;
    public MyBST(){

    }

    public TreeNode insert (TreeNode root, int value){
        TreeNode newNode = new TreeNode(value);
        //TH1: root == null
        if(root == null){
            root = new TreeNode(value);
            return root;
        }else{
            TreeNode temp = root; //tao temp tro vao root
            while(true){
                if(value > temp.val){
                    if(temp.right == null){
                        temp.right = new TreeNode(value);
                        break;
                    } else{
                        temp = temp.right;
                    }
                }else{
                    if(temp.left == null){
                        temp.left = newNode;
                        break;
                    } else{
                        temp = temp.left;
                    }
                }
            }
            return root;
        }
    }

    // In Node -> L -> R
    public void PreOrder(TreeNode currentNode){
        if(currentNode == null) return;
        //Duyet currentNode truoc
        System.out.print(currentNode.val+ " ");

        //Duyet ben trai | Duyet ben phai
        PreOrder(currentNode.left);
        PreOrder(currentNode.right);
    }

    // In L -> Node -> R
    public void InOrder(TreeNode currentNode){
        if(currentNode == null) return;

        //Duyet ben trai
        InOrder(currentNode.left);

        //Duyet currentNode
        System.out.print(currentNode.val+ " ");

        //Duyet ben phai
        InOrder(currentNode.right);
    }

    // In L -> R -> Node
    public void PostOrder(TreeNode currentNode){
        if(currentNode == null) return;

        //Duyet ben trai
        PostOrder(currentNode.left);

        //Duyet ben phai
        PostOrder(currentNode.right);

        //Duyet currentNode
        System.out.print(currentNode.val+ " ");
    }
}
