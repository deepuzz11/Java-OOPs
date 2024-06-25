package Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class main_payslip {
    public static void main(String[] args) {
        ArrayList<Employee> obj = new ArrayList<>();
        Scanner get = new Scanner(System.in);
        char ch;
        do {
            System.out.println("Enter the Emp_Name: ");
            String name = get.next();
            System.out.println("Enter the Emp_id: ");
            String id = get.next();
            System.out.println("Enter the Address: ");
            String address = get.next();
            System.out.println("Enter the Mail_id: ");
            String mail = get.next();
            System.out.println("Enter the Mobile_no: ");
            String mobile = get.next();
            System.out.println("Enter the Designation: ");
            String designation = get.next();
            System.out.println("Enter the Basic_Pay: ");
            double basicPay = get.nextDouble();

            Employee emp = null;
            if (designation.equalsIgnoreCase("Programmer")) {
                emp = new Programmer(name, id, address, mail, mobile, designation, basicPay);
            } else if (designation.equalsIgnoreCase("AssistantProfessor")) {
                emp = new AssistantProfessor(name, id, address, mail, mobile, designation, basicPay);
            } else if (designation.equalsIgnoreCase("AssociateProfessor")) {
                emp = new AssociateProfessor(name, id, address, mail, mobile, designation, basicPay);
            } else if (designation.equalsIgnoreCase("Professor")) {
                emp = new Professor(name, id, address, mail, mobile, designation, basicPay);
            } else {
                System.out.println("Invalid designation entered.");
            }

            if (emp != null) {
                obj.add(emp);
            }

            System.out.println("Do you want to continue? (Press 'y' for yes): ");
            ch = get.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');

        System.out.println("------------ Employees Pay Slips ------------");
        for (Employee e : obj) {
            e.display();
            if (e instanceof Programmer) {
                ((Programmer) e).paySlip();
            } else if (e instanceof AssistantProfessor) {
                ((AssistantProfessor) e).paySlip();
            } else if (e instanceof AssociateProfessor) {
                ((AssociateProfessor) e).paySlip();
            } else if (e instanceof Professor) {
                ((Professor) e).paySlip();
            }
            System.out.println("------------ End of the Statement -----------");
        }
    }
}
