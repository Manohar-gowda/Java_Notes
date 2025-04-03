import java.util.Arrays;

public class ProductOfArrayExceptSelf238 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int pre = 1;
        int post = 1;
        int len = nums.length;

        int[] res = new int[len];
        res[0] = 1;
        for (int i=1;i<len;i++) {
            pre *= nums[i-1];
            res[i] = pre;
        }
        res[len-1] = pre;
        for(int i=len-2;i>=0;i--) {
            post *= nums[i+1];
            res[i] = res[i] * post;
        }

        System.out.println(Arrays.toString(res));

    }
}
