import java.util.Scanner;

/**
 * Create a Java class named Employee with private
 * attributes for name, position, and salary.
 * Write a method to display the employee's details.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee name:");
        String name = scanner.nextLine();
        System.out.println("Enter employee position:");
        String position = scanner.nextLine();
        System.out.println("Enter employee salary:");
        double salary = scanner.nextDouble();

        Employee employee = new Employee(name, position, salary);

        // Displaying the employee details
        System.out.println("Employee Details:");
        employee.displayEmployeeDetails();

        scanner.close();
    }
}