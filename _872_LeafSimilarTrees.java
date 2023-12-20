import java.util.ArrayList;
import java.util.List;

public class _872_LeafSimilarTrees {
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

    public void findTreeLeaf(TreeNode root, List<Integer> list){
        if(root == null) return;
        if(root.left == null && root.right == null){
            list.add(root.val);
            return;
        }

        findTreeLeaf(root.left,list);
        findTreeLeaf(root.right,list);
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        findTreeLeaf(root1,list1);
        findTreeLeaf(root2,list2);

        if(list1.size() != list2.size()) return false;
        for (int i = 0; i < list1.size(); i++) {
            if(!list1.get(i).equals(list2.get(i))){
                return false;
            }
        }
        return true;
    }
}
