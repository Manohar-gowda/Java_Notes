import java.io.CharArrayReader;

public class validPalindrome125 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
//        String s = "simple not plaindrome";

        String str = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(char ch : str.toCharArray()) {
            if(Character.isLetterOrDigit(ch)) {
                sb.append(ch);
            }
        }

        String original = sb.toString();
        String reverse = sb.reverse().toString();

        System.out.println((original.equals(reverse)) ? "Yes palindrome" : "No");

    }
}
