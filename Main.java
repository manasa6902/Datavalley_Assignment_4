/*Write a java program to create linkedlist with employee objects, sort the all object based name of employee and salary of employee. Note: take Employee as a class with id, name, designation and salary fields*/

import java.util.*;

class Employee {
    private int id;
    private String name;
    private String designation;
    private double salary;
    
    public Employee(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getDesignation() {
        return designation;
    }
    
    public double getSalary() {
        return salary;
    }
   
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee(101, "Priya", "Manager", 50000));
        employees.add(new Employee(102, "Hani", "Developer", 60000));
        employees.add(new Employee(103, "Pavan", "Designer", 55000));
        
        Collections.sort(employees, Comparator.comparing(Employee::getName));
        System.out.println("Employees sorted by name:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
        
        Collections.sort(employees, Comparator.comparing(Employee::getSalary));
        System.out.println("\nEmployees sorted by salary:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}