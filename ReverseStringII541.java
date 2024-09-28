public class ReverseStringII541 {
    public static String reverseStr(String s, int k) {
        
        char[] arr=s.toCharArray();
        int i=0;
        while(i<s.length()){
            int end=Math.min(i+k-1,arr.length-1);
             reverse(arr,i,end);
             i+=2*k;
            

        }
       return new String(arr);
        
    }
    public static void reverse(char[] arr, int start,int end) {
     while(start<=end){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        System.out.print(reverseStr("abcdefg", 2));
    }
}
