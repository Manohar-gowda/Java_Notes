package Object1;

/* Object Oriented Programming(oop):

* It is an approach to solve the real world problems with the help of programs.
* An object can be defined as the programming representation of the real world entity.
* An object can have two parts: States and Behaviours.
* The state of an object represents its properties whereas behaviors of an object represents the actions
     performed by the particular object.
* A Class can be defined as a template or a blueprint using which objects can be created.
* In java to create objects we must use the "new" keyword.
* Objects are allotted memory on the heap segment.


* The states of an objects are also known as instance variables.
* When the programmer does not provide any value for the instance variables, they are assigned default values
     depending upon the data types.
* Such objects whose address is not stored in any variable is known as anonymous or garbage objects.
* These objects are deleted by garbage collector thread.

-- Anonymous Objects:
   * Such objects which are not assigned to any reference variable are called as it.
   * These are mostly used when we need the object only once.

   * Anonymous objects can also be used to pass objects to other methods.

*/



public class ObjectCreation {
    public static void main(String[] args) {
       Intern i = new Intern();
       // here Intern class is non-primitive data type which is holding reference address of object as i ;
        // Object creation is done at heap memory and method is at stack.
       i.name = "Manohar";
       i.place = "Chikmagalur";
       i.age = 22;
        System.out.println(i.name);
        System.out.println(i.age);
        System.out.println(i.place);

       i.study();
       i.giveInterview();

       new Car().drive();  // anonymous object  ----

        controlCar(new Car());
    }

    public static void controlCar(Car car1) {
        car1.drive();
    }
}

class Intern {
    String name;    // Instance variables
    String place;
    int age;

    void study() {
        System.out.println("Study java");
    }

    void giveInterview() {
        System.out.println("Prepare and give interview");
    }

}

class Car {
    String brand;
    int price;

    void drive() {
        System.out.println("He is driving a branded car.");
    }
}
