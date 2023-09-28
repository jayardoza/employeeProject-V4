package Employee;

import java.util.Date;

public class Employee {
    protected int empID;
    protected Name empName;
    protected Date empDateHired;
    protected Date empBirthDate;
    protected String type;

    public Employee(int empID, Name empName, Date empDateHired, Date empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public double computeSalary() {
        return 0.0;
    }
    public int getEmpID() {
        return empID;
    }

    public Name getEmpName() {
        return empName;
    }

    public Date getEmpDateHired() {
        return empDateHired;
    }

    public Date getEmpBirthDate() {
        return empBirthDate;
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + empID);
        System.out.println("Employee Name: " + empName);
        System.out.println("Date Hired: " + empDateHired);
        System.out.println("Date of Birth: " + empBirthDate);
    }

    @Override
    public String toString() {
        return "Employee ID: " + empID + "\nEmployee Name: " + empName;
    }
}
