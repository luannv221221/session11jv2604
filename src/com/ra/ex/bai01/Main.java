package com.ra.ex.bai01;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new FullTimeEmployee(1,"Nguyen Van A",100);
        Employee employee2 = new FullTimeEmployee(2,"Nguyen Van B",50);
        Employee employee3 = new PartTimeEmployee(3,"Nguyen Thi Mai",24,8);
        Employee[] employees = {employee1,employee2,employee3};
        for (Employee employee : employees) {
            employee.showInfo();
            System.out.println("Bonus: "+(employee instanceof IBonusEligible ? ((IBonusEligible) employee).calculateBonus(): "Khong co bunus"));
        }
    }
}
