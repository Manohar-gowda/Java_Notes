import java.util.*;

public class validParenthesis20 {
    public static void main(String[] args) {
        String s = "({})[]";

        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()) {
            if (c == '{' || c == '(' || c == '[') {
                st.push(c);
            } else if (!st.isEmpty()) {
                if ((c == ')' && st.peek() == '(') || (c == '}' && st.peek() == '{') || (c == ']' && st.peek() == '[')) {
                    st.pop();
                } else {
                    st.push(c);
                }
            } else {
                st.push(c);
            }
        }
        if (st.isEmpty()) return true;
        return false;
    }
}
