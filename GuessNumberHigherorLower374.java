public class GuessNumberHigherorLower374 {
    public static int guess(int mid){
        int picked=10;
        if(mid==picked) return 0;
        if(mid<picked) return 1;
        else return -1;
    }
    public static int guessNumber(int n) {
        int start=1,end=n;
        
        while(start<=end){
         
            int mid=start+(end-start)/2;
               int guessedn=guess(mid);
               if(guessedn==0) return mid;
               if(guessedn==1) start=mid+1;
               else end=mid-1;

        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(guessNumber(10));
    }
}
