package oops;

/*
    Inheritance:
        It is a concept in object-oriented programming that allows a class (child class) to
            inherit properties and behaviours from another class(parent class)
        * It promotes code re-usability and reduce redundancy by enabling shared attributes and
            methods to be defined in a parent class and used in multiple child classes.
            (Redundancy: unnecessary things)  .
        * is-A relationship: indicates that a child class is a type of the parent class. It is done by using
             extends keyword.
        1. Single level
        2. Multi-level
        3. Hierarchical : combination of one super class and multiple subclass
        4. Hybrid : combination of hierarchical and multiple inheritance.
        5. Multiple (diamond problem)  (use interface) ambiguity arises when a class inherits from two parent classes.
          (Ambiguity: cal lead to miscommunication and confusion if not handled).

       Types of methods during inheritance:
          1. Inherited Methods:
             Methods defined in the super class directly available in subclass.
          2. Overridden Methods:
             Methods defined in the super class that are redefined in the subclass.
             - Only non-static methods can override.
             - private, final, static methods can't override.
             - Constructor also can't override because cannot be inherited.
             - During inheritance return type, method name and parameter should always be same.

             * Super:
               It is a keyword which is used to access the super class member from subclasses.
               syntax:
                 super.method_name();
                 super.variable_name;

        * Constructor chaining:
            The process of one constructor calling another.
             1. Same class:
                this() statement
                - does not support recursive chaining.

          class car {
                 car(int x) {
                    sout(1);
                 }
                 car() {
                       this(100);
                       sout(2);
                 }

                 psvm(String[] args) {
                       sout("start");
                       car c = new car();
                       sout("end");
                 }
           }

             2. Different class:
                Is-A relationship / inheritance
                super() statement


      class car{
        car(int x) {
          sout(1);
        }
      }

     class son extends father {
       son() {
         super();
         sout(2);
       }

       psvm(String[] args) {
         son s = new son();
        }
     }

     - this() and super() statement should always be the first executable line with in a constructor.
     - Advantages of constructor chaining:
       - Code redundancy or code repetition is avoided.
       - Code Re-usability is increased.

          3. child-specific Methods: Methods are only defined in the subclass.
            
 */

public class Inheritance {
    public static void main(String[] args) {
        Student3 std3 = new Student3();
        std3.is_alive();
        std3.playing();
    }
}

class Actions {
    void study() {
        System.out.println("Studying");
    }

    void playing() {
        System.out.println("Playing");
    }
}

class Student1 extends Actions {
    void run() {
        System.out.println("Running for his life");
    }
}

class Student2 extends Actions {
    void party() {   //
        System.out.println("Drinking Dew");
    }
}

class Student3 extends Student1 {
    void is_alive() {
        System.out.println("Probably died due to tired");
    }
}