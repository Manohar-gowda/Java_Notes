package Java_Libraries;

/*
   * Java Libraries:
       - It is a collection of predefined packages each package is collection of classes and interfaces.
       - Each class and interface is a collection of variable and methods.
       - All predefined packages are present inside the:
          a. zip file -> src.zip:
          b. jarfile -> rt.jar -> runtime.jar
       - ex:
         1. java.lang -> object, string, thread, system
         2. java.util -> scanner, arrayList, hashset
         3. java.io -> file, file-reader, file-writer
         4. java.sql -> java.net, java.math


    * Object class:
       - Object is the predefined class present in java.lang package.
       - Object class is referred as the super most class in java because every class in java implicitly inherited the object class.
          class car (extends object){
          }
          Object ob = new car();
       - Important method present in object class:
          * public String toString()
          * public int hashCode()
          * public boolean equals():
              compares the address of the two objects.
          * public void notify()
          * public void notifyAll()
          * public void wait()
          * public void wait(long a)
          * public void wait(long a, int b)
          * protected Object clone()
          * protected void finalize()
          * public class getClass()
 */
