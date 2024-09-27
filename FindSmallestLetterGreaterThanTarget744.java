public class FindSmallestLetterGreaterThanTarget744 {
    public static char nextGreatestLetter(char[] letters, char target) {
        int start=0,end=letters.length-1;
        char ans=letters[0];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(letters[mid]>target){
                ans=letters[mid];
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        System.out.println(nextGreatestLetter(letters, 'a'));
    }
}
