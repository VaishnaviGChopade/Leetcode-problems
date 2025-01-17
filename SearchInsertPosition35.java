class searchInsertPosition35 {
    public static int searchInsert(int[] nums, int target) {
        int start=0,mid=0,end=nums.length-1;

        while(start<=end){
            mid=(start+end)/2;
            if(nums[mid]==target) return mid;
            if(nums[mid]<target){
                  start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
      
        return start;
    }
    public static void main(String[] args) {
        int []nums = {1,3,5,6};
        int target=5;
        System.out.print(searchInsert(nums,target));
    }
}