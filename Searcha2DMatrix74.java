public class Searcha2DMatrix74 {
   
        public boolean searchMatrix(int[][] matrix, int target) {
             int low=0;
            int high=(matrix.length*matrix[0].length)-1;
            while(low<=high){
                int mid=(low+high)/2;
                int row=mid/matrix[0].length; 
                int col=mid%matrix[0].length;
                if(matrix[row][col]==target){
                    return true;
                }
                else if(target<matrix[row][col]){
                    high= mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            return false;
        }
    public static void main(String[] args) {
        Searcha2DMatrix74 solution = new Searcha2DMatrix74();
        
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        
        int target = 3;
       
        
        boolean result = solution.searchMatrix(matrix, target);
       
        
        System.out.println("Search for " + target + ": " + result);
    }
}
