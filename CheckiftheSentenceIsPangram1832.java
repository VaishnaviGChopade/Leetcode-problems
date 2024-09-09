public class CheckiftheSentenceIsPangram1832{
    public static boolean checkIfPangram(String sentence) {
        if(sentence.length()==0) return false;
        String abc="abcdefghijklmnopqrstuvwxyz";
    
        for(int i=0;i<26;i++){
            if(sentence.indexOf(abc.charAt(i))==-1) return false;
        }

        return true;
    }
    public static void main(String[] args) {
        String sentence="thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }
}