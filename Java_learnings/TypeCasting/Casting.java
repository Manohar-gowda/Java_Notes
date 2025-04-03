package TypeCasting;


public class Casting {
    public static void main(String[] args) {
//       Primitive.narrowing();
//       Primitive.widening();
        NonPrimitive.upcasting();

    }
}

// Type Casting:
// Process of converting one type of date into another type data.

// Two types
// 1. Primitive Casting
// 2. Non-primitive Casting (Class Casting)

class Primitive {
    // 1. Primitive Casting
//    * Widening (implicit)
//    The process of converting the smaller type of data into bigger type.
//    byte -> short -> char -> int -> long -> float ->double

//    ASCII: American Standard Code for Information Interchange
//            A -> 65.....
//            b -> 97.....
//            White Space -> " "-> 32

        public static void widening() {
            int a = 10;
            double b = a;
            System.out.println(b);

            char x = 'A';
            int y = x;
            System.out.println(y);
        }
//    * Narrowing (Explicit)
//         The process of converting a bigger type of data into smaller type of data.
//         double -> float -> long -> int -> char -> short -> byte

        public static void narrowing() {
            double x = 25.54;
            int y = (int) x;
            System.out.println(y);

            int a = 65;
            char b = (char)a;
            System.out.println(b);
        }
}

// 2. Non-primitive Casting
    //    * Upcasting
//             Converting a child class object into the parent class reference
//        Only Parent Class Methods/Properties Are Accessible
//        Dog object is treated as an Animal
//        Only methods from Animal class are accessible
        // Example:
class Animal {
      void makeSound() {
          System.out.println("Animal makes a sound");
      }
}

class Dog extends Animal {
        void bark() {
          System.out.println("Dog barks");
        }
}

class NonPrimitive {
    public static void upcasting(){
        //upcasting
        Animal a = new Dog();  // Upcasting (Child → Parent)
        a.makeSound();
        //a.bark();  not allowed only Animal's methods are accessible
    }


//      * Down casting:

//         IT means converting a parent class reference back to a child class reference.
//         Can access child-specific methods after casting.
    public static void downcasting() {
        //downcasting
        Animal a = new Dog(); // Upcasting (Parent reference holding child object)

        Dog d = (Dog) a; // Downcasting (Parent → Child)
        d.bark();
    }
}

class Specialization {
//     Specialization: (Top to Down approach)
//          If a reference variable is storing only one specific type of object.

    public static void spe() {
        Animal a = new Animal();
        a.makeSound();
        Dog d = new Dog();
        d.bark();
        d.makeSound();
    }

}

class Generalization {
//      (Bottom - up approach)
//        Reference variable is capable of storing different type of object.
      public static void gen() {
          Animal a = new Dog();
          a.makeSound();
        // Animal an = new Cat();
      }
}

class ClassCastException {
//    A ClassCastException occurs in java when we try to cast an object to a subclass that is not an instance of.
   public static void excep() {
       Animal a = new Animal(); // Animal reference , Animal object
       Dog d = (Dog) a;  // This will throw a ClassCastException at runtime
   }

//   To prevent ClassCastException:
//      use instanceof before casting......
    public static void solution(){
       Animal a = new Animal();
       if(a instanceof Dog) {
           Dog d = (Dog) a;
       }else {
           System.out.println("Down casting not possible: animal is not a Dog.");
       }
    }

//    Correct downcast example:
      public static void correctCast() {
       Animal a = new Dog();
       a.makeSound();
      }
}
