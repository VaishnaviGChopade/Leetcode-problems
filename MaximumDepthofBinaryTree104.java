class Node {
    int data;
    Node left;
    Node right;
    
    Node(int data) {
        this.data = data;
    }
}
public class MaximumDepthofBinaryTree104 {
    public static int maxDepth(Node root) {
        
        if(root==null){
           return 0;
        }
        int left=1+maxDepth(root.left);
        int right=1+maxDepth(root.right);
        return Math.max(left,right);
        

    }
    public static void main(String[] args) {
        Node root=new Node(3);
        root.left=new Node(9);
        root.right=new Node(20);
        root.right.left=new Node(15);
        root.right.right=new Node(7);
        int depth=maxDepth(root);
        System.out.print(depth);
    }
}
