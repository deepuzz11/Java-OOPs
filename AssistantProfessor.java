package Employee;

public class AssistantProfessor extends Employee {
    double bPay;
    String des;

    public AssistantProfessor(String name, String id, String address, String mail, String mobile,
                              String designation, double basicPay) {
        super(name, id, address, mail, mobile);
        des = designation;
        bPay = basicPay;
    }

    public void paySlip() {
        float da = (float) (bPay * 0.97);
        float hra = (float) (bPay * 0.10);
        double grossSalary = bPay + da + hra;
        float pf = (float) (bPay * 0.12);
        double scf = bPay * 0.001;
        double netSalary = grossSalary - pf - scf;
        System.out.println("Designation: " + des);
        System.out.println("Basic_Pay: " + bPay);
        System.out.println("Gross Salary : " + grossSalary);
        System.out.println("Net Salary : " + netSalary);
    }
}
