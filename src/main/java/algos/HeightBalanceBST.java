package algos;


import java.util.Stack;

public class HeightBalanceBST {

    public static void main(String[] args) {


        sortednumsToBST(new int[] {-10,-3,0,5,9});
    }

    public static TreeNode sortednumsToBST(int[] nums) {

        if (nums == null || nums.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(0);
        Stack<Object> stack = new Stack<>();
        stack.push(nums.length-1);
        stack.push(0);
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = (TreeNode)stack.pop();
            int begin = (int)stack.pop();
            int end = (int)stack.pop();
            int mid = begin + ((end - begin) >> 1);
            node.val = nums[mid];
            if (end > mid) {
                node.right = new TreeNode(0);
                stack.push(end);
                stack.push(mid+1);
                stack.push(node.right);
            }
            if (begin < mid) {
                node.left = new TreeNode(0);
                stack.push(mid-1);
                stack.push(begin);
                stack.push(node.left);
            }
        }
        return root;
    }

    private static class TreeNode {
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
