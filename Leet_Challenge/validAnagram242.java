import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class validAnagram242 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagarem";

        if(s.length() != t.length()) {
            System.out.println(false);
            return;
        }

//        HashMap<Character,Integer> map = new HashMap<>();
//        for(char c : s.toCharArray()) {
//            map.put(c,map.getOrDefault(c,0)+1);
//
//        }
//        System.out.println(map);
//        for(char c : t.toCharArray()) {
//            reduceFrequency(map,c);
//        }
//
//        System.out.println(map.isEmpty());
 // -------------------------------------------------------------------------------
//        s = s.toLowerCase();
//        t = t.toLowerCase();
//
//        char[] arr1 = s.toCharArray();
//        char[] arr2 = t.toCharArray();
//
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//
//        System.out.println(Arrays.equals(arr1,arr2));

        //--------------------------------------------------------------------------

        int[] charArr = new int[26];
        for(char ch : s.toCharArray()) {
            charArr[ch-'a']++;
        }

        for(char ch : t.toCharArray()) {
            charArr[ch-'a']--;
        }

        for(int ele : charArr) {
            if(ele != 0) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }

    public static void reduceFrequency(HashMap<Character,Integer> map, Character ch) {

        if(map.containsKey(ch)) {
            int frequency = map.get(ch);
            if(frequency > 1) {
                map.put(ch,frequency-1);
            } else {
                map.remove(ch);
            }
        }
    }
}
