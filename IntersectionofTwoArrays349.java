import java.util.HashSet;
import java.util.Set;

public class IntersectionofTwoArrays349 {
     public static int[] intersection(int[] nums1, int[] nums2) {
       Set<Integer> s=new HashSet<>();
          Set<Integer> ans=new HashSet<>();
       boolean t=true;
       int length=0;
       if(nums1.length<nums2.length){
        length=nums1.length;
        
       }
       else{
        length=nums2.length;
        t=false;
       }

       
       if(t==false){
        for(int i=0;i<nums1.length;i++){
        s.add(nums1[i]);
       }
      
       for(int i=0;i<nums2.length;i++){
        
        if(s.contains(nums2[i])){
           ans.add(nums2[i]);
        }
       }
     
       }
       else{
        for(int i=0;i<nums2.length;i++){
        s.add(nums2[i]);
       }
      
        for(int i=0;i<nums1.length;i++){
        if(s.contains(nums1[i])){
            ans.add(nums1[i]);
        }
        }
       }
 int[] res=new int[ans.size()];
 int it=0;
 for(int k : ans){
    res[it]=k;
    it++;

 }

       
 return res;

    }
    public static void main(String[] args) {
       int[] nums1 = {1,2,2,1};
       int[] nums2 = {2,2};
       int [] res=intersection(nums1, nums2);
       for(int e : res)
       System.out.println(e+" ");
    }
}


// Set<Integer> set1 = new HashSet<>();
//         Set<Integer> set2 = new HashSet<>();
//         List<Integer> result = new ArrayList<>();

//         for (int num : nums1) {
//             set1.add(num);
//         }
//         for (int num : nums2) {
//             if (set1.contains(num)) {
//                 set2.add(num);
//             }
//         }

//         int[] resArray = new int[set2.size()];
//         int index = 0;
//         for (int num : set2) {
//             resArray[index++] = num;
//         }
//         return resArray;