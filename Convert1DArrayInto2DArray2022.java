public class Convert1DArrayInto2DArray2022 {
    public static int[][] construct2DArray(int[] original,int m, int n){
             if(m*n!=original.length) return new int[0][0];
             int[][] ans=new int[m][n];
             int idx=0; 
             for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                  ans[i][j]=original[idx];
                  idx++;
                }

            }
            return ans;
    }
    public static void main(String[] args) {
        int[] original={2,3,4,5,5,6};
        int ans[][]=construct2DArray(original, 2, 3);
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
