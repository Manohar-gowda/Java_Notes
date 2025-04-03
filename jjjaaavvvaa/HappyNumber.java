public class HappyNumber {
    public static void main(String[] args) {
        int num = 82;
        System.out.println(sol(num));
    }

    public static boolean sol(int num) {
        while(num > 9) {
            int sum = 0;
            while(num > 0) {
                int temp = num % 10;
                sum += temp * temp;
                num = num / 10;
            }
            num = sum;
        }

        return num == 1 || num == 7;
    }
}