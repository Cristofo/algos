package algos;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class IsSimetricTree {

    public static void main(String[] args) {

    }


    public static boolean isSymmetricStackSol(TreeNode root) {
        Stack<TreeNode> leftSide =  new Stack<>();
        Stack<TreeNode> rightSide = new Stack<>();

        leftSide.add(root);
        rightSide.add(root);
        TreeNode nodeL;
        TreeNode nodeR;
        
        while(!leftSide.isEmpty() && !rightSide.isEmpty()) {

            nodeL = leftSide.pop();
            nodeR = rightSide.pop();

            if (nodeL != null && nodeR != null) {
                if (nodeL.val != nodeR.val) return false;

                    leftSide.add(nodeL.left);
                    rightSide.add(nodeR.right);
                    leftSide.add(nodeL.right);
                    rightSide.add(nodeR.left);
            } else if (nodeL == null && nodeR == null) {
                continue;
            }else{
                return false;
            }
        }
        return true;
    }

    public static boolean isSymmetricQueueSol(TreeNode root) {

        Queue<TreeNode> leftQueue = new LinkedList<>();
        Queue<TreeNode> rightQueue = new LinkedList<>();

        leftQueue.offer(root.left);
        rightQueue.offer(root.right);

        while(!leftQueue.isEmpty() && rightQueue.isEmpty()){
            TreeNode leftNode = leftQueue.poll();
            TreeNode rightNode = rightQueue.poll();

            if(leftNode != null && rightNode != null) {
                if(leftNode.val != rightNode.val) return false;
                leftQueue.offer(leftNode.left);
                leftQueue.offer(leftNode.right);
                rightQueue.offer(rightNode.right);
                rightQueue.offer(rightNode.left);

            } else if (leftNode == null && rightNode == null) {
                continue;
            }else {
                return false;
            }

        }
        return true;
    }


    public boolean isSymetricRec(TreeNode root){
        return isMirror(root, root);
    }

    public static boolean isMirror(TreeNode node1, TreeNode node2){

        if(node1 == null && node2 == null) return true;
        if(node1 == null || node2 == null) return false;

       return  (node1.val == node2.val)
                && isMirror(node1.left, node2.right)
                    && isMirror(node1.right, node2.left);
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
