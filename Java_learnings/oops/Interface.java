package oops;


/*
    * Interface:
       An interface is a completely "abstract class" that is used to group related methods with empty bodies.
       - All the methods inside the interface are automatically public and abstract.
       - variables in interface are automatically public, static, final.

       - A class can achieve IS-A relationship with an interface using implements keyword.
       - We can't create an object of interface.
       - Interface doesn't have constructor.


       Types:
        1. Normal Interface:
             A normal interface is a standard interface that contains one or more abstract methods.

        2. Functional Interface (Single Abstract Method - SAM)
            - A functional interface contains exactly one abstract method.
            - It can have any number of default or static methods.

            @FunctionalInterface
            interface Greeting {
                void greet(String message); // Single abstract method

                default void sayHello() {
                    System.out.println("Hello!");
                }
            }

            public class Main {
                public static void main(String[] args) {
                    Greeting greeting = (message) -> System.out.println(message); // Lambda expression
                    greeting.greet("Welcome to Java!");
                    greeting.sayHello();
                }
            }

            Functional interfaces are used in lambda expressions and method references.

         3. Marker Interface
            - A marker interface is an empty interface (no methods or fields).
            - It is used to mark or tag a class with a special meaning or behavior.
            - Examples in Java: Serializable, Cloneable, Remote.

            interface Serializable {
                 // No methods
            }

            class MyClass implements Serializable {
                // Class implementation
            }

            public class Main {
                public static void main(String[] args) {
                    MyClass obj = new MyClass();
                    if (obj instanceof Serializable) {
                        System.out.println("MyClass is Serializable.");
                    }
                }
            }

 */

public class Interface {
    public static void main(String[] args) {
        User1 user1 = new User1();
        user1.deposit();
        user1.withdraw();
        user1.checkBalance();
    }
}

interface SBI {
    void deposit();
    void withdraw();
    void checkBalance();
}

class User1 implements SBI {

    public void deposit() {
        System.out.println("User deposited amount 100RS");
    }

    public void withdraw() {
        System.out.println("Taken amount 50RS");
    }

    public void checkBalance() {
        System.out.println("Balance: 50RS");
    }
}


