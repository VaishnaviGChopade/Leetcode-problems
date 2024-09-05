import java.util.HashMap;
import java.util.Map;

public class SingleNumberII137 {
    
    public static int singleNumber(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
           if(map.containsKey(nums[i])){
            map.put(nums[i],map.get(nums[i])+1);
           }
           else{
            map.put(nums[i],1);
           }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==1) return entry.getKey();
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums={2,2,3,2};
        int res=singleNumber(nums);
        System.out.println(res);
    }
}

