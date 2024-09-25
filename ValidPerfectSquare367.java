public class ValidPerfectSquare367 {
    public static boolean isPerfectSquare(int num) {
        if(num==1) return true;
        int start=1,end=num-1;
        while(start<=end){
            int mid=(start+end)/2;
            long sq=(long)mid*mid;
            if(sq==num){
                return true;
            }
            else if(sq<num){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(14));
    }
}
