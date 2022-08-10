package Trees;


//Getting height of Binary Tree
public class HeightOfBinaryTrees {

    public int getHeight(TreeNode node){
        if (node==null){
            return -1;
        }

        else {
            return Math.max(getHeight(node.left),getHeight(node.right))+1;
        }
    }
}
