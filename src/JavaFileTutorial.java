import java.io.File;

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
    }
}

//the above example I created a file object named file. The file object is linked with the specified file path.
//  File file = new File("newFile.txt");


// source: https://www.programiz.com/java-programming/file