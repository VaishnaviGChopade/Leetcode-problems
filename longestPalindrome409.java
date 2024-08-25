import java.util.HashMap;
import java.util.Map;

public class longestPalindrome409 {
    public static int longestPalindrome(String s) {
        int n=s.length();
        Map<Character,Integer> count=new HashMap<>();
        for(int i=0;i<n;i++){
             if(count.containsKey(s.charAt(i))){
                count.put(s.charAt(i),count.get(s.charAt(i))+1);
             }
             else{
                count.put(s.charAt(i),1);
             }
        }
        
        int length=0;
        int odd=0;
        for(Map.Entry<Character,Integer> map : count.entrySet()){
            if(map.getValue()%2==1){
                odd=1;
                length+=map.getValue()-1;
            }
            else{
                length+=map.getValue();
               
            }
        }
        if(odd==1) return length+1;
        return length;
         
    }
    public static void main(String[] args) {
        String s="abccccdd";
        int res = longestPalindrome(s);
        System.out.print(res);
    }
}
