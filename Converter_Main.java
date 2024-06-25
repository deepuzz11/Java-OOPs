package main;
import Currency_converter.CurrencyConverter;
import Distance_converter.DistanceConverter;
import Time_converter.TimeConverter;
import java.util.Scanner;

public class Converter_Main {
    public static void main(String[] args) {
        System.out.println("Select Converter: \n1. Currency Converter\n2. Distance Converter\n3. Time Converter");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        switch(choice) {
            case 1:
                CurrencyConverter currencyConverter = new CurrencyConverter();
                System.out.println("Currency Converter Options:\n1. Dollar to INR\n2. INR to Dollar\n3. Euro to INR\n4. INR to Euro\n5. Yen to INR\n6. INR to Yen");
                int currencyChoice = input.nextInt();
                switch(currencyChoice) {
                    case 1:
                        currencyConverter.dollartoinr();
                        break;
                    case 2:
                        currencyConverter.inrtodollar();
                        break;
                    case 3:
                        currencyConverter.eurotoinr();
                        break;
                    case 4:
                        currencyConverter.inrtoeuro();
                        break;
                    case 5:
                        currencyConverter.yentoinr();
                        break;
                    case 6:
                        currencyConverter.inrtoyen();
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
                break;
            case 2:
                DistanceConverter distanceConverter = new DistanceConverter();
                System.out.println("Distance Converter Options:\n1. KM to M\n2. M to KM\n3. Miles to KM\n4. KM to Miles");
                int distanceChoice = input.nextInt();
                switch(distanceChoice) {
                    case 1:
                        distanceConverter.kmtom();
                        break;
                    case 2:
                        distanceConverter.mtokm();
                        break;
                    case 3:
                        distanceConverter.milestokm();
                        break;
                    case 4:
                        distanceConverter.kmtomiles();
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
                break;
            case 3:
                TimeConverter timeConverter = new TimeConverter();
                System.out.println("Time Converter Options:\n1. Hours to Minutes\n2. Minutes to Hours\n3. Hours to Seconds\n4. Seconds to Hours");
                int timeChoice = input.nextInt();
                switch(timeChoice) {
                    case 1:
                        timeConverter.hrtomin();
                        break;
                    case 2:
                        timeConverter.mintohr();
                        break;
                    case 3:
                        timeConverter.hrtosec();
                        break;
                    case 4:
                        timeConverter.sectohr();
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
