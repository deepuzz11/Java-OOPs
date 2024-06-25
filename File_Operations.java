import java.io.File;
import java.util.Scanner;

public class File_Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the file name
        System.out.print("Enter the FileName: ");
        String fileName = scanner.nextLine();

        // Create a File object associated with the user-specified file name
        File file = new File(fileName);

        // Check if the file exists
        if (file.exists()) {
            System.out.println("\nThe given file " + fileName + " exists.");
            System.out.println("File Location: " + file.getAbsolutePath());

            // Check if the file is readable
            if (file.canRead()) {
                System.out.println("The file is readable.");
            } else {
                System.out.println("The file is not readable.");
            }

            // Check if the file is writable
            if (file.canWrite()) {
                System.out.println("The file is writable.");
            } else {
                System.out.println("The file is not writable.");
            }

            // Display the length of the file in bytes
            System.out.println("File length is " + file.length() + " bytes.");

            // Determine the type of file based on its extension
            if (fileName.endsWith(".jpg") || fileName.endsWith(".gif") || fileName.endsWith(".png")) {
                System.out.println("The given file is an image file.");
            } else if (fileName.endsWith(".pdf")) {
                System.out.println("The given file is a portable document format.");
            } else if (fileName.endsWith(".txt")) {
                System.out.println("The given file is a text file.");
            } else {
                System.out.println("The file type is unknown.");
            }
        } else {
            System.out.println("\nThe given file " + fileName + " does not exist.");
        }

        scanner.close();
    }
}
