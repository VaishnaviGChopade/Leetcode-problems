public class LongestPalindromicSubstring5 {
    public static String longestPalindrome(String s) {
        if(s.length()==0) return "";
        if(s.length()==1) return s;
        if(isPalindrome(s)) return s;
        String ans="";
        int length=0;
        for(int i=0;i<s.length()-1;i++){
            for(int j=i;j<s.length();j++){
                String subStr = s.substring(i, j + 1);
                if (isPalindrome(subStr)) {
                    if (subStr.length() > length) {
                        ans = subStr;
                        length = subStr.length();
                    }
                }
            
        }
        }
        return ans;
    }
    public static boolean isPalindrome(String str){
        int i=0,j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "babad";
        String ans=longestPalindrome(s);
        System.out.println(ans);
    }
}
