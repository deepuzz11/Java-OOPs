// Custom exception class for handling invalid age
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class USD_Exception_Handling {
    // Method to check age and throw custom exception if age is less than 18
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("You must be at least 18 years old to access this content.");
        }
    }

    public static void main(String[] args) {
        try {
            int age = 15; // Example age
            checkAge(age);
            System.out.println("Welcome! You can access this content.");
        } catch (InvalidAgeException e) {
            System.err.println("Custom Exception: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
