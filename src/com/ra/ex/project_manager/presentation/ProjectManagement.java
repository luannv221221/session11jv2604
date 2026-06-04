package com.ra.ex.project_manager.presentation;

import com.ra.ex.project_manager.entity.Employee;

import java.util.Scanner;

public class ProjectManagement {
    private static Employee[] employees = new Employee[1000];
    private static Scanner sc = new Scanner(System.in);
    private static  int index = 0;
    public static void main(String[] args) {
        do {
            System.out.println("===========QUAN LY DU AN============");
            System.out.println("1.Quan ly nhan vien");
            System.out.println("2.Quan ly du an");
            System.out.println("３. Thoát");
            System.out.println("Moi lua chon ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    employeeMenu();
                    break;
                case 2:
                    System.out.println("Quan ly du an");
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.err.println("Invalid choice");
            }
        } while (true);
    }
    public static void employeeMenu(){
        do {
            System.out.println("===========QUAN LY NHAN VIEN============");
            System.out.println("1.Them Nhan vien");
            System.out.println("2.Hien thi danh sach");
            System.out.println("3.Cap nhat thong tin");
            System.out.println("4. Xoa nhan vien");
            System.out.println("5. Tim kiem nhan vien theo ten");
            System.out.println("6. Sap xep nhan vien theo luongg giam dan");
            System.out.println("7. Thoat");
            System.out.println("Moi lua chon ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    displayEmployees();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.err.println("Invalid choice");
            }
        } while (true);
    }
    public static void addEmployee(){
        Employee employee = new Employee();
        employee.inputData(sc,employees,index);
        employees[index++] = employee;
        System.out.println("Them moi thanh cong");
    }

    public static void displayEmployees(){
        for (int i = 0; i < index; i++) {
            employees[i].displayData();
        }
    }
}
