import java.util.Arrays;

public class _3SumClosest16 {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int minsum=nums[0]+nums[1]+nums[2],sum=0;
        int j=0,k=nums.length-1;
        for(int i=0;i<nums.length-2;i++){
            j=i+1;
            k=nums.length-1;
            while(j<k){
              sum=nums[i]+nums[j]+nums[k];
              if(sum==target) return target;
             if (Math.abs(sum - target) < Math.abs(minsum - target)) {
                    minsum = sum;
                }
              if(sum<target){
              j++;
              }
              else{
              k--;
              }
            }
        }
        return minsum;
    }
    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        int target=1;
        int ans=threeSumClosest(nums, target);
        System.out.println(ans);
    }
}
