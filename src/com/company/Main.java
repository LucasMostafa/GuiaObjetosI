package com.company;

import com.company.ejercicio1.rectangle;

public class Main {

    public static void main(String[] args) {

        //Ejercicio 1
        rectangle rectangle= new rectangle();
        System.out.println("Ancho: " + rectangle.getBroad());
        System.out.println("Alto: " + rectangle.getHigh());
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimetro: " + rectangle.calculatePerimeter());

        rectangle.setBroad(100);
        rectangle.setHigh(50);
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimetro: " + rectangle.calculatePerimeter());
    }
}
