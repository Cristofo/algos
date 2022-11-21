package algos;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTra {

/**Given the root of a binary tree, return the inorder traversal of its nodes' values.
 *
 * Inorder means that the node is in the middle
 * and the way to get the leaves is left-Node-right
 * */

    public static void main(String[] args) {

        TreeNode root =  new TreeNode();
        root.val = 4;
        TreeNode nodeB =  new TreeNode();
        nodeB.val = 5;
        TreeNode nodeC =  new TreeNode();
        nodeC.val = 6;
        root.left = nodeB;
        root.right = nodeC;
        TreeNode nodeD =  new TreeNode();
        nodeD.val = 7;
        TreeNode nodeE =  new TreeNode();
        nodeE.val = 8;
        nodeB.left = nodeD;
        nodeB.right = nodeE;
        TreeNode nodeF =  new TreeNode();
        nodeF.val = 9;
        nodeC.left = nodeF;

        //inorderTraversal(root);

        //recursively
        //List<Integer> list = inorderTraversalRecursive(root);


        //preorderTraversal(root);
        //List<Integer> list = preorderTraversalRecursive(root);

        //postorderTraversal(root);

        postorderTraversalRecursive(root);
    }

   public static List<Integer> preorderTraversal(TreeNode root) {

        if(root == null){
            return null;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        List<Integer> list = new ArrayList<>();

        while(!stack.isEmpty()){ // while the node is not null OR while the stack is not empty

            TreeNode myNode = stack.pop(); // we get the first node from the stack
            list.add(myNode.val); // adding the first node

            // we add the right child first to the stack and then the left one, so left is processed first
            if(myNode.right != null) stack.push(myNode.right);
            if(myNode.left != null) stack.push(myNode.left);
        }

        return list;
    }

    public static List<Integer> preorderTraversalRecursive(TreeNode root) {
        return rfuncPreOrder(root, new ArrayList());
    }

    public static List<Integer> rfuncPreOrder(TreeNode root, List list) {

        if(root == null) return list; // if root is null return list

        list.add(root.val); // we add the node, then the left child and then the right
        list = rfuncPreOrder(root.left, list);// we go to the left
        return rfuncPreOrder(root.right, list);// here we go to the right node recursively

    }


    public static List<Integer> inorderTraversal(TreeNode root) {

        Stack<TreeNode> stackOne = new Stack<>();
        List<Integer> list = new ArrayList<>();

        while(root != null || !stackOne.isEmpty()){ // while the node is not null OR while the stack is not empty
            while(root != null){ // this while is to go to the left part according to the inOrder
                stackOne.push(root); // I add the current Node to the stack while I'm going through the left side of the tree
                root = root.left;
            }
            root = stackOne.pop(); // when is no more left I remove this value from the stack
            list.add(root.val); // I add the value to the list with the inorder results
            root = root.right; // we go to the right node

            //If root is null it means there are no more nodes at the left side, so it removes the nodes from the stack,
            // adds it to the list and go for the right node in case we have more
        }

        return list;
    }

    public static List<Integer> inorderTraversalRecursive(TreeNode root) {
        return inorderrfunc(root, new ArrayList());
    }

    public static List<Integer> inorderrfunc(TreeNode root, List list) {

        if(root == null) return list; // if root is null return list

        list = inorderrfunc(root.left, list);// we go to the left
        list.add(root.val); // we add the last node to the left to our list
        return inorderrfunc(root.right, list);// here we go to the right node recursively

    }


    public static List<Integer> postorderTraversal(TreeNode root) {

        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        stack.add(root);
        while(!stack.isEmpty()){ // while the node is not null OR while the stack is not empty
           TreeNode top = stack.pop();
            list.add(0,top.val); // we add the element at the index 0 so it order in the right order
            if(top.left != null) stack.add(top.left);// we add left first so is processed last in the stack so it will be showed first
            if(top.right != null) stack.add(top.right);// we add right on the top so is processed first and showed last if we add it to the list
        }
        return list;
    }

    public static List<Integer> postorderTraversalRecursive(TreeNode root) {
        return postTrfunc(root, new ArrayList());
    }

    public static List<Integer> postTrfunc(TreeNode root, List list) {

        if(root == null) return list; // if root is null return list

        list = postTrfunc(root.left, list);// we go to the most left child
        list = postTrfunc(root.right, list);// we go to the right child
        list.add(root.val); // we add the Node to the list
        return list;

    }

    public static class TreeNode {
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
}
