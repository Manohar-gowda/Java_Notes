package DataStructures;

/*
    * String:
       - String is the predefined public final class present in java.lang package.
       - String class can't be inherited because string is final class.
       - String objects are immutable in nature.
       - String is class as-well as datatype, we refer string as non-primitive datatype.
       - The default value of string or any other non-primitive datatype is null.
       - String object can be created in 2 ways:
           1. without new operator:
               String s = "Naanu";
           2. With new Operator:
               String s =  new String("Naanu");
       - String object will get store inside memory location called String pool.
       - String pools are categorized into 2 :
          1. Constant pool
          2. Non-Constant pool
          - String object created as literal will get inside constant pool.
          - constant pool doesn't allow duplicate.
          - String object created using new operator will stored inside non-constant pool.
          - non-constant pool will allow duplication.

     * Difference between '==' and .equals() :
        - '==' : Compares the address or references of the 2 string objects.
        - '.equals()' : compares the data or content of 2 String objects.
        Ex:
        * String s1 = new String("Hi");
        * String s2 = new String("Hi");
        * sout(s1 == s2); // false
        * sout(s1.equals(s2)); // true

     * How String Objects are immutable in nature:
        - In java when we reinitialize a string object, existing object is not modified rather a new object gets created.
        - The reference variable pointing to old object get de-referenced and start pointing to new created object.
        - Where the older object is eligible for garbage collection, therefore string objects are immutable in nature.

     * Mutable version of String:
         1. StringBuffer :
            - Predefined public, final class present in java.lang package.
            - Introduced from JDK 1.0
            - mutable in nature
            - Thread safe
         2. StringBuilder :
            - same as StringBuffer introduced in JDk 1.5
            - Not thread safe

         - Both StringBuffer and StringBuilder are mutable in nature because they use resizable character array
             internally to store the sequence characters. when we modify the content (eg: append, insert, delete),
               they update the same array instead of creating new object.
     * All 3 String, StringBuffer and StringBuilder implements <<Serializable>>, <<Comparable>> and <<CharSequence>>

 */

public class Topic1 {
}
