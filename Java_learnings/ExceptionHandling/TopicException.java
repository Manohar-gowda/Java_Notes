package ExceptionHandling;


/*
   * Exception:
         - It is an event or interruption which stops the execution of a program, where the next lines of code will
              not get executed.
    * Exception handling:
         - Exception should always be handled and the process of handling the exception is called Exception handling.

    * Error:
       - It is a mistake or problem which occurs during the execution of a program.
       - Error can occur during :
           * Compile time: due to syntax error.
           * Run time: when we execute java program without main().

    * Exception Hierarchy:

   Throwable (superclass)
    ├── Error
    │     ├── VirtualMachineError
    │     │     ├── OutOfMemoryError
    │     │     └── StackOverflowError
    │     ├── AssertionError
    │     └── LinkageError
    │           ├── NoClassDefFoundError
    │           └── UnsatisfiedLinkError
    └── Exception
          ├── RuntimeException (Unchecked Exceptions)
          │     ├── NullPointerException
          │     ├── ArithmeticException
          │     ├── ArrayIndexOutOfBoundsException
          │     ├── IllegalArgumentException
          │     │     ├── NumberFormatException
          │     └── IllegalStateException
          └── Checked Exceptions
                ├── IOException
                │     ├── FileNotFoundException
                │     └── EOFException
                ├── SQLException
                ├── ClassNotFoundException
                └── InterruptedException

      * The Exception hierarchy in java is a structured way to categorize and handle these exceptions
       - The hierarchy is rooted in the "Throwable" class, which is the superclass of all errors and exceptions.
      * Throwable:
          It has main subclasses:
             i. Error
             ii.Exception
          - Common methods in throwable:
              * getMessage(): Returns the error message.
              * printStackTrace(): Prints the stack trace of the exception.
              * getCause(): Returns the cause of the exception.
           i. Error:
               - serious issues that are not meant to be handled by the application.
               - They typically indicate the problem with the JVM or system resources.
               - Ex:
                  * OutOfMemoryError: occurs when jvm runs out of memory.
                  * StackOverflowError: occurs when the stack overflows due to excessive recursion.
                  * NoClassDefFoundError: occurs when the jvm cannot find a class definition at runtime.

           ii. Exceptions: are events that can be handled by the application.
               - They are divided into two:
                  1. Checked Exception:
                    - These are checked at compile time.
                    - They are subclasses of Exception class.
                    - The compiler forces the programmer to handle these exceptions using try-catch blocks or declare
                        them using throws keyword.
                    - Ex:
                       * IOException: occurs during input/output operations.
                          - FileNotFoundException: occurs when a file is not found.
                          - EOFException: occurs when the end of a file is reached unexpectedly.
                       * SQLException: occurs during database operations.
                       * ClassNotFoundException: occurs when a class is not found at runtime.
                       * InterruptedException: occurs when a thread is interrupted.

                  2. Unchecked Exception: (RuntimeException):
                      - They are checked at runtime.
                      - They are subclasses of RuntimeException
                      - Ex:
                        * NullPointerException: occurs when trying to access a null object.
                        * ArithmeticException: occurs during invalid arithmetic operations (ex division by zero).
                        * ArrayIndexOutOfBoundsException: occurs when accessing an invalid array index.
                        * IllegalArgumentException: occurs when an illegal argument is passed to a method.
                        * NumberFormatException: occurs when converting a string to a number fails.
                        * IllegalStateException: occurs when a method is called at an illegal or inappropriate time.

           * Exception handling:
               1. try: Contains the code that might throw an exception.
               2. catch: catches and handles the exception.
               3. finally: Executes code regardless of whether an exception occurs.
               4. throw: Explicitly throws an exception.
                   - used in method implementation.
               5. throws: Declares exceptions that a method might throw.
                   - used to indicate caller about the possibility of exception.
                   - used in method declaration.


               class thowsDemo {
                   static void display() throws Exception{
                      --------//--------
                   }
                   psvm() {
                     try {
                       display();
                      }catch(Exception e) {
                        sout("Exception handled");
                       }
                   }
               }

       * Custom Exception:
          - Based on the certain necessity user can define his own exception.
          - To create checked exception user should extend the exception class.
          - To create unchecked exception user should extend the runtime exception class.
          - throw: keyword which is used to invoke an object of exception type, generally used with custom exception.
                    syntax:
                       throw new ExceptionType();

      - It is possible to have nested try and catch block
      - It is possible to have try and catch block with in the finally block.
      - It is possible to declare the multiple exception using throws.

 */

public class TopicException {
}
