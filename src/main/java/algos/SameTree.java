package algos;

import java.util.Stack;

public class SameTree {

    public static void main(String[] args) {
        
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {



        if(p == null && q == null){
            return true;
        }

        Stack<TreeNode> stp = new Stack<>();
        Stack<TreeNode> stq = new Stack<>();
        stp.add(p);
        stq.add(q);



        while(!stp.isEmpty() && !stq.isEmpty()){
            if(stp.isEmpty() || stq.isEmpty()) return false;
            p = stp.pop();
            q = stq.pop();
            if(p == null && q == null) {
                continue;
            }
            if(p != null && q != null) {
                if (p.val != q.val) return false;
            }else{
                return false;
            }
            stp.add(p.right);
            stp.add(p.left);
            stq.add(q.right);
            stq.add(q.left);

        }

        return true;

    }

    public static boolean isSameTreeRec(TreeNode p, TreeNode q) {
        if(p==null && q==null)
            return true;
        if((p==null && q!=null )|| (p!=null && q==null))
            return false;

        if(p.val !=q.val)
            return false;
        boolean left = isSameTreeRec(p.left, q.left);
        boolean right = isSameTreeRec(p.right,q.right);

        return left && right;

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
