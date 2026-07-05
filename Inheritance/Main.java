import java.util.*;

class Employee{
  public String empId;
  public String empName;
  public double baseSalary;

  Employee(String empId, String empName, double baseSalary){
    this.empId = empId;
    this.empName = empName;
    this.baseSalary = baseSalary;
  }

  void displaySalary(){
    System.out.println("Base Salary: " + this.baseSalary);
  }

  void displayInfo(){
    System.out.println("Employee Information: ");
    System.out.println("Employee Id: " + this.empId);
    System.out.println("Employee Name: " + this.empName);
  }
}

class Manager extends Employee{
  public double bonus;

  Manager(String empId, String empName, double BaseSalary, double bonus){
    super(empId, empName, BaseSalary);
    this.bonus = bonus;
  }
}

public class Main{
  public static void main(String[] args){
    Manager emp1 = new Manager("emp12", "Nikhil Verma", 88000, 8000);
    emp1.displayInfo();
    System.out.println("Employee Base Salary: ");
    emp1.displaySalary();
  }
}