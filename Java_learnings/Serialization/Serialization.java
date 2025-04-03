package Serialization;

/*
   -> Serialization:
      - Automatic process or mechanism of converting objects state along with its information into byte stream.
      - To serialize an object a class must implement a marker interface called java.io.Serializable

   -> Deserialization: The process of reconstructing an object from a byte stream.
      - use ObjectInputStream to read the object from a file or input stream.
-----------------------------------------------------------------------------------------------------------------------
   1. What is Serialization in java?
       The process of converting an object's state into byte stream so that it can be saved to a file.
       (java.io.Serializable interface)

   2. What is the main purpose of Serialization?
      * Persistent: It allows an object to be saved to a file or database.
      * Network Communication: It enables object to be sent over network.
      * Deep copy: can be used to create a deep copy of an object by serializing and then deserializing it.

   3. How to make object serializable?
      1. Implement the Serializable interface.
      2. Ensure all fields are serializable.
      3. Use transient for non-serializable fields:
           * It prevents certain fields from being serialized, we can mark them as transient.
           private transient Connection dbConnection;
      4. Provide a serialVersionUID (optional but recommended):
         It is a unique identifier for the class, used during deserialization to ensure compatibility.
           If not provide, the JVM generates one, but this can lead to issues if the class changes.
           private static long serialVersionUID = 1L;
      5. Serialize the object:
          use ObjectOutputStream to serialize the object.

   4. Use of serialVersionUID:
         * Purpose: It helps the JVM verify that the class of the serialized object matches the class being used to
            deserialize. (If not matches InvalidClassException is thrown)

 */

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization {
    public static void main(String[] args) throws Exception{
        Employee1 em = new Employee1("Manohar", "CSE", 101, 100000);
        FileOutputStream fos = new FileOutputStream("Note-Book.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(em);
    }
}

class Employee1 implements Serializable {
    public String name, dept;
    public int id, salary;

    public Employee1(String name, String dept, int id, int salary) {
        this.name = name;
        this.salary = salary;
        this.dept = dept;
        this.id = id;
    }

}
