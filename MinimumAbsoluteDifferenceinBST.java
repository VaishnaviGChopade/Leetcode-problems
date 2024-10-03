import java.util.ArrayList;
import java.util.List;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val) {
     this.val=val;
    }
    
}
public class MinimumAbsoluteDifferenceinBST {
    public static int getMinimumDifference(TreeNode root) {
      List<Integer> res=new ArrayList<>();
      inorder(root,res);
      int mindiff=Integer.MAX_VALUE;
      for(int i=1;i<res.size();i++){
           mindiff=Math.min(mindiff,res.get(i)-res.get(i-1));
      }
      return mindiff;
    }
    public static void inorder(TreeNode root, List<Integer> res){
       if(root==null) return;
       inorder(root.left,res);
       res.add(root.val);
       inorder(root.right,res);
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(4);
        root.left=new TreeNode(2);
        root.right=new TreeNode(6);
        root.left.left=new TreeNode(1);
        root.left.right=new TreeNode(3);
        System.out.println(getMinimumDifference(root));

    }
}

//  List<Integer> l=new ArrayList<>();
//        Queue<TreeNode> q=new LinkedList<>();
//        q.add(root);
//        while(!q.isEmpty()){
//         TreeNode curr=q.poll();
//         l.add(curr.val);
//         if(curr.left!=null) q.add(curr.left);
//         if(curr.right!=null) q.add(curr.right);
//        } 
//        int mindiff=Integer.MAX_VALUE;
//        for(int i=0;i<l.size()-1;i++){
//           for(int j=i+1;j<l.size();j++){
//               mindiff=Math.min(mindiff,Math.abs(l.get(i)-l.get(j)));
//           }
//        }
//        return mindiff;

