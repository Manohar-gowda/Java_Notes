package oops;

/*
       * Polymorphism:
          The ability of a method to behave differently for different object.

          - 2 Types of polymorphism:
             1. Compile time: (static binding or early)
                - occurs when the method to be invoked is determined by the compiler at compile time.
                - it is based on the signature.
                - it is efficient because the decision is made before the program runs.
                - Method overloading: Defining multiple methods with the same but different parameter lists.

             2. Run time:  (dynamic):
                - Occurs when the method to be executed is determined at runtime based on the actual object type,
                   not the reference type.
                - Method overriding: A subclass is providing a specific implementation of a method defining in its super class.

         * Method binding:
            The process of mapping or associating the method caller to its method implementation.

 */

public class Polymorphism {
    public static void main(String[] args) {
//        add(1,2,3);
//        add(1,2);

        System.out.println(isPrime(163));

//        Signatures sig = new Signatures();

    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static boolean isPrime(int num) {
        for(int i=2;i<num/2;i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

//  In Java, method overloading allows multiple methods in the same class
//  to have the same name but different method signatures.
//
// 1. Number of Parameters
// 2. Parameter Data Types
// 3. Order of Parameters


class Signatures {
    // Method with one parameter
    int add(int a) {
        return a + 34;
    }

    // Method with two parameter
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with different parameter
    double add(double a, double b) {
        return a + b;
    }

    // Overloaded method with different parameter order
    String add(String a, int b) {
        return a + b;
    }
}


