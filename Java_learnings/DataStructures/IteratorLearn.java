package DataStructures;

/*
    * Iterator:
        - used to traverse objects from a collection.
        - Iterator is unidirectional.
           * iterator():
           * hasNext(): used to check if there is any object present in nextPosition or not.
           * Next(): used to return the object

 */

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorLearn {
    public static void main(String[] args) {
        LinkedList<Double> l = new LinkedList<>();
        l.add(1.2);
        l.add(1.3);
        l.add(1.6);
        l.add(1.5);

        Iterator<Double> it = l.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
