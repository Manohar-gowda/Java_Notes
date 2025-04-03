package LambdaExpression;

/*
    * Lambda Expression: (anonymous function)
        - It is a short block of code which takes in parameters and returns a value.
        - Saves time, Clearer code, helps with modern java features, functional programming.
        - Structure:
            (parameters) -> { body }
        - used for sorting, filtering, eventHandling etc...

 */

public class Sample{
    public static void main(String[] args) {

//        Student st1 = new Student() {
//            @Override
//            public String getBio(String name) {      // normal (Traditional way)
//                return name + " is a lawyer.";
//            }
//        };

        Student std1 = name ->  name + " is a lawyer.";     // lambda way
        Student std2 = name ->  name + " is a professor.";
        Student std3 = name ->  name + " is a frontend dev.";

        Calci cal1 = (a,b) -> a+b;

        System.out.println(std1.getBio("Ram"));
        System.out.println(std2.getBio("Bhuvan"));
        System.out.println(std3.getBio("Mani"));

        System.out.println("Sum of 1 and 6 is " + cal1.sumCal(1,6));
        System.out.println("Sum of 3 and 5 is " + cal1.sumCal(3,5));
        System.out.println("Sum of 2 and 4 is " + cal1.sumCal(2,4));
    }
}