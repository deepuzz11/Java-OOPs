package DistanceConverter;
import java.util.Scanner;

public class DistanceConverter {
    public void kmtom() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        int a = input.nextInt();
        int m = a * 1000;
        System.out.println("Kilometers " + a + " is meters " + m);
    }

    public void mtokm() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in meters: ");
        int a = input.nextInt();
        float km = a / 1000f;
        System.out.println("Meters " + a + " is kilometers " + km);
    }

    public void milestokm() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in miles: ");
        int a = input.nextInt();
        float km = a * 1.61f;
        System.out.println("Miles " + a + " is kilometers " + km);
    }

    public void kmtomiles() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        int a = input.nextInt();
        float miles = a / 1.61f;
        System.out.println("Kilometers " + a + " is miles " + miles);
    }

    public static void main(String[] args) {
        DistanceConverter con = new DistanceConverter();
        con.kmtom();
        con.mtokm();
        con.kmtomiles();
        con.milestokm();
    }
}
