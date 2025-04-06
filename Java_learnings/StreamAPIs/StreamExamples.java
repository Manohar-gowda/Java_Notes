package StreamAPIs;

/*
         - Java 8 -> minimal code, functional programming, lambda expression, Streams, Date & Time API.
         * Predicate --> Functional interface (Boolean valued function).
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

         * Stream: (Method under List interface) :
             - process collections of data in a functional and declarative manner.
             - Simplify data processing.
            How to use?
             - Source, intermediate operations and terminal operation

             - filter:
                   System.out.println(li.stream().filter(x -> x.toLowerCase().startsWith("m")).count());

          1. groupingBy:
                Collectors.groupingBy(num -> num, Collectors.counting()) creates a Map<Integer, Long> where key is number
                    and the value is how many times it appears in the list.

          2. filter:
                filter(entry -> entry.getValue() > 1) keeps only the entries where the count is greater than 1(i.e., duplicates)

          3. map:
                map(Map.Entry::getKey) extracts just the keys (the duplicate numbers) from the filtered entries.

          4. collect:
                collect(Collectors.toList()) gathers the duplicate numbers into the list.


       ****
       - Intermediate methods:
            These methods transforms and filter a stream and return a new stream, allowing us to chain more operations.
            They are lazy, meaning they don't execute until a terminal operation triggers the pipeline.
            1. filter(Predicate<T> predicate)
                * Keeps elements that match a condition.
                ex:
                  stream.filter(num -> num > 5) keeps numbers greater than 5

            2. map(Function<T, R> mapper)
                * Transforms each element into something else.
                ex:
                  stream.map(String::toUpperCase) converts strings to uppercase

            3. distinct:
                * Removes duplicates based on equals().
                ex:
                  stream.distinct() ensures unique elements.

            4. sorted() (Comparator<T> comparator)
                * Sorts the stream (natural order or custom)
                ex:
                  stream.sorted() sorts numbers or Strings

            5. peek(Consumer<T> action):
                * Performs an action on each element without modifying the stream.
                stream.peek(System.out::print) prints elements as they pass.

            6. limit(long maxSize):
                * Truncates the stream to a specified size.
                ex:
                  stream.limit(3) takes the first 3 elements.

            7. skip(long n):
                * Skips the first n elements.
                ex:
                  stream.skip(2) ignores the first 2 elements.

       - Terminate methods:
            These methods produce a result or a side effect and trigger the execution of the stream pipeline.
            Once a terminal method is called, the stream is consumed and can't be reused.

            1. forEach(Consumer<T> action)
               * Applies an action to each element (no return value)
               ex:
                 steam.forEach(System.out::println) prints each element

            2. collect(Collector<T, A, R> collector):
               * Accumulate elements into a collection or other structure.
               ex:
                 stream.collect(Collectors.toList()) gathers elements into a List.

            3. count()
               * Returns the number of elements in the stream.
               ex:
                 stream.count() gives the total count

            4. anyMatch(Predicate<T> predicate)
               * Returns true if at least one element matches the condition.
               ex:
                 stream.anyMatch(num -> num > 0) checks for positive numbers

            5. allMatch(Predicate<T> predicate)
               * Returns true if all elements match the condition.
               ex:
                 stream.allMatch(num -> num > 0) ensures all are positive.

            6. noneMatch(Predicate<T> predicate)
               * Returns ture if no elements match the condition.
               ex:
                 stream.noneMatch(num -> num < 0) ensures no negatives

            7. findFirst() or findAny()
               * Returns an Optional with the first element.
               ex:
                 stream.findFirst() grabs the first element.

            8. reduce(T identify, BinaryOperator<T> accumulator)
               * Combines elements into a single result.
               ex:
                 stream.reduce(0, Integer::sum) sums all elements

            9. toArray()
               * Converts the stream into an array.
               ex:
                  stream.toArray() returns an Object[].

       --*-- How it works:
          List<Integer> nums = Arrays.asList(1, 3, 5, 2, 4, 3);

          List<Integer> res = nums.stream()
                      .filter(n -> n % 2 == 0)   // Intermediate: keep even numbers (2, 4)
                      .map(n -> n * n)           // Intermediate: square them (4 ,16)
                      .distinct()                // Intermediate: remove duplicates
                      .collect(Collectors.toList()); // Terminal: gather into a List

          Sout(res);    // output: [4, 16]


 */

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples {
    public static void main(String[] args){
          ex6();
    }
    public static void ex6() {
//  6. Filter even numbers from a list:
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println(evenNumbers);
    }
    public static void ex7() {
//  7. Find sum of all numbers
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        int res = numbers.stream().reduce((n,i) -> n+i).get(); // or .reduce(Integer::sum).get();
        System.out.println(res);
    }

    public static void ex8() {
//  8. Find maximum number
        List<Integer> numbers = Arrays.asList(1,8,3,2,9,7);
        int res = numbers.stream().reduce(Integer::max).get();
        System.out.println(res);
    }

    public static void ex9() {
//  9. Count Elements greater than value
        List<Integer> numbers = Arrays.asList(1,8,3,2,9,7);
        int val = 5;
        long res = numbers.stream().filter(n -> n > val).count();
        System.out.println(res);
    }

    public static void ex10() {
//  10. Convert list of strings to uppercase:
        List<String> names = Arrays.asList("alice", "bob", "charlie");
        List<String> upperNames = names.stream().map(String::toUpperCase).toList();
        System.out.println(upperNames);
    }

    public static void ex11() {
//  11. Convert first letter of each string in a list to uppercase:
        List<String> names = Arrays.asList("alice", "bob", "charlie");
        List<String> resList = names.stream().map(s -> Character.toUpperCase(s.charAt(0)) + s.substring(1)).toList();
        System.out.println(resList);
    }

    public static void ex12() {
//  12. Find first element matching a condition:
        List<Integer> numbers = Arrays.asList(1,3,5,7,9);
        Integer firstEven = numbers.stream().filter(n -> n % 2 == 0).findFirst().orElse(null);
        System.out.println(firstEven);
    }

    public static void ex13() {
//   13. Check if all elements satisfy a condition:
        List<Integer> numbers = Arrays.asList(2,4,6,8);
        boolean hasEven = numbers.stream().allMatch(n -> n % 2 == 0);
        System.out.println(hasEven);
    }

    public static void ex14() {
//   14. Check if all elements satisfy a condition:
        List<Integer> numbers = Arrays.asList(1,3,5,7);
        boolean hasEven = numbers.stream().anyMatch(n -> n % 2 == 0);
        System.out.println(hasEven);
    }

    public static void ex15() {
//  15. Sort a list in Ascending or Descending order
        List<Integer> numbers = Arrays.asList(5,2,8,1);
        List<Integer> sortedAsc = numbers.stream().sorted().toList();
        List<Integer> sortedDsc = numbers.stream().sorted((a,b) -> b-a).toList();
        System.out.println(sortedDsc);
        System.out.println(sortedAsc);
    }

    public static void ex16() {
//  16. Remove duplicates from a list:
        List<Integer> numbers = Arrays.asList(1,2,2,3,4,3,5);
        List<Integer> ori = numbers.stream().distinct().toList();
        System.out.println(ori);

//  17. Get all duplicates into a list:
        List<Integer> dup = numbers.stream()
                .collect(Collectors.groupingBy(num -> num, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();
        System.out.println(dup);

        Map<Integer, Long> map = numbers.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
        System.out.println(map);
    }

    public static void ex17() {
//  18. Average of numbers:
        List<Integer> numbers = Arrays.asList(1,2,3,4);
        double avg = numbers.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println(avg);
    }

    public static void ex18() {
//  19. Concatenation Strings with a Delimiter:
        List<String> words = Arrays.asList("Hello", "World", "Java");
        String res = String.join(", ", words);
        System.out.println(res);
    }

    public static void ex19() {
//  20. Group elements by length (Strings):
        List<String> words = Arrays.asList("Hello", "World", "Java");
        Map<Integer, List<String>> grouped = words.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(grouped);
    }

    public static void ex20() {
//  21. Partition numbers into even and odd:
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        Map<Boolean, List<Integer>> part = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(part);
    }

    public static void ex21() {
//  22. Find second-largest number:
        List<Integer> numbers = Arrays.asList(1,24,7,12,6,11,23,2);
        Integer res = numbers.stream()
                .sorted((a,b) -> (b-a))
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println(res);
    }

    public static void ex22() {
//  23. Reverse a String of Words Using Stream API:
        String str = "Hello world java";
        List<String> words = Arrays.asList(str.split("\\s+"));
        Collections.reverse(words);
        String res = words.stream().collect(Collectors.joining(" "));
        System.out.println(res);
    }

    public static void ex23() {
//  24. Find the first non-repeated character in a string using streams:
        String str = "abbacdcef";

    }
}
