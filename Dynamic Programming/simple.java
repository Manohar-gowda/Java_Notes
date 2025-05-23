import java.util.HashMap;

public class simple {
    public static void main(String[] args) {
        System.out.println(trib(5,new HashMap<>()));
    }

    public static long trib(int n, HashMap<Integer, Long> memo) {
        if(n==0 || n==1) {
            return 0;
        }
        if(n==2) {
            return 1;
        }
        if(memo.containsKey(n)) {
            return memo.get(n);
        }
        long result =  trib(n-1, memo) + trib(n-2, memo) + trib(n-3, memo);
        memo.put(n,result);
        return result;
    }

}
