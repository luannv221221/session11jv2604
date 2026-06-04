package com.ra.ex.project_manager.entity;

import java.util.Scanner;

public class Employee {
    private String employeeId;
    private String employeeName;
    private Role role;
    private double salary;

    public Employee() {
    }

    public Employee(String employeeId, String employeeName, Role role, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.role = role;
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void inputData(Scanner scanner,Employee[] employees,int index) {
        this.employeeId = inputEmployeeId(scanner,employees,index);
        System.out.println("Enter employee name:");
        this.employeeName = scanner.nextLine();
        this.role = inputEmployeeRole(scanner);
        System.out.println("Enter salary:");
        this.salary = Double.parseDouble(scanner.nextLine());
    }

    public String inputEmployeeId(Scanner scanner,Employee[] employees,int index) {
        while(true){
            System.out.println("Enter Employee ID ");
            String employeeId = scanner.nextLine();
            boolean isDuplicate = false;
            for (int i = 0; i < index; i++) {
                if (employees[i].getEmployeeId().equals(employeeId)) {
                    isDuplicate = true;
                    break;
                }
            }
            if(isDuplicate){
                System.err.println("Employee ID already exists");
            }
            else{
                return employeeId;
            }
        }
    }
    public Role inputEmployeeRole(Scanner scanner) {
        while (true){
            System.out.println("Enter number ");
            System.out.println("1. DEV");
            System.out.println("2. TESTER");
            System.out.println("3. PM");
            System.out.println("4. BA");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    return Role.DEV;
                case 2:
                    return Role.TESTER;
                case 3:
                    return Role.PM;
                case 4:
                    return Role.BA;
                default:
                    System.err.println("Invalid choice");
            }
        }
    }

    public void displayData(){
        System.out.println("Employee ID: "+employeeId);
        System.out.println("Employee name:: "+employeeName);
        System.out.println("Role: "+role);
        System.out.println("Salary: "+salary);
    }
}
