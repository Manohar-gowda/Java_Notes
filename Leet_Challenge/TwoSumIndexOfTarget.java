import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSumIndexOfTarget {
    public static void main(String[] args) {
        int[] nums = {2,7,4,1,5,3,6};
        int target = 0;

        Map<Integer, Integer> map = new HashMap<>();
        List<int[]> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                res.add(new int[]{map.get(complement), i});
            }
            map.put(nums[i], i);
        }

        if (!res.isEmpty()) {
            System.out.println("Yes");
            for (int[] val : res) {
                System.out.println(val[0] + " " + val[1]);
            }
        }else {
            System.out.println("No");
        }
    }
}
