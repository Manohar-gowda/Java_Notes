package DataStructures;

/*
    * Data Structures:
       Is a way of storing data or organizing the data.

    * Collection:
      - It is the predefined interface present in java.util package
      - Collection was introduced from JDK 1.2
      - collection is used to store a group of objects.
      - Generics are supported.

    * Collection Hierarchy: 
     
   Iterable(interface) 
    │
   Collection (interface)
    ├── List (interface)
    │     ├── ArrayList (class)
    │     ├── LinkedList (class) 
    │     └── Vector (class)
    │           └── Stack (class)
    │     
    ├── Set (interface)
    │     ├── HashSet (class)
    │     │     └── LinkedHashSet (class)
    │     └── SortedSet (interface)
    │           └── TreeSet (class)
    │     
    └── Queue (interface)
          ├── PriorityQueue (class)
          └── Deque (interface)
                ├── ArrayDeque (class)
                └── LinkedList (class)
       
   
Map (interface)
    ├── HashMap (class)
    │     └── LinkedHashMap (class)
    ├── SortedMap (interface)
    │     └── TreeMap (class)
    ├── Hashtable (class)
    └── ConcurrentMap (interface)
          ├── ConcurrentHashMap (class)
          └── ConcurrentSkipListMap (class)


    - Collection interface:
       * add(): used to add an object into the collection.
       * addAll(): used to add one collection into another collection.
       * contains(): used to check if the object is present in the collection or not.
       * containsAll(): used to check if 1 collection is present in another collection or not.
       * remove(): used to remove an object from the collection based on index position.
       * removeAll(): used to remove 1 collection from another collection.
       * size(): to find number of object present in the collection.
       * clear(): to remove all or delete all the objects from the collection.
       * isEmpty(): used to check if the collection is empty or not.
       * iterator(): used to traverse object from a collection.
          syntax: 
             public Iterator<E> iterator();
    - List Interface:
       * Generalization :
          List l = new ArrayList<>();
                   new Vector<>();
                   new Stack<>();
                   new LinkedList<>();
       * Insertion order is maintained.
       * duplication is allowed.
       * list is index based and index position starts from 0.
       * The null value can be stored.
    
     Important methods:
       * get(): used to return the object based on index position.
       * indexOf(): used to return the index position of an object.
       * lastIndexOf(): used to return the last index position of an object.
       * add(index, value): used to add an object in the specified index position and already existing object is shifted to next position.
       * set(index, value): used to add an object in the specified index position and already existing object is removed.
       
       -> ArrayList:
          * The default initial capacity of array is 10.
          * The incremental capacity of ArrayList is IC = ((CC * 3) / 2) + 1;
          * When we create an object of array list internally an array gets created based on the default initial capacity.
          * when we add an object inside array list, if it is full a new array gets created based on incremental capacity formula.
          * All the objects of old array is copied to newly created array.
          * The reference variable pointing to old array is de-referenced and start to point the newly created array.
         
       -> Linked List:
          * The objects inside linked list is stored in the form of nodes where each node will store the object address of previous node 
             and address of next node.
          * It does not have initial capacity and incremental capacity.
      
         -- When do we choose ArrayList and LinkedList:
             * When there is inserting of object in between or deleting of object in between we should always choose linkedList.
                 because in arrayList when we add or delete object the shift operation is involved which reduces efficiency.
                so, if there is manipulation involved choose linkedList.
             
             * When there is storing and retrieving involves choose ArrayList because it is sequential and traversing is faster.
        
         -- Collection framework does not support primitive data type:
             * As alternative we use wrapper class.
            
           -- wrapper class:
               * The non-primitive version of a primitive data type is called as wrapper class.
                   - Byte
                   - Short
                   - Integer
                   - Long
                   - Float
                   - Double
                   - Boolean
                   - Character
            * Auto-Boxing:
               Process of converting primitive type to non-primitive.
                 int a = 20;
                 Integer b = a; // Integer b = new Integer(a);
                 sout(a + "," + b); // 20,20
            
            * Auto-unBoxing:
                Process of converting non-primitive data type to primitive.
                 Integer a = new Integer(25);
                 int b = a;
                 sout(a + "," + b); // 25,25
             
            * Generics:
                - It is used to specify the element type of collection.
                - It is a feature that allows type (classes and interfaces) to be parameters when defining classes, interfaces and methods.
                - This provides tighter type checks at compile time and makes code safer and easier to read.
                
            syntax: 
               <Element type>
              LinkedList<Integer> list = new LinkedList<>();
               
              
        - Vector:
            - Same as ArrayList but incremental capacity is IC = CC * 2;
            Vector v = new Vector();
             v.add("java");
             
            * Stack:
               - LIFO: traversal order (Last In First Out).
               - push, pop.
        
        * Collections class:
            It is a class present in java.util from JDK 1.2
             - sort(): predefined static method present in collections class.
                       used to sort a list (ArrayList, LinkedList or Vector) of homogenous objects in ascending order.
                       Collections.sort(list1);
             - reverse(): used to reverse a list of both homogenous and heterogeneous objects.
                        Collections.reverse(list2);
        
        - Queue:   jdk 1.5 
            * Traversal order is FIFO (First In First out).
            * Implementation classes of queue interface are.
               - LinkedList:
               - PriorityQueue:
                  
            * The first element inside a queue is called head and last element is called tail.
            * The process of adding an element or object inside a queue is called as Enqueue,
                and deleting an object or element from queue is called Dequeue.
            
            * element():  returns head if element is present else throws exception (NoSuchElementException)
            * peek():  returns head element else null
            * remove(): returns and removes head element else exception.
            * poll():  returns and removes head element else null.
         
        - Set:
           * Insertion order is not maintained.
           * duplication is not allowed.
           * not index based.
           * null values can be stored.
           * we can't use get() method in set because set is not index based like list.
            i. HashSet:
              * The initial capacity of hashset is 16.
              * The underline data structure is hash table. (i.e., key - value)
                  key: hashcode of object
                  value: object
                  
            ii. LinkedHashSet:
              * Both HashSet and LinkedHashSet is similar but major difference is hashSet doesn't maintain insertion order.
                 but linkedHashSet maintains.

            iii. TreeSet:
               * TreeSet naturally maintains sorting order (ascending order).
               * When we add an object inside a tree set internally compareTo() method is invoked.
               * The return type of compareTo() method is int and its returns +1 when > , -1 when < , 0 when its ==
               * The underline data structure is binary tree.
                 i.  leftNode
                 ii. parentNode
                 iii.rightNode
               * CompareTo() is present in all wrapper classes and String class, is an abstract method present in <<comparable>> interface.

 */

public class Topic2 {
}
