package Collections;

/*
    - Why we need Collections:
        An array is an indexed collection of fixed number of homogenous data elements.
        The main advantage os Arrays is we can represent multiple values with a single variable.

        Limitations:
          * Arrays are fixed in size i.e., once we created an array with some size there is no chance of increasing or
             decreasing it's size based on our requirements.
          *

 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListImpl {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.add(2,8);

        list.set(1,7);

        System.out.println(list.contains(7));

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
