import java.util.HashMap;

public class fib {
    public static void main(String[] args) {
        long res = fibo(7, new HashMap<>());
        System.out.println(res);
    }

    public static long fibo(int n, HashMap<Integer, Long> map) {
        if(n==1 || n==0) {
            return n;
        }
        if(map.containsKey(n)) {
            return map.get(n);
        }
        long res = fibo((n-1), map) + fibo((n-2), map);
        map.put(n,res);
        return res;
    }
}