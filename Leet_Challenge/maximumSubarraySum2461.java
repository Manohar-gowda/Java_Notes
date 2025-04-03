public class maximumSubarraySum2461 {
    public static void main(String[] args) {
        int[] nums = {3,3,3};
        int k = 3;

        if (nums.length <= k) {
            System.out.println(0);
            return;
        }
        int sum = 0;
        int i;
        for (i=0;i<k;i++) {
            sum += nums[i];
        }
        long maxSum = sum;
        int j=0;
        while( i<nums.length){
            sum -= nums[j];
            sum += nums[i];
            i++;
            j++;
            maxSum = Math.max(sum, maxSum);
        }

        System.out.println(maxSum);  //27
    }
}
