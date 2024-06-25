package Employee;

public class Employee {
    String Emp_name;
    String Emp_id;
    String Address;
    String Mail_id;
    String Mobile_no;

    public Employee(String name, String id, String address, String mail, String mobile) {
        Emp_name = name;
        Emp_id = id;
        Address = address;
        Mail_id = mail;
        Mobile_no = mobile;
    }

    public void display() {
        System.out.println("Emp_Name : " + Emp_name);
        System.out.println("Emp_id : " + Emp_id);
        System.out.println("Address : " + Address);
        System.out.println("Mail_id : " + Mail_id);
        System.out.println("Mobile_no : " + Mobile_no);
    }
}
