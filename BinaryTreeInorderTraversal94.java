import java.util.ArrayList;
import java.util.List;

class TreeNode{
    TreeNode left,right;
    int val;
    TreeNode(int val){
        this .val=val;
        this.left=null;
        this.right=null;
     }
}
public class BinaryTreeInorderTraversal94 {
    public static List<Integer> inorderTraversal(TreeNode root){
        List<Integer> res=new ArrayList<>();
        inorder(root,res);
        return res;
    }
   public static void inorder(TreeNode root, List<Integer> res){
    if(root==null) return;
    inorder(root.left,res);
    res.add(root.val);
    inorder(root.right,res);
   }

    public static void main(String args[]){
          TreeNode root=new TreeNode(1);
          root.right=new TreeNode(2);
          root.right.left=new TreeNode(3);
          List<Integer> res=inorderTraversal(root);
          for(int i=0;i<res.size();i++){
            System.out.print(res.get(i)+" ");
          }
    }
}
