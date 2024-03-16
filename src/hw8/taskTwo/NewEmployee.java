package hw8.taskTwo;

public class NewEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee(1,"Mincho", "K.",2000);

        System.out.println("Employee details: " + "\n" + employee);

        employee.raiseSalary(10);

        System.out.println("\nEmployee salary will be: \n" + employee.salaryPerMonth + " after raise!");

    }
}
