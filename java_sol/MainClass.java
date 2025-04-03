import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        decimalToBinary(8);
    }

    public static boolean isPrime(int n) {
        for (int i=2;i<n;i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeRange(int n1, int n2) {
        for(int i=n1;i<=n2;i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static void sumOfDigits(int n) {
        int sum = 0;
        while(n > 0) {
            int temp = n % 10;
            sum += temp;
            n /= 10;
        }
        System.out.println(sum);
    }

    public static void reverse(int n) {
        int rev = 0;
        StringBuilder sb = new StringBuilder();
        while(n>0) {
            int temp = n % 10;
            sb.append(temp);
            n = n / 10;
        }
        System.out.println(sb);
//        while(n>0) {
//            int temp = n % 10;
//            rev =(rev*10) + temp;
//            n /= 10;
//        }
//        System.out.println(rev);
    }

    public static int digitLen(int n) {
        int len = 0;
        while(n>0) {
            int temp = n % 10;
            n /= 10;
            len++;
        }
        return len;
    }

    public static void armstrongNum(int n) {
        int len = digitLen(n);
        int sum = 0;
        while (n>0) {
            int val = n % 10;
            sum += (int)Math.pow(val,len);
            n /= 10;
        }
        System.out.println(sum);
    }

    public static void palindrome(String word) {
        int i=0;
        int j=word.length()-1;
        char[] arr = word.toCharArray();
        while(i <= j) {
            if(arr[i] != arr[j]) {
                System.out.println("Not Palindrome.");
                return;
            }
            i++;
            j--;
        }
        System.out.println("Palindrome.");
    }

    public static void fib(int n){
        System.out.println(fib(n,new HashMap<>()));
    }

    public static int fib(int n, HashMap<Integer,Integer> map) {
       if(n == 1 || n == 0) {
           return n;
       }
       if(map.containsKey(n)) {
           return map.get(n);
       }
       map.put(n,fib(n-1,map) + fib(n-2,map));
       return map.get(n);
    }

    public static void fibRange(int n1, int n2) {
        for(int i=n1;i<=n2;i++) {
            System.out.print(fib(i,new HashMap<>()) + " ");
        }
    }

    public static void primeFactors(int n) {
        for (int i=2;i<=n;i++) {
            if(isPrime(i)) {
                int x = n;
                while (x % i == 0) {
                    System.out.print(i + " ");
                    x /= i;
                }
            }
        }
    }

    public static int factorial(int n) {
        int res = 1;
        for(int i=n;i>=1;i--) {
            res *= i;
        }
        return res;
    }

    public static void strongNumber(int n) {
        int sum = 0;
        int copy = n;
        while(n > 0) {
            int temp = n % 10;
            int val = factorial(temp);
            sum += val;
            n /= 10;
        }
        System.out.println((copy == sum)
             ? "Yes, given number is strong Number" : "No, not a strong number");
    }

    public static void decimalToBinary(int num) {
        int[] arr = new int[20];
        int i=0;
        while(num > 0) {
            arr[i]  = num % 2;
            num = num / 2;
            i++;
        }
        for (int j=i-1;j>=0;j--) {
            System.out.print(arr[j]);
        }
    }

    public static void binaryToDecimal(int num) {
        int decimal = 0;
        int n = 0;
        while(num > 0) {
            int rem = num % 10;
            decimal += (int) (rem*Math.pow(2,n));
            num /= 10;
            n++;
        }
        System.out.println(decimal);
    }
}
