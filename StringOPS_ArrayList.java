import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> stringList = new ArrayList<>();
        
        // Adding initial strings to the ArrayList
        stringList.add("Rajesh");
        stringList.add("Priya");
        stringList.add("Amit");
        stringList.add("Sunita");
        stringList.add("Vikram");

        // Menu-driven loop to perform string operations
        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Append a string");
            System.out.println("2. Insert a string at a specific index");
            System.out.println("3. Search for a string");
            System.out.println("4. List all strings starting with a given letter");
            System.out.println("5. Display all strings");
            System.out.println("6. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter a string to append: ");
                    String appendString = scanner.nextLine();
                    stringList.add(appendString);
                    System.out.println("String appended successfully.");
                    break;
                case 2:
                    System.out.print("Enter a string to insert: ");
                    String insertString = scanner.nextLine();
                    System.out.print("Enter the index to insert at: ");
                    int insertIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    if (insertIndex >= 0 && insertIndex <= stringList.size()) {
                        stringList.add(insertIndex, insertString);
                        System.out.println("String inserted successfully.");
                    } else {
                        System.out.println("Invalid index. String not inserted.");
                    }
                    break;
                case 3:
                    System.out.print("Enter a string to search: ");
                    String searchString = scanner.nextLine();
                    if (stringList.contains(searchString)) {
                        System.out.println("String found in the list.");
                    } else {
                        System.out.println("String not found in the list.");
                    }
                    break;
                case 4:
                    System.out.print("Enter a letter to filter strings: ");
                    char letter = scanner.nextLine().charAt(0);
                    System.out.println("Strings starting with '" + letter + "':");
                    for (String str : stringList) {
                        if (str.startsWith(String.valueOf(letter))) {
                            System.out.println(str);
                        }
                    }
                    break;
                case 5:
                    System.out.println("All strings in the list:");
                    for (String str : stringList) {
                        System.out.println(str);
                    }
                    break;
                case 6:
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
