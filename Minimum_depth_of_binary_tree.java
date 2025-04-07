public class Minimum_depth_of_binary_tree {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) { this.val = val; }

    }

    public static int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        else if(root.left == null && root.right == null){
            return 1;
        }
        else if(root.left == null){
            return 1 + minDepth(root.right);
        }
        else if(root.right == null){
            return 1 + minDepth(root.left);
        }

        int leftdepth = minDepth(root.left);
        int rightdepth = minDepth(root.right);

        return 1 + Math.min(leftdepth, rightdepth);
    }


    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);

        System.out.println(minDepth(root));
    }
}
