import java.util.Stack;

public class EvaluateReversePolishNotation150 {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> s= new Stack<>();
        String op="+-/*";
        int res=0;
        for(int i=0;i<tokens.length;i++){
            
                
            if(!s.empty() && op.indexOf(tokens[i])>-1){
                int d2=s.pop();
                int d1=s.pop();
                if(tokens[i].equals("+")){
                     res=d1+d2;
                    
                }
                if(tokens[i].equals("*")){
                     res=d1*d2;
                 
                }
                if(tokens[i].equals("/")){
                     res=d1/d2;
                    
                }
                if(tokens[i].equals("-")){
                     res=d1-d2;
                    
                }
                s.push(res);
            }else{
                s.push(Integer.parseInt(tokens[i]));
            }
            }
            
            
           
        
      
        return s.pop();   
    }
    public static void main(String[] args) {
        String[] tokens={"2","1","+","3","*"};
        int res=evalRPN(tokens);
        System.out.print(res);
    }
}
