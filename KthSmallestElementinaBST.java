import java.util.Vector;
class Solution {
    public Vector<Integer> ans = new Vector<>();
    private void frominorder(TreeNode root){
        if(root != null){
            frominorder(root.left);
            ans.add(root.val);
            frominorder(root.right);
        }
    }
    public int kthSmallest(TreeNode root, int k) {
        frominorder(root);
        return ans.elementAt(k-1);
    }
}

public class KthSmallestElementinaBST {
    public static void main(String[] args) {
        
    }
}
