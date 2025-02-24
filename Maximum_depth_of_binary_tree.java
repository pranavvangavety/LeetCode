public class Maximum_depth_of_binary_tree {

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


    public static int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int leftdepth = maxDepth(root.left);
        int rightdepth = maxDepth(root.right);
        return(1+Math.max(leftdepth, rightdepth));
    }

    public static void main(String[] args){

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);

        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        System.out.println(maxDepth(root));
    }
}
