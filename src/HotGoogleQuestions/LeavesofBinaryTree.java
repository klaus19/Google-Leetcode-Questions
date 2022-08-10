package HotGoogleQuestions;


import java.util.ArrayList;
import java.util.List;

// Find Leaves of Binary Tre
class LeavesofBinaryTree {

    public List<List<Integer>>findLeaves(TreeNode root){
        List<List<Integer>>result = new ArrayList<>();

        getHeight(root,result);
        return result;
    }

    private int getHeight(TreeNode node,List<List<Integer>>result){

        //Base case
        if (node==null){
            return -1;
        }

        int height = Math.max(getHeight(node.left,result),getHeight(node.right,result))+1;

        if (result.size()==height){

            result.add(new ArrayList<>());
        }

        result.get(height).add(node.val);

        return height;

    }

}
