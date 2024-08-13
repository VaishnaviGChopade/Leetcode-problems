import java.util.LinkedList;
import java.util.Queue;
class TreeNode{
    TreeNode node,left,right;
    int val;
    TreeNode(int val){
         this.val=val;
    }
}
public class InvertBinaryTree226 {
    public static TreeNode invertTree(TreeNode root) {
        if(root==null) return null;
        if(root.left==null && root.right==null) return root;
        Queue<TreeNode> nodes=new LinkedList<>();
        nodes.add(root);
        while(!nodes.isEmpty()){
          TreeNode curr=nodes.remove();
        //   if(curr.left!=null && curr.right!=null){
          TreeNode temp=curr.left;
          curr.left=curr.right;
          curr.right=temp;

          if(curr.left!=null) nodes.add(curr.left);
          if(curr.right!=null) nodes.add(curr.right);
        //   }
        }
        return root;
    }
    public static void leveltraversal(TreeNode res){
        if(res==null) return;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(res);
        while(!q.isEmpty()){
           TreeNode curr=q.remove();
           System.out.print(curr.val+" ");
           if (curr.left != null) q.add(curr.left);
           if (curr.right != null) q.add(curr.right);
        }
        
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(4);
        root.left=new TreeNode(2);
        root.right=new TreeNode(7);
        root.left.left=new TreeNode(1);
        root.left.right=new TreeNode(3);

        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(9);
        
        TreeNode ans=invertTree(root);
        leveltraversal(ans);


    }
}

