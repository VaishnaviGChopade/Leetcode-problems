import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void setZeroes(int[][] matrix) {
        List<Integer> lrow=new ArrayList<>();
List<Integer> lcol=new ArrayList<>();
        int rows=matrix.length,cols=matrix[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]==0){
                    lrow.add(i);
                    lcol.add(j);
                    
                }
            }
            }

            for(int i=0;i<lrow.size();i++){
                for(int r=0;r<cols;r++){
                    matrix[lrow.get(i)][r]=0;
                }
            }

            for(int i=0;i<lcol.size();i++){
                for(int c=0;c<rows;c++){
                    matrix[c][lcol.get(i)]=0;
                }
            }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };
        setZeroes(matrix);
    }   
}