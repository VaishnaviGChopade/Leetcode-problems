import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class MergeIntervals56 {
    public static int[][] merge(int[][] intervals) {
    if(intervals.length<=1) return intervals;
    
     Arrays.sort(intervals,Comparator.comparingInt(i->i[0]));
     List<int[]> res=new ArrayList<>();
   
     int start=intervals[0][0];
     int end=intervals[0][1];
     for(int i=1;i<intervals.length;i++){
        if(end>=intervals[i][0]){
            if(end<intervals[i][1]){
                end=intervals[i][1];
            }
            continue;
        }
        
            res.add(new int[] {start,end});
            start=intervals[i][0];
            end=intervals[i][1];
        
     }
     res.add(new int[] {start,end});
     return res.toArray(new int [res.size()][]);
}
public static void main(String[] args) {
    int [][] intervals={{1,3},{2,6},{8,10},{15,18}};
    int [][] res=merge(intervals);
    
    for (int[] interval : res) {
        System.out.println(Arrays.toString(interval));
    }
}
    }
    

    // When you use System.out.println(interval); in Java, it prints the default string representation of the array, which is its memory address. 
    // To print the contents of the array, you need to use Arrays.toString(interval).