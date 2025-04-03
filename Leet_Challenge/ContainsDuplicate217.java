import java.util.HashSet;

public class ContainsDuplicate217 {
    public static void main(String[] args) {
        int[] nums = {1,2,4,7,1};
        HashSet<Integer> set = new HashSet<>();

        for(int ele : nums) {
            if(set.contains(ele)) {
                System.out.println(true);
            }else {
                set.add(ele);
            }
        }
        System.out.println(false);
    }
}
