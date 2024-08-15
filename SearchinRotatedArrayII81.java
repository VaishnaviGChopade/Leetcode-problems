class SearchinRotatedSortedArrayII81{
public static boolean search(int[] nums, int target) {
    int low=0,high=nums.length-1,mid=0;
   while(low<=high){
       mid=(low+high)/2;
       if(nums[mid]==target) return true;
       if(nums[low]==nums[mid] && nums[high]==nums[mid]){
           low++;
           high--;
           continue;
       }
       if(nums[low]<=nums[mid]){
       if(target>=nums[low] && target<nums[mid]){
           high=mid-1;
       }
       else{
           low=mid+1;
       }
       }
       else{
           if(target>nums[mid] && target <=nums[high]){
               low=mid+1;
           }
           else{
               high=mid-1;
           }
       }
   }
   return false;
}
public static void main(String[] args) {
    int[] nums={2,5,6,0,0,1,2};
        int target=3;
        boolean ans=search(nums,target);
        System.out.print(ans);
}
}