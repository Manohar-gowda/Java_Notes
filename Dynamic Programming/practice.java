import java.util.*;

public class practice {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        LinkedList<Integer> li = new LinkedList<>(Arrays.asList(2,3,4,6,7,8,3,4,6,6,5));
        if(li.size() % 2 == 0) {
            System.out.println(li.get(li.size()/2) + ", " + (li.get((li.size()/2)-1)));
        } else {
            System.out.println(li.get(li.size()/2));
        }
    }
}
