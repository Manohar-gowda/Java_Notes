import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Two_Sum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(sol(nums, target)));
    }

    public static int[] sol(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            map.put(nums[i], i);
        }

        for (int i=0;i<nums.length;i++) {
            int temp = target - nums[i];
            if(map.containsKey(temp)) {
                res[0] = map.get(temp);
                res[1] = i;
            }
        }
        return res;
    }
}
