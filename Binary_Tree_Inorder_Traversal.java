import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Inorder_Traversal {
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

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    public static void inorder(TreeNode node, List<Integer> result){
        if(node!=null){
            inorder(node.left, result);
            result.add(node.val);
            inorder(node.right, result);
        }
    }


    public static void main(String[] args) {
        // Create the tree
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        // Print inorder traversal
        System.out.println(inorderTraversal(root));  // Output: [1, 3, 2]
    }
}
