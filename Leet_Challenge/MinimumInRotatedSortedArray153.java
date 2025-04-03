public class MinimumInRotatedSortedArray153 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};

        System.out.println(binarySearch(nums));
    }

    public  static int binarySearch(int[] nums) {
        int minNum = nums[0];
        int left = 0;
        int right = nums.length-1;

        while(left <= right) {

            if(nums[left] < nums[right]) {
               minNum = Math.min(minNum, nums[left]);
            }
            int mid = (right + left) / 2;
            minNum = Math.min(minNum, nums[mid]);
            if(nums[left]<=nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return minNum;
    }
}
