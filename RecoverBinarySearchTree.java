
class Solution {
    private TreeNode prev = new TreeNode(0), first = null, second = null;
    private void fromInorder(TreeNode root){
        if(root == null) return;
        if(root!=null){
            fromInorder(root.left);
            if(first == null && root.val < prev.val){
                first = prev;
            }
            if(first != null && root.val < prev.val){
                second = root;
            }
            prev = root;
            fromInorder(root.right);
        }
    }
    public void swap(TreeNode first, TreeNode second){
        first.val = first.val + second.val;
        second.val = first.val - second.val;
        first.val = first.val - second.val;
    }
    public void recoverTree(TreeNode root) {
        fromInorder(root);
        swap(first,second);
    }
}

public class RecoverBinarySearchTree {
    public static void main(String[] args) {
        
    }
}
