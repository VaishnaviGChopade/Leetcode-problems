public class Sqrt69 {
   
        public static  int mySqrt(int x) {
            long start = 1;
            long end = x;
    
            while(start <= end){
    
                long mid = start + (end - start)/2 ;
    
                if((mid * mid) == x ) return (int)mid;
                else if(x < (mid * mid)) end = mid - 1
                ;
                else start = mid + 1 ;
            }  
            return (int)end;  
        }
public static void main(String[] args) {
    System.err.println(mySqrt(2025));
}

    }

