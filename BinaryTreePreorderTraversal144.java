import java.util.ArrayList;
import java.util.List;
 class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
        
         TreeNode(int val) { this.val = val; }
}
public class BinaryTreePreorderTraversal144 {
     public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        preorder(root,res);
        return res;
        
    }
    public static void preorder(TreeNode root,List<Integer> res){
        if(root==null) return;
        res.add(root.val);
        preorder(root.left,res);
        preorder(root.right,res);
        
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.right.left=new TreeNode(4);
        List<Integer> res=preorderTraversal(root);
        for(int i=0;i<res.size();i++){
            System.out.print(res.get(i)+" ");
        }
    }
}
