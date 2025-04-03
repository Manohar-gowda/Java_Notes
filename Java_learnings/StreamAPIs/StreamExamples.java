package StreamAPIs;

/*
         - Java 8 -> minimal code, functional programming, lambda expression, Streams, Date & Time API.
         * Predicate --> Functional interface (Boolean values function).
            Predicate<Integer> isEven = x -> x % 2 == 0;
            System.out.println(isEven.test(24));
          // combining:
            Predicate<String> isWordStartsWithM = x -> x.toLowerCase().startsWith("m");
            Predicate<String> isWordEndsWithR = x -> x.toLowerCase().endsWith("r");
            Predicate<String> com = isWordStartsWithM.and(isWordEndsWithR);
            System.out.println(com.test("manohar"));

          * method reference
             li.forEach(x -> System.out.println(x));
             li.forEach(System.out::println);

         * Stream:
             - process collections of data in a functional and declarative manner.
             - Simplify data processing.
            How to use?
             - Source, intermediate operations and terminal operation

          1. filter:
             System.out.println(li.stream().filter(x -> x.toLowerCase().startsWith("m")).count());





 */

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class StreamExamples {
    public static void main(String[] args){

        List<String> li = Arrays.asList("Manohar", "Dhanush", "Ullas");
        //

        // 2. map
        Stream<String> res = li.stream().map(String::toUpperCase);
        System.out.println(res);



    }
}
