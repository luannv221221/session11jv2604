package com.ra.ex.bai01;

public class PartTimeEmployee extends Employee{
    private int workingHours;
    private double hourlyRate;

    public PartTimeEmployee(int id, String name, int workingHours, double hourlyRate) {
        super(id, name);
        this.workingHours = workingHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return workingHours * hourlyRate;
    }

    @Override
    public void showInfo()
    {
        super.showInfo();
        System.out.println("So gio lam viec : "+workingHours);
        System.out.println(" Lương theo giờ : "+hourlyRate);
        System.out.println(" Salary : "+calculateSalary());
    }
}
