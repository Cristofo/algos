package algos;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MaxDepth {


    public static void main(String[] args) {
    TreeNode root =  new TreeNode();
        root.val = 3;
        TreeNode nodeB =  new TreeNode();
        nodeB.val = 9;
        TreeNode nodeC =  new TreeNode();
        nodeC.val = 20;
        root.left = nodeB;
        root.right = nodeC;
        TreeNode nodeD =  new TreeNode();
        nodeD.val = 15;
        TreeNode nodeE =  new TreeNode();
        nodeE.val = 7;
        nodeC.left = nodeD;
        nodeC.right = nodeE;
        //System.out.println(maxDepth(root));
        System.out.println(maxDepthRecursive(root));
    }


    public static int maxDepth(TreeNode root) {

            if(root == null){
                return 0;
            }

        Stack<TreeNode> stack = new Stack<>();
            Stack<Integer> depths = new Stack<>();
        stack.add(root);
        depths.add(1);

        int depth = 0;

        while(!stack.isEmpty()){
            TreeNode myNode = stack.pop(); // we get the first node from the stack
            int currentDepth = depths.pop();// we get the last depth obtained

            if(myNode != null){
                depth = Math.max(depth, currentDepth); // when myNode is not null then we get the max
                stack.add(myNode.right);
                depths.add(currentDepth+1);
                stack.add(myNode.left);
                depths.add(currentDepth+1);

            }

        }

        return depth;

    }

    public static int maxDepthRecursive(TreeNode root){

        if(root == null){
            return 0;
        }
       int intLeft = maxDepthRecursive(root.left);
       int intRight = maxDepthRecursive(root.right);

       return Math.max(intLeft, intRight) +1;

    }




    private static class TreeNode {
        TreeNode right;
        TreeNode left;
        int val;

        public TreeNode(){}

        public TreeNode(TreeNode right, TreeNode left, int val) {
            this.right = right;
            this.left = left;
            this.val = val;
        }
    }
}
