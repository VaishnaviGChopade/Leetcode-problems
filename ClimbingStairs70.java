public class ClimbingStairs70 {
    public static int climbStairs(int n) {
        if(n==1 || n==0) return 1;
        int[] steps=new int[n];
        steps[0]=1;//steps for climbing one stair
        steps[1]=2;//for 2 stairs

        for(int i=2;i<n;i++){
            steps[i]=steps[i-1]+steps[i-2];
        }
        return steps[n-1];

        
    }
    public static void main(String[] args) {
        int res=climbStairs(3);
        System.out.println(res);
    }
}
