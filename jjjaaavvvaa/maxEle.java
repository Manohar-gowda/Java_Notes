import java.util.Arrays;

public class maxEle {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4,6,8,3,6,6};

        int max1 = Integer.MIN_VALUE;
        int max2 = 0;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            }
        }
        System.out.println(max2);
    }
}