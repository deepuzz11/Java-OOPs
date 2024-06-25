# Java code for generating an electricity bill based on certain specifications

package main;
import java.util.Scanner;

class ElectricityBill {
    private int consumerNo;
    private String consumerName;
    private int prevMonthReading;
    private int currMonthReading;
    private String ebConnectionType;

    public ElectricityBill(int consumerNo, String consumerName, int prevMonthReading, int currMonthReading, String ebConnectionType) {
        this.consumerNo = consumerNo;
        this.consumerName = consumerName;
        this.prevMonthReading = prevMonthReading;
        this.currMonthReading = currMonthReading;
        this.ebConnectionType = ebConnectionType;
    }

    public double calculateBillAmount() {
        int units = currMonthReading - prevMonthReading;
        double billAmount = 0;
        if (ebConnectionType.equalsIgnoreCase("domestic")) {
            if (units <= 100) {
                billAmount = units * 1;
            } else if (units <= 200) {
                billAmount = 100 + (units - 100) * 2.50;
            } else if (units <= 500) {
                billAmount = 100 + 100 * 2.50 + (units - 200) * 4;
            } else {
                billAmount = 100 + 100 * 2.50 + 300 * 4 + (units - 500) * 6;
            }
        } else if (ebConnectionType.equalsIgnoreCase("commercial")) {
            if (units <= 100) {
                billAmount = units * 2;
            } else if (units <= 200) {
                billAmount = 100 + (units - 100) * 4.50;
            } else if (units <= 500) {
                billAmount = 100 + 100 * 4.50 + (units - 200) * 6;
            } else {
                billAmount = 100 + 100 * 4.50 + 300 * 6 + (units - 500) * 7;
            }
        }
        return billAmount;
    }

    public void displayBill() {
        System.out.println("\n--- Electricity Bill ---");
        System.out.println("Consumer No: " + consumerNo);
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Previous Month Reading: " + prevMonthReading);
        System.out.println("Current Month Reading: " + currMonthReading);
        System.out.println("Type of EB Connection: " + ebConnectionType);
        System.out.println("Units Consumed: " + (currMonthReading - prevMonthReading));
        System.out.println("Bill Amount: Rs. " + calculateBillAmount());
    }
}

public class Mainprg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the type of connection (domestic or commercial): ");
        String ebConnectionType = scanner.nextLine();
        System.out.print("Enter the Consumer number: ");
        int consumerNo = scanner.nextInt();
        System.out.print("Enter the Consumer name: ");
        scanner.nextLine(); // Consume the newline character
        String consumerName = scanner.nextLine();
        System.out.print("Enter the previous month reading: ");
        int prevMonthReading = scanner.nextInt();
        System.out.print("Enter the current month reading: ");
        int currMonthReading = scanner.nextInt();
        
        ElectricityBill bill = new ElectricityBill(consumerNo, consumerName, prevMonthReading, currMonthReading, ebConnectionType);
        bill.displayBill();
    }
}
