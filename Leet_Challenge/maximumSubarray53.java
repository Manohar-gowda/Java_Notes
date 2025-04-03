public class maximumSubarray53 {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

         int maxSum = nums[0];
         int sum = 0;
         for(int i=0;i<nums.length;i++) {
             if(sum < 0) {
                 sum = 0;
             }
                 sum += nums[i];
             if(sum > maxSum) {
                 maxSum = sum;
             }
         }
        System.out.println(maxSum);
    }
}