package DataStructures;


/*
   * Map:
      - Map belongs to collection framework but do not implement collection interface.
      - The object inside the map is stored in the form of key-value pair where in key cannot be duplicated but
           value can be duplicated.
      - implements:
         i.   HashMap
         ii.  LinkedHashMap
         iii. TreeMap
         iv.  HashTable
      - In java one key and value is called as Entry.
      - Methods:
         * put(): used to add an Entry (Key & value) inside the map.
         * get(): to return the value based on the key.
         * containsKey(): used to check if key is present or not.
         * containsValue(): to check if value is present in the map or not.
         * size(): count the number of Entry present in the map.
         * remove(): to remove an Entry based on the key specified.
         * clear(): to remove all the entries from the map.
         * isEmpty(): to check if the map is Empty or not.
         * keySet(): used to return a set of keys.
             public Set<E> keySet()
       - To traverse entries from map:
          for(Map.Entry<Integer, Integer> ele1 : map.entrySet()) {
            System.out.println(ele1);
          }
       - To traverse keys from map:
           for(int ele : map.keySet()) {
            System.out.println(ele);
           }
       - When we add duplicate key the value get overridden.

       - TreeMap: maintains sorting order.
          * HashMap:
            - Insertion order is not maintained.
            - null can be used as key.
          * LinkedHashMap:
            - Insertion order is maintained.
            - null can be used as key.
          * TreeMap:
            - Maintains natural sorting order.
            - null cannot be used as key.
          * HashTable:
            - Both HashMap and HashTable are similar but main difference HashMap is not Thread safe & HashTable is Thread safe.


 */

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapLearn {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 4);
        map.put(3, 7);

        for (Map.Entry<Integer, Integer> ele1 : map.entrySet()) {
            System.out.println(ele1);
        }

        for (int ele : map.keySet()) {
            System.out.println(ele);
        }

        // Storing user defined object inside a map.

        Map<Person, String> map1 =  new TreeMap<>();
        map1.put(new Person(21), "Manohar");
        map1.put(new Person(23), "Sujay");


    }
}

class Person implements Comparable<Person> {
    int age;

    Person(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "age " + age;
    }

    @Override
    public int compareTo(Person p) {
        return this.age - p.age;
    }
}
