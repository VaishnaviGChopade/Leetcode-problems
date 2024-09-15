public class SumofLeftLeaves404 {
    public static class TreeNode {
             int val;
             TreeNode left;
             TreeNode right;
             TreeNode() {}
             TreeNode(int val) { this.val = val; }
    }
    public static int sumOfLeftLeaves(TreeNode root) {
        return left(root);
    }
    public static int left(TreeNode root){
       
        if(root==null) return 0;
         int sum=0;
        if(root.left!=null && root.left.left==null && root.left.right==null)  sum=root.left.val;
        
        return sum+left(root.left)+left(root.right);
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);
        System.out.print(sumOfLeftLeaves(root));
    }
}
