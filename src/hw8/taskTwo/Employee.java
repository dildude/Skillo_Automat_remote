package hw8.taskTwo;

public class Employee {
    int id;
    String firstName;
    String lastName;
    double salaryPerMonth;

    Employee(int id, String firstName, String lastName, double salaryPerMonth){

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salaryPerMonth = salaryPerMonth;

    }

    public String getName(){
        return firstName + " " + lastName;
    }

    public double getAnnualSalary(){
        return salaryPerMonth * 12;
    }

    public double raiseSalary(double percentage){
        salaryPerMonth = salaryPerMonth * (1 + percentage / 100);
        return salaryPerMonth;
    }

    public String toString(){
        return "Employee ID: " + id + "\n" +
                "Name: " + getName() + "\n" +
                "Salary per month: $" + salaryPerMonth + "\n" +
                "Annual salary: $" + getAnnualSalary();
    }

}
