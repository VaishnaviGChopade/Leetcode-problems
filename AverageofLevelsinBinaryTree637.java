import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         
         TreeNode(int val) { this.val = val; }
}
public class AverageofLevelsinBinaryTree637 {
     public static List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<Double> res=new ArrayList<>();
        q.add(root);
        q.add(null);
        while(q.peek()!=null){
            double sum=0;
            int nodes=0;
            while(q.peek()!=null){
                TreeNode node=q.poll();
                sum+=node.val;
                nodes++;
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);


            }
            q.poll();
            q.add(null);
            res.add(sum/nodes);
        }
        return res;

    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.left.left=new TreeNode(15);
        root.left.right=new TreeNode(7);
        List<Double> res=averageOfLevels(root);
        for (int i = 0; i < res.size(); i++) {
         System.out.print(res.get(i)+" ");   
        }
    }
}
