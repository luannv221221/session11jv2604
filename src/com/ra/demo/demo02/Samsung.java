package com.ra.demo.demo02;

public class Samsung implements IPhone, ISmartPhone {

    @Override
    public void call() {
        System.out.println("Samsung call");
    }

    @Override
    public void answer() {
        System.out.println("Samsung answer");
    }

    @Override
    public void touchSensor() {
        System.out.println("Samsung touch sensor");
    }
}
