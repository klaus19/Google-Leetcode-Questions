package Trees;

//Given a binary tree, determine if it is height-balanced.

public class BalancedBinaryTree {
    boolean ret=true;
    public boolean isBalanced(TreeNode node){

        height(node);
        return ret;
    }

    private int height(TreeNode node) {

        if (node==null){
            return 0;
        }

        int lh = 1+height(node.left);
        int rh = 1+height(node.right);

        if (Math.abs(lh-rh)>1){
            ret=false;
        }

        return Math.max(lh,rh);
    }


    //Another Bottom up approach
    public boolean isBalanced1(TreeNode root) {
        return getHeight(root) != -1;
    }

    private int getHeight(TreeNode node) {
        if (node == null) return 0;

        int left = getHeight(node.left);
        int right = getHeight(node.right);

        // left, right subtree is unbalanced or cur tree is unbalanced
        if (left == -1 || right == -1 || Math.abs(left - right) > 1) return -1;

        return Math.max(left, right) + 1;
    }
}
