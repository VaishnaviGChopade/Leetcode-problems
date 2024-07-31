public class PalindromeNumber9 {
    public static boolean isPalindrome(int x) {
        String s=String.valueOf(x);
        int i=0,j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n= -121;
        System.err.println(isPalindrome(n));
    }
}
