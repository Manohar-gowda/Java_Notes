package FileHandling;

import java.io.*;

/*
     * File handling:
        - The process of writing data into file and reading data from file.
        - The data or information which is present in a java program can be permanently store inside 2 platforms.
           1. File:  using java io package
           2. DataBase: using JDBC hibernate

        - Important classes present in the java io package.
           * file
           * fileReader
           * fileWriter
           * fileInputStream
           * fileOutputStream
           * ObjectInputStream
           * ObjectOutputStream

        - Important methods in file handling:
           * mkdir(): Creates a folder directory / package.
           * createNewFile(): creates a new file based on the extension.
           * exists(): checks file / folder is present or not.
           * delete(): deletes the specified file / folder.
           * renameTo(): rename old file / folder to new file / folder.
           * lastModified(): returns the milliseconds as value for last modified date of file / folder.

           To create directory / folder
                File f1 = new File("Library");
                f1.mkdir();

           To create a new txt file
                File f2 = new File("Note-Book.txt");
                f2.createNewFile();


         - Steps to write data into a file:
           * Create an object of fileClass by specifying the file name.
           * Create an object of FileWriter class and pass the file object to the constructor of fileWriter.
           * Invoke write(): converts data into stream(set od binary values).
           * Invoke flush(): converts stream back to data and stores in the file.
           * Invoke close():

           * File writer opens the file in write(w) mode:
             - If we open a file in a write mode, there are 2 scenarios.
               1. File present:
                   Opens the existing file in write mode and already existing data is lost.
               2. File Not Present:
                   Creates a new file and then opens in write mode.

                    File f3 = new File("Note-Book.txt");
                    FileWriter fw = new FileWriter(f3);

                    String str = "His name is Paramesha!!!";

                    fw.write(str);
                    fw.flush();
                    fw.close();
                    System.out.println("Data Stored Successfully!!");

              - If you want to save old data and only add new data to a text file, you can use the FileWriter
                   class with the append mode. By setting the second parameter of the FileWriter constructor to true.

                   File f3 = new File("Note-Book.txt", true);
                   f3.write("newData");

            - Steps to read data from a file:
                * Create an object of file class by specifying the filename.
                * Create an object of file reader class and pass the file object to the constructor of file reader.
                * Define a logic to read the data from a file.
                * invoke close();

                - FileReader: Opens the file in read mode.
                  1. File present: open the existing file in read mode and data can be read successfully.
                  2. File not present: throws fileNotFoundException  (EOF end of file)

                  File f2 = new File("Note-Book.txt");
                  FileReader fr = new FileReader(f2);
                  int ch = fr.read();
                  while(ch != -1) {
                      sout((char) ch);
                      ch = fr.read();
                  }
                  fr.close();

         * Difference between Iterator and ListIterator:
             -> Iterator: - unidirectional.
                          - can be used on every collection (list, queue, set, map)
                          - iterator(), hasNext(), Next()

             -> ListIterator: - Bi-directional
                              - can be used only on list (ArrayList, LinkedList, vector and stack)
                              - listIterator(), hasNext(), next(), hasPrevious(), previous()

 */

public class FileHandling {
    public static void main(String[] args) throws Exception{
//        try(InputStreamReader isr = new InputStreamReader(System.in)) {
//            System.out.println("Enter some letters");
//            int letters = isr.read();
//            while(isr.ready()) {
//                System.out.println((char) letters);
//                letters = isr.read();
//            }
//            System.out.println();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

//        try (FileReader fr = new FileReader("notes.txt")){
//            int letters = fr.read();
//            while(fr.ready()) {
//                System.out.println((char) letters);
//                letters = fr.read();
//            }
//            System.out.println();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

//       try (BufferedReader bf = new BufferedReader(new FileReader("notes.txt"))) {
//           System.out.println(bf.readLine());
//       }catch (IOException e) {
//           System.out.println(e.getMessage());
//       }

//        try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
//           System.out.println(bf.readLine());
//       }catch (IOException e) {
//           System.out.println(e.getMessage());
//       }

        //output

//      try ( OutputStreamWriter osw = new OutputStreamWriter(System.out)) {
//          osw.write("Hello");
//          osw.write(97);
//          osw.write('A');
//          char[] arr = "hello world".toCharArray();
//          osw.write(arr);
//      }catch (IOException e) {
//          System.out.println(e.getMessage());
//      }

//        try(FileWriter fw = new FileWriter("note.txt", true)) {
//            fw.write("Override word");
//        }catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

//        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
//            bw.write("Hi");
//            bw.write('\n');
//            bw.write("Gurukula");
//        }catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

//        File fl = new File("new_file.txt");
//        try {
//            FileWriter fw = new FileWriter("new_file.txt", true);
//            fw.write("Manohar");
//            fw.write('\n');
//            fw.write("Sujay");
//            fw.write('\n');
//            fw.write("Gowda");
//            fw.write('\n');
//            fw.write(75);
//            fw.close();
//            BufferedReader bfr = new BufferedReader(new FileReader("new_file.txt"));
//            String line = bfr.readLine();
//            while(line != null) {
//                System.out.println(line);
//                line = bfr.readLine();
//            }
//        }catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

// -------------------------------------------------------------------------------------------------------------------------

//       To create directory / folder
//        File f1 = new File("Library");
//        f1.mkdir();
//
//       To create a new txt file
//        File f2 = new File("Note-Book.txt");
//        f2.createNewFile();
//
//        File f3 = new File("Note-Book.txt");
//        FileWriter fw = new FileWriter(f3);
//
//        String str = "His name is Ullas!!!";
//
//        fw.write(str);
//        fw.flush();
//        fw.close();
//        System.out.println("Data Stored Successfully!!");

// ----------------------------------------------------------------------------------------------------------
//        File f2 = new File("Note-Book.txt");
//        FileReader fr = new FileReader(f2);
//        int ch = fr.read();
//        while(ch != -1) {
//            System.out.print((char) ch);
//            ch = fr.read();
//        }
//        fr.close();
//--------------------------------------------------------------------------------------------
//        try(FileWriter fw = new FileWriter("note.txt", true)) {
//            String txt = " Hello World God Create More Wonderful.";
//            fw.write(txt);
//            fw.flush();
//            fw.close();
//        }catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//
//        try(FileReader fr = new FileReader("note.txt")) {
//            int letter = fr.read();
//            while (fr.ready()) {
//                System.out.print((char) letter);
//                letter = fr.read();
//            }
//            fr.close();
//        }catch (IOException e) {
//            System.out.println(e.getMessage());
//
//------------------------------------------------------------------------------------------------

    }
}


