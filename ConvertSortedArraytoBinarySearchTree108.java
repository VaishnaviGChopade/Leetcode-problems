public class ConvertSortedArraytoBinarySearchTree108 {
    

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
 
    public static TreeNode sortedArrayToBST(int[] nums) {
        int length=nums.length;
        TreeNode res=createBST(nums,0,length-1);
        return res;
        
        }
        public static TreeNode createBST(int[] nums,int start, int end){
            if(start>end){
                return null;
            }
            int mid=(start+end)/2;
            TreeNode root=new TreeNode(nums[mid]);
            root.left=createBST(nums,start,mid-1);
            root.right=createBST(nums,mid+1,end);
            return root;
        }
        public static void preorder(TreeNode root){
            if(root==null){return; }
            preorder(root.left);
            System.out.print(root.val+" ");
            preorder(root.right);
        }
        public static void main(String[] args) {
           
            int[] nums={-10,-3,0,5,9};
            TreeNode root =sortedArrayToBST(nums);
            preorder(root);
           

        }
}
