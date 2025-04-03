public class Linear {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12} ;
        int target = 4;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == target) {
              System.out.println("Found at index: " + i);
               return;
            }
        }
        
        System.out.println(-1);
    }
}
