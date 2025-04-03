public class maximunProductSubarray152 {
    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};

        int max = nums[0];
        int min = nums[0];
        int res = max;
        for(int i=1;i< nums.length;i++) {
            int cur = nums[i];
            int temp = Math.max(cur, Math.max(cur*min , cur*max));
            min = Math.min(cur, Math.min(cur*min , cur*max));
            max = temp;
            res = Math.max(res,max);
        }
        System.out.println(res);
    }
}