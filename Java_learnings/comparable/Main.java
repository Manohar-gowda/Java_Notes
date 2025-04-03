package comparable;


/*
     * Comparable:
              - used for comparing object and sorting them either in ascending or descending order.
              - also used for default sorting and mutual comparison.
              - syntax:
                  public int compareTo(element e) {
                   }
              - Rules to compare user defines objects using comparable interface:
                   * class should implement comparable interface.
                   * specify generics which indicates the object to be compared.
                   * override compareTo() by specifying the sorting logic ,with only one parameter.

 */

  /*
      * Comparator:
               - It is also used for comparing objects and sorting them in either ascending or descending order.
               - used for custom sorting and un-mutual comparison.
               - comparator has an abstract method called as compare() method.
               - syntax:
                   public int compare(Element e1, Element e2)
               - Rules to compare user defined objects using comparator interface:
                  * Create a new class which implements comparator interface and imported from java.util package
                  * Specify generics which indicates the object to be compared.
                  * override compare() and specify the sorting logic.
                  * create comparator object and pass it to the constructor of TreeSet.

   */

import java.util.Comparator;
import java.util.TreeSet;

class Student implements Comparable<Student> {
    int age;
    Student(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "age " + age;
    }

    @Override
    public int compareTo(Student s) {
        return s.age - this.age;  // this -> current object to be inserted
    }                             // s -> already existing object
}                                 // ascending: this.age - s.age;
                                  // descending: s.age - this.age;
class Main {
    public static void main(String[] args) {
         Student s1 = new Student(22);
         Student s2 = new Student(23);
         Student s3 = new Student(21);

        TreeSet<Student> t = new TreeSet<>(); // TreeSet calls compareTo() of Student class.
        t.add(s1);
        t.add(s2);
        t.add(s3);

        for(Student ele : t) {
            System.out.println(ele);
        }

        Car1 c1 = new Car1(22);
        Car1 c2 = new Car1(23);
        Car1 c3 = new Car1(21);

        carComparator c = new carComparator();
        TreeSet<Car1> t2 = new TreeSet<>(c);
        t2.add(c1);
        t2.add(c2);
        t2.add(c3);

        for(Car1 ele : t2) {
            System.out.println(ele);
        }

    }
}

class Car1 {
    int cost;
    Car1(int cost) {
        this.cost = cost;
    }

    public String toString() {
        return "Cost " + cost;
    }
}

class carComparator implements Comparator<Car1> {
     @Override
     public int compare(Car1 x, Car1 y) {
         return x.cost - y.cost;
     }
}
