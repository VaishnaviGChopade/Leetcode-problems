public class RemoveDuplicatesfromSortedArray26 {
    public static int removeDuplicates(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
           
             if(nums[i]!=nums[j]){
                 nums[j+1]=nums[i];
                 j++;
                
             }
           
        }
        return j+1;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int length=removeDuplicates(nums);
        System.out.println(length);
    }
}
