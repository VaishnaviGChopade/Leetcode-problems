public class CountCompleteTreeNodes222 {
    static class TreeNode{
        TreeNode left,right;
        int val;
        TreeNode(int val){
            this.val=val;
            this.left=null;
            this.right=null;


        }
    }
    public static int countNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        int nodes=countNodes(root.left)+countNodes(root.right)+1;
        return nodes;
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
         root.left=new TreeNode(2);
         root.right=new TreeNode(3);
         root.left.left=new TreeNode(4);
         root.left.right=new TreeNode(5);
         root.right.left=new TreeNode(6);
         int nodes=countNodes(root);
         System.out.print(nodes);
    }
}
