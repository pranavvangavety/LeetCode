public class Balanced_Binary_Tree {

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
    public static int height(TreeNode root){

        int leftheight;
        int rightheight;
        if(root == null){
            return 0;
        }
        leftheight = height(root.left);
        if(leftheight == -1){
            return -1;
        }
        rightheight = height(root.right);
        if(rightheight == -1){
            return -1;
        }
        if(Math.abs(leftheight - rightheight) > 1){
            return -1;
        }
        return Math.max(leftheight, rightheight)  + 1;
    }

    public static boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }
    public static void main(String[] args){

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);

        root.right.left = new TreeNode(4);
//        root.right.right = new TreeNode(3);

        System.out.println(isBalanced(root));
    }
}
