import java.util.stream.IntStream;

/*

public class Sample {
    static int num = 100;
    public static void main(String[] args) {

    }

     Can we define static variables inside the static method or not?
     No, not possible, because once we defined the variables in methods will become local type.
    public static void q1() {
       static int num  100; //cannot define inside a method
    }

     How many parts of java?
     as per sun micro systems
     * J2SE (java 2 standard edition)  core java  : standard apps
     * J2EE (java 2 enterprise edition)   advanced (servlets, etc) : web, enterprise apps
     * J2ME (java 2 micro edition)     : mobile apps

}

 ------------------------------------------------------------------------------------------------------------------

 Instance and static blocks?
 1. static blocks are executed only once when class file is loading.
 2. instance blocks are executed during object creation. before constructor execution.
 3. We can create more than one instance and static blocks inside the class

class Test {
    static {
        System.out.println("Static block 1");
    }
    static {
        System.out.println("Static block 2");
      }

    {
        System.out.println("instance block");
    }

    Test() {
        System.out.println("constructor block 1");
    }

    Test(int num) {
        System.out.println("constructor block 1.2"  + num);
    }

    public static void main(String[] args) {
        Test t = new Test();
        Test t1 = new Test(7);
    }
}
output
    Static block 1
    Static block 2
    instance block
    constructor block 1
    instance block
    constructor block 1.27

----------------------------------------------------------------------------------------------------------------------

 System.out.println explain??

 System -> it is a class present in java.lang
 out -> it is static variable of system class    ["out" is a static variable of system class of type printStream.]
 println()  ->  it is a method present in printStream to print the data.

----------------------------------------------------------------------------------------------------------------------

 What all does JVM Comprise of?
 A JVM subsystem responsible for loading class files into memory when the program starts.

----------------------------------------------------------------------------------------------------------------------

 Between constructor and instance block, the instance block is given highest preference hence it is executed before the constructor.

class Tt {
     int i = 33;
     Tt() {
         System.out.println("Constructor " + i);
     }

    public static void main(String[] args) {
        Tt t = new Tt();
    }
    {
        System.out.println("Block " + i);
    }
}

output
Block 33
Constructor 33

----------------------------------------------------------------------------------------------------------------------

 Static and non-static blocks

class Test {
    {
        System.out.println("A");
    }
    Test() {
        System.out.println("Con");
    }
    static {
        System.out.println("Static");
    }
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println("I");
        new Test();
        System.out.println("Main");
    }
    {
        System.out.println("B");
    }
}

 Execution flow:----->
 1. Static block execution:
 When the class Test is loaded into memory (before the main method runs), all static blocks execute.
 Output:
 Static

 2. First Object creation
 Before the constructor runs, instance blocks {} execute in the order they appear in the class.
 Output:
 The first instance block:
 A
 The second instance block:
 B
 The constructor executes:
 Con

 3. Print Statement in the main
 I

 4. Second Object creation:
 Same steps as first object creation
 A
 B
 Con

 5. Final Print Statement in the main
 Main

 Overall Final output
Static
A
B
Con
I
A
B
Con
Main

----------------------------------------------------------------------------------------------------------------------

 Method:
 It is a member of class
 Represent a behaviour of object.
 A method never gets executed on it's own until we invoke a method.
 There are two types of methods

 1. Concrete method
 It is a complete method which has both method declaration and as well as definition or implementation

void method1() {

        }

 2. Abstract method
 It is an incomplete method which has only the method declaration.
 Can be declared by using keyword <abstract>
 abstract void method2();

----------------------------------------------------------------------------------------------------------------------

class Test {

    void start(){
        System.out.println("YY");
        petrolLevel();
        engineHealth();
    }

    void petrolLevel() {
        System.out.println("half");
    }

    void engineHealth() {
        System.out.println("Good");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.start();
        t.drive();
    }

    void drive() {
        System.out.println("ZZ");
    }
}

Output:
YY
half
Good
ZZ

----------------------------------------------------------------------------------------------------------------------
 - Storing user defined object inside array

class Employee {
    int id;
    String name;

    Employee (int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class EmployeeMain {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Ullas");
        Employee e2 = new Employee(102, "Dhanush");

        Employee[] e = {e1, e2};

//        for (int i=0;i<e.length;i++) {
//            System.out.println("EmployeeID of " + e[i].name + " is " + e[i].id);
//        }
        for(Employee ele : e) {
            System.out.println("EmployeeID of " + ele.name + " is " + ele.id);
        }
    }
}

Output:
EmployeeID of Ullas is 101
EmployeeID of Dhanush is 102

----------------------------------------------------------------------------------------------------------------------

 1. Why Java is not 100% Object-oriented:
      Because of  Primitive data types namely:
            boolean, byte, char, int, float, double, long, short
      To make them OO we have wrapper classes which actually "wrap" the primitive data type into an object of that class.

 2. Why pointers are not used in java?
    Because :
     i. They are unsafe.
    ii. Since JVM is responsible for implicit memory allocation, thus in order to avoid direct access to memory by the user,
        pointers are discouraged in java.

 3. Why string is immutable:
       * String pool requires string to be immutable otherwise shared reference can be changed from anywhere.
       * Security because string is shared on different area like file system, networking connection, database connection, having
             immutable string allows you to be secure and safe because no one can change reference of string once it gets created.

 4. What is marker interface?
       A marker interface can be defined as the interface having no data member and member functions. In simple terms, an empty interface.
          e.g., Serializable, Cloneable

 5. Can you override a private or static method in java?
     * We cannot override a private or static method in java.
     * We cannot override a private method in java. Because, it's not accessible there, what we do is to create another private method
         with the same name in the child class.
     * For static methods if we create a similar method with ame return type and same method arguments in the child class then
        it will hide the superclass method, this is known as method hiding.

 6. Does finally always execute in java?
   Not in following cases:
    i. "System.exit()" function
   ii.  system crash

 7. What methods does the "Object" class have?

     Java.lang.Object class, parent of all has following methods:
        * protected Objet clone() throws CloneNotSupportedException
              creates and returns a copy of this object.

        * public boolean equals(Object obj)
              Indicates whether some other object is "equal to" this one.

        * protected void finalize() throws Throwable
              Called by the garbage collector on an object when garbage collection determines that there are no
                  more references to the object.

        * public final Class getClass(): Returns the runtime class of an object
        * public int hashCode(): Returns a hash code value for the object
        * public String toString(): Returns a string representation of the object
        * public final void notify():
              - Wakes up a single thread that is waiting on the object's monitor.
        * public final void notifyAll():
              - Wakes up all threads that are waiting on the object's monitor.
        * public final void wait():
              - Causes the current thread to wait until another thread invokes notify() or notifyAll() on the object.
              - Used in thread synchronization.
        * public final void wait(long timeout)
        * public final void wait(long timeout, int nanos)

 8. How we can make a Class immutable:
        * Declare a class as final so it can't be extended.
        * Make all fields private so that direct access is not allowed.
        * Don't provide setter methods for variables.
        * Make all mutable fields final so that it's value can be assigned only once.
        * Initialize all the fields via constructor.
        * Perform cloning of objects in the getter methods to return a copy rather than returning the actual object reference.

 9. Singleton class: (design pattern):

-------------------------------------------------------------------------------------------------------------------

  1.

*/