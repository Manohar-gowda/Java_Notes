package oops;

/*
   * Abstract :
       keyword which can be used with a class and method.
       1. Concrete class.
       2. abstract class:
            It allows both abstract method and concrete method.
         - In java it is possible to extend an abstract class, but we need to follow rules of abstract.
           a. we should make the class as abstract.
           b. override the abstract method.

         - We cannot create an object of abstract class, but we can have reference variable of abstract class.
            abstract class person {
            }
            class tom extends person {
            }
            person p = new person();   // invalid
            new person();   // invalid
            tom t = new tom();  // valid
            person p = new tom(); // valid

        - Both abstract and concrete class can have constructor but abstract class constructor should be invoked
            by the subclass constructor either implicitly or explicitly using super calling statement (super()).
        - abstract method can't be private, static and final., because goal of having an abstract method is to override.

     * Abstraction:
         The process of hiding all the unnecessary implementation and showing only the important functionalities or behaviours
            to the user with the help of abstract class or interface.

 */

public class Abstraction {
    public static void main(String[] args) {
        implementAbstract impl = new implementAbstract();
        impl.create("manohar", 22);
    }
}

abstract class Bank {
    abstract void create(String name, int val);
}

class implementAbstract extends Bank{
    @Override
    public void create(String name, int val) {
      //do whatever
    }
}
