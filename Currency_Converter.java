package CurrencyConverter;
import java.util.Scanner;

public class CurrencyConverter {
    public void dollartoinr() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount in Dollars: ");
        float a = input.nextFloat();
        float inr = a * 82.30f;
        System.out.println("Dollar " + a + " is INR " + inr);
    }

    public void inrtodollar() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount in INR: ");
        float a = input.nextFloat();
        float dollar = a / 82.30f;
        System.out.println("INR " + a + " is Dollar " + dollar);
    }

    public void yentoinr() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount in Yen: ");
        float a = input.nextFloat();
        float inr = a * 0.58f;
        System.out.println("Yen " + a + " is INR " + inr);
    }

    public void inrtoyen() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount in INR: ");
        float a = input.nextFloat();
        float yen = a / 0.58f;
        System.out.println("INR " + a + " is Yen " + yen);
    }

    public void eurotoinr() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount in Euro: ");
        float a = input.nextFloat();
        float inr = a * 90.55f;
        System.out.println("Euro " + a + " is INR " + inr);
    }

    public void inrtoeuro() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount in INR: ");
        float a = input.nextFloat();
        float euro = a / 90.55f;
        System.out.println("INR " + a + " is Euro " + euro);
    }

    public static void main(String[] args) {
        CurrencyConverter cov = new CurrencyConverter();
        cov.dollartoinr();
        cov.inrtodollar();
        cov.eurotoinr();
        cov.inrtoeuro();
        cov.yentoinr();
        cov.inrtoyen();
    }
}
