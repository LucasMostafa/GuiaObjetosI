package com.company.ejercicio1;

public class rectangle {

    private double broad = 1.0;
    private double high = 1.0;

    public rectangle() {
    }

    public rectangle(double broad, double high) {
        this.broad = broad;
        this.high = high;
    }

    public double getBroad() {
        return broad;
    }

    public void setBroad(double broad) {
        this.broad = broad;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double calculateArea() {
        return broad * high;
    }

    public double calculatePerimeter() {
        return 2 * (broad + high);
    }
}