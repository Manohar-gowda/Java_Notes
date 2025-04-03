import java.util.*;

class Binary {
    public static void main(String[] args){
        DigitsToWord.sol(121);
    }
}

class ReverseNum {
    public static void revNum(int n) {
        String revNum = "";
        while(n > 0) {
            int temp = n % 10;
            revNum = revNum + Integer.toString(temp);
            n = n / 10;
        }
        System.out.println(revNum);
    }
}

class FiboUptoN {
    public static void fiboN(int n) {
        int[] fibs = new int[n + 1];

        fibs[0] = 0;
        fibs[1] = 1;

        int i;
        for(i=2;i<=n;i++) {
            fibs[i] = fibs[i-1] + fibs[i-2];
        }

        System.out.println(Arrays.toString(fibs));
    }
}

class GreatestCommonDivisor {
    public static void sol(int a, int b) {
        int res = 0;
        for(int i=1;i<=a;i++) {
            if(a%i==0 && b%i==0) {
                res = i;
            }
        }
        System.out.println(res);
    }
}

class PerfectNumber {
    public static void sol(int n) {
        int sum = 0;
            for (int i=1;i<n;i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
            if(sum == n) {
                System.out.println("Yes, given integer is a perfect Number");
            } else {
                System.out.println("Not a perfect number");
            }
    }
}

class Anagram {
    public static void sol(String str1, String str2) {
        String s1 = str1.replaceAll(" ", "");
        String s2 = str2.replaceAll(" ", "");

        if(s1.length() != s2.length()) {
            System.out.println("No");
        } else {
            char[] arr1 = s1.toLowerCase().toCharArray();
            char[] arr2 = s2.toLowerCase().toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if(Arrays.equals(arr1,arr2)) {
                System.out.println("Yes");
            } else {
                System.out.println("NO");
            }
        }

    }
}

class Palindrome {
    public static void sol(String str) {
        String rev = "";
        for (int i=str.length()-1;i>=0;i--) {
            rev = rev + str.charAt(i);
        }
        if(rev.equals(str)) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}

class FrequencyOfChars {
    public static void sol(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i=0;i<str.length();i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        System.out.println(map);
    }
}

class LeapYear {
    public static void sol(int year) {
        if(year % 400 == 0) {
            System.out.println("Yes");
        }else if(year % 4 == 0 && year % 100 != 0) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}

class NonRepeatingChars {
    public static void sol(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i=0;i<str.length();i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }

        for(Map.Entry<Character,Integer> ele : map.entrySet()) {
            if(ele.getValue() < 2) {
                System.out.println(ele.getKey());
            }
        }
    }
}

class replaceByRank {
    public static void sol(int[] arr) {
        int[] new_arr = Arrays.copyOfRange(arr, 0, arr.length);

        for(int i=0;i<arr.length;i++) {
            for (int j=0;j<arr.length;j++) {
                if(arr[i] == new_arr[j]) {
                    arr[i] = j+1;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

class LeftRotationByK {
    public static void sol(int[] arr, int k) {
        int n = arr.length;
        for(int i=0;i<k;i++) {
            int firstEle = arr[0];
            for (int j=0;j<n-1;j++) {
                arr[j] = arr[j+1];
            }
            arr[n-1] = firstEle;
        }
        System.out.println(Arrays.toString(arr));
    }
}

class RightShiftK {
    public static void sol(int[] arr, int k) {
        int n = arr.length;
        for(int i=0;i<k;i++) {
            int lastEle = arr[n-1];
            for(int j=n-1;j>0;j--) {
                arr[j] = arr[j-1];
            }
            arr[0] = lastEle;
        }
        System.out.println(Arrays.toString(arr));
    }
}

class Factorial {
    public static void sol(int n) {
        int res = 1;
        for(int i=2;i<=n;i++) {
            res *= i;
        }
        System.out.println(res);
    }
}

class Armstrong {
    public static void sol(int num) {

        int n = num;
        int len = len(num);

        int sum = 0;
        while(n > 0) {
            int temp = n % 10;
            sum += (int) Math.pow(temp, len);
            n = n / 10;
        }

        if(sum == num) {
            System.out.println("Yes given number is armstrong number");
        }else {
            System.out.println("No man....");
        }
    }

    public static int len(int num) {
        int len = 0;
        while(num > 0) {
            num = num / 10;
            len++;
        }
        return len;
    }
}

class NaturalNumsSumRecursion {
    public static void sol(int n) {
        int sum = sum(n);
        System.out.println(sum);
    }

    public static int sum(int n) {
        if (n == 0) {
            return n;
        }
        return n + sum(n-1);
    }
}

class StringPalindrome {
    public static void sol(String str) {
        int n = str.length();
        StringBuilder sBuild = new StringBuilder(str.length());
        char[] chArr = str.toCharArray();
        for(int i=n-1;i>=0;i--) {
            sBuild.append(chArr[i]);
        }

        String revStr = sBuild.toString();
        if(revStr.equals(str)) {
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}

class BinaryToDecimal {
    public static void sol(int binary) {
        int n = 0;
        int decimal = 0;

        while(binary > 0) {
            int temp = binary % 10;
            decimal += temp * (Math.pow(2, n));
            binary = binary / 10;
            n++;
        }
        System.out.println(decimal);
    }
}

class DecimalToBinary {
    public static void sol(int num) {
        int[] arr = new int[20];
        int i=0;
        while(num > 0) {
            int rem = num % 2;
            arr[i] = rem;
            num = num / 2;
            i++;
        }
        for (int j=i-1;j>=0;j--) {
            System.out.print(arr[j]);
        }
    }
}

class RemoveAllExceptAlphabets {
    public static void sol(String str) {
        System.out.println(str.replaceAll("[^a-zA-Z]",""));
    }
}

class AddTwoFractions {
    public static void sol() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numerator 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter denominator 1: ");
        int den1 = sc.nextInt();
        System.out.println("Enter numerator 2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter denominator 2: ");
        int den2 = sc.nextInt();
        int den, num;

        if(den1 == den2) {
            den = den1;
            num = num1 + num2;
        } else {
            den = den1 * den2;
            num = (num1 * den2) + (num2 * den1);
        }
        if(num > den) {
                for(int i=1;i<num;i++) {
                    if(num % i == 0 && den % i == 0) {
                        num = num / i;
                        den = den / i;
                    }
            }
        }

        System.out.println("Res: " + num + "/" + den);

    }
}

class DigitsToWord {
    public static void sol(int n) {
        int len = Armstrong.len(n);
        int num = n;
        String[] units = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"","","Twenty", "Thirty","fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        int[] arr = new int[3];
        int i = 0;
        while(n > 0) {
            arr[i] = n % 10;
            n = n / 10;
            i++;
        }
        String res = "";

        if(num <= 19) {
            res = units[num];
        }else {
            if(arr[2] > 0) {
                res += units[arr[2]] + "hundred";
            }
            if(arr[1] > 0) {
                res += tens[arr[1]];
            }
            if(arr[0] > 0) {
                res += units[arr[0]];
            }
        }

        System.out.println(res);
    }
}