package SRP;

public class SalaryCalculator {
    public double calculateBonus(Employee employee) {
        // For the sake of simplicity, let's assume it's 10% of the salary
        return employee.getSalary() * 0.1;
    }
}
