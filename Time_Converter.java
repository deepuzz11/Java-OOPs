package TimeConverter;
import java.util.Scanner;

public class TimeConverter {
    public void hrtomin() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter time in hours: ");
        int a = input.nextInt();
        int min = a * 60;
        System.out.println("Hours " + a + " is minutes " + min);
    }

    public void mintohr() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter time in minutes: ");
        int a = input.nextInt();
        float hr = a / 60f;
        System.out.println("Minutes " + a + " is hours " + hr);
    }

    public void hrtosec() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter time in hours: ");
        int a = input.nextInt();
        int sec = a * 3600;
        System.out.println("Hours " + a + " is seconds " + sec);
    }

    public void sectohr() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter time in seconds: ");
        int a = input.nextInt();
        float hr = a / 3600f;
        System.out.println("Seconds " + a + " is hours " + hr);
    }

    public static void main(String[] args) {
        TimeConverter cor = new TimeConverter();
        cor.hrtomin();
        cor.mintohr();
        cor.hrtosec();
        cor.sectohr();
    }
}
