package Static2;

/* Static:
    * In java any component which belongs to class level is represented as static.
    * static component of a class are allotted memory on to the method area.
    * static variables are declared inside the class but outside the methods.
    * Not only that static variables are also allotted default values if the programmer does not provide any value.

    * We should declare variable as static when the same value can be shared by all the objects.
    * We should declare a variable as non-static i.e., instance when the value for it will be different for different objects.


    Static methods:
    * are also class level component and can directly be access using the class name.
    * We use static methods when we need to communicate a message that applies universally across all instance of a class.

    Static Blocks:
    * These are executed(class loader) before the  main class started to execute, these are used to initialize static variables.
 */

public class StaticMain {
    public static void main(String[] args) {
       Circle cir1 = new Circle();
       cir1.r = 10;
       cir1.area();
        Circle cir2 = new Circle();
       cir2.r = 100;
       cir2.area();
        Circle cir3 = new Circle();
       cir3.r = 1000;
       cir3.area();
    }
}

class Test {

    int x = 20;

    static int a;
    static int b = 20;

    static {
        System.out.println(a);
        System.out.println(b);
//        System.out.println(x);  //error
    }

}

class Circle {
    double r;
    static double pi = 3.14;

    public void area() {
        System.out.println("Area of circle with radius " + r + " is :" + (pi*r*r));
    }
}
