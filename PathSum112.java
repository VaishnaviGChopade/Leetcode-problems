public class PathSum112 {
    static class TreeNode{
        TreeNode head,left,right;
        int val;
        TreeNode(int val){
            this.val=val;
           
            }
            
    }
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)  return false;
        if(root.left==null && root.right==null && root.val==targetSum) return true;
        if(hasPathSum(root.left,targetSum-root.val) || hasPathSum(root.right,targetSum-root.val)) return true;
        
        else return false;

    }
    public static void main(String[] args) {
        TreeNode head=new TreeNode(5);
        head.left=new TreeNode(4);
        head.right=new TreeNode(8);
        head.left.left=new TreeNode(11);
        head.left.left.right=new TreeNode(2);
        head.left.left.left=new TreeNode(7);
        head.right.left=new TreeNode(13);
        head.right.right=new TreeNode(4);
        boolean ans =hasPathSum(head,22);
        System.out.print(ans);
    }
}
