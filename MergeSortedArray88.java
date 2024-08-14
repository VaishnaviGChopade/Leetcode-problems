import java.util.Arrays;

public class MergeSortedArray88 {
    
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
      
     int i=m;
     while(i<m+n){
        for(int j=0;j<n;j++){
            nums1[i]=nums2[j];
            i++;
        } 
     }
     Arrays.sort(nums1);
     for(int k=0;k<nums1.length;k++){
        System.out.print(nums1[k] +" ");
     }
     
    }
    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};
        int m=3,n=3;
        merge(nums1,m,nums2,n);

    }
}

