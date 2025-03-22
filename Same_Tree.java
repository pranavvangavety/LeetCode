public class Same_Tree {

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

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if( p == null && q == null){
            return true;
        }else if( p == null || q == null){
            return false;
        }else{
            if(p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right)){
                return true;
            }else{
                return false;
            }
        }
    }

    public static void main(String[] args){
        TreeNode p = new TreeNode(1);
        p.right = new TreeNode(3);
        p.left = new TreeNode(2);

        TreeNode q = new TreeNode(1);
        q.right = new TreeNode(3);
        q.left = new TreeNode(2);

        System.out.println(isSameTree(p,q));

    }

}
