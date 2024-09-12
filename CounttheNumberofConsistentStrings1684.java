public class CounttheNumberofConsistentStrings1684 {
    public static int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        int flag=0;
        for(int i=0;i<words.length;i++){
            flag=0;
            for(int j=0;j<words[i].length();j++){
                if(allowed.indexOf(words[i].charAt(j))==-1) flag=1;
            }
            if(flag==0) count++;
            
        }
        return count;
    } 
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};
        System.out.println(countConsistentStrings(allowed, words));

    }
}
