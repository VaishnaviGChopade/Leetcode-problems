public class XORQueriesofaSubarray1310 {
    public static int[] xorQueries(int[] arr, int[][] queries) {
        
        int[] res=new int[queries.length];
        
                for(int i=0;i<queries.length;i++){
                          int n1=queries[i][0],n2=queries[i][1];
                          for(int j=n1;j<=n2;j++){
                          res[i]^=arr[j];
                          }
                }
                return res;
            }
            public static void main(String[] args) {
                int[] arr = {1,3,4,8};
                int[][] queries = {{0,1},{1,2},{0,3},{3,3}};
                int res[]=xorQueries(arr,queries);
                for(int i=0;i<res.length;i++){
                    System.out.print(res[i]+" ");
                }
            }
}
