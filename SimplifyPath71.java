import java.util.Stack;

public class SimplifyPath71 {
    public static String simplifyPath(String path) {
        Stack<String> s=new Stack<>();
        StringBuilder sb=new StringBuilder("");
        String[] arr=path.split("/");
        for(int i=0;i<arr.length;i++){
            if(!s.empty() && arr[i].equals("..")) s.pop();
            if(!arr[i].equals("..") && !arr[i].equals(".") && !arr[i].equals("")) s.push(arr[i]);

        }
        if(s.empty()) return "/";
        while(!s.empty()){
            
            sb.insert(0,s.pop());
            sb.insert(0,"/");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s= "/home/user/Documents/../Pictures";
        String ans=simplifyPath(s);
        System.out.println(ans);
    } 
}
