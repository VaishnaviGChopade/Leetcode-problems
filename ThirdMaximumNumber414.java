import java.util.Arrays;

public  class ThirdMaximumNumber414{
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
       
        int count=1;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]!=nums[i-1]){
                count++;
            }
            if(count==3){
                return nums[i-1];
            }
        }
        return nums[nums.length-1];
    }
    public static void main(String[] args) {
        int nums[]={2,2,3,1};
        System.out.println(thirdMax(nums));
    }
}