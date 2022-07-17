import java.io.*;

public class JavaFileTutorial {
    public static void main(String[] args) {
        File file = new File("newFile.txt");

        try {
            //trying to create a file based on the object
            boolean value = file.createNewFile();
            if (value) {
                System.out.println("The new file is created.");
            } else {
                System.out.println("The file already exists.");
            }
        } catch (Exception e) {
            e.getStackTrace();
        }


        char[] array = new char[100];
        try {
            // Creates a reader using the FileReader
            FileReader input = new FileReader("input.txt");

            //Reads characters
            input.read(array);
            System.out.println("Data in the file:");
            System.out.println(array);

            //Close the reader
            input.close();

        } catch (Exception e) {
           e.getStackTrace();
        }

        String data = "This is the data in the output file";
        try {
            //Creates a Writer using FileWriter
            FileWriter output = new FileWriter("output.txt");

            //Writes string to the file
            output.write(data);
            System.out.println("Data is written to the file.");

            //Closes the writer
            output.close();

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}

//the above example I created a file object named file. The file object is linked with the specified file path.
//  File file = new File("newFile.txt");




// source: https://www.programiz.com/java-programming/file