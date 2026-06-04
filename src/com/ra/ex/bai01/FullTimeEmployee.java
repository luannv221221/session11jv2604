package com.ra.ex.bai01;

public class FullTimeEmployee extends Employee implements IBonusEligible {
    private double baseSalary;

    public FullTimeEmployee(int id, String name, double baseSalary) {
        super(id, name);
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + calculateBonus();
    }

    @Override
    public double calculateBonus() {
        return baseSalary * 0.10;
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Salary: " + calculateSalary());
    }
}
