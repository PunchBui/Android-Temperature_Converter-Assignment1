package com.example.punchja.homework_android_1.Model;

public class Temperature {
    private double temp;
    public Temperature(double temp) {
        this.temp = temp;
    }
    public double gettemperatue() {
        return this.temp;
    }
    public String toF() {
        return String.format("%.2f",(1.8*temp) + 32);
    }
    public String toC() {
        return String.format("%.2f",(temp - 32)* 5/9);
    }

}
