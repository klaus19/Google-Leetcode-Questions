package Trees;

import com.sun.source.tree.Tree;

public class IdenticalBinaryTrees {

    TreeNode root1,root2;

    public boolean identicalBinaryTrees(TreeNode b1, TreeNode b2){

        if (b1==null && b2==null)
            return false;


        if (b1!=null && b2!=null)
            return (b1.val== b2.val &&
                    identicalBinaryTrees(b1.left,b2.left) &&
                    identicalBinaryTrees(b1.right,b2.right));


          return false;


    }

    public static void main(String[] args) {
        IdenticalBinaryTrees ib = new IdenticalBinaryTrees();

        ib.root1 = new TreeNode(1);
        ib.root1.left = new TreeNode(2);
        ib.root1.right = new TreeNode(3);
        ib.root1.left.left = new TreeNode(4);
        ib.root1.right.right = new TreeNode(5);

        ib.root2 = new TreeNode(1);
        ib.root2.left = new TreeNode(2);
        ib.root2.right = new TreeNode(3);
        ib.root2.left.left = new TreeNode(4);
        ib.root2.right.right = new TreeNode(5);

        if(ib.identicalBinaryTrees(ib.root1,ib.root2))
            System.out.println("Both trees are identical");
        else
            System.out.println("Trees are not identical");
    }
}
