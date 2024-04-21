package SRP;

//*************************************************************************
// Title : A java programme to demonstrate Single Responsibility Principle.
// Author : Sanjidul Hasan Hasib, Undergrduate student, Khulna University.
//*
public class Main {
    public static void main(String[] args) {
        // Create an employee object
        Employee employee = new Employee("John Doe", 50000);

        // Create an instance of SalaryCalculator
        SalaryCalculator calculator = new SalaryCalculator();

        // Calculate and print the bonus
        double bonus = calculator.calculateBonus(employee);
        System.out.println("Bonus: " + bonus);

        // Create an instance of EmployeePrinter
        EmployeePrinter printer = new EmployeePrinter();

        // Print employee details
        printer.printEmployeeDetails(employee);
    }

}

/*
 * The Employee class is responsible for representing employee data.
 * The EmployeePrinter class is responsible for printing employee details.
 * The SalaryCalculator class is responsible for calculating the bonus based on
 * an employee's salary.
 *
 */
