import java.util.ArrayList;
import java.util.List;

public class IntersectionofTwoArraysII350 {
    public static int[] intersect(int[] nums1, int[] nums2) {
     List<Integer> l1=new ArrayList<>();
     List<Integer> l2=new ArrayList<>();
     for(int i=0;i<nums1.length;i++){
          l1.add(nums1[i]);
     }
     for(int i=0;i<nums2.length;i++){
          if(l1.contains(nums2[i])){
          l2.add(nums2[i]);
          l1.remove((Integer)nums2[i]); // or Integer.valueOf(nums2[i])    
          }
     }
      int ans[]=new int[l2.size()];
      for(int i=0;i<l2.size();i++){
        ans[i]=l2.get(i);
      }
      return ans;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int res[]=intersect(nums1, nums2);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
}
