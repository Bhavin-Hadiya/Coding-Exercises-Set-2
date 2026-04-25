import java.util.Scanner;

public class Employee {

    // Private instance variables
    private String employeeName;
    private double employeeSalary;

    // Method to read employee data from user
    public void readEmployeeData() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Employee Name   : ");
        employeeName = input.nextLine();

        System.out.print("Enter Employee Salary : ");
        employeeSalary = input.nextDouble();
    }

    // Method to display employee data
    public void displayEmployeeData() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Name   : " + employeeName);
        System.out.println("Salary : " + employeeSalary);
    }

    // Main method to demonstrate object creation and method calls
    public static void main(String[] args) {

        // Create Employee object
        Employee emp = new Employee();

        // Call read method to take input
        emp.readEmployeeData();

        // Call display method to print data
        emp.displayEmployeeData();
    }
}