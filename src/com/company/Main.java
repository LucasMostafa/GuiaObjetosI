package com.company;

import com.company.ejercicio1.rectangle;
import com.company.ejercicio2.employee;
import com.company.ejercicio3.saleItem;
import com.company.ejercicio4.bankAccount;
import com.company.ejercicio5.hour;

public class Main {

    public static void main(String[] args) {

        /////////////        /////////////
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

        /////////////        /////////////
        //Ejercicio 2
        //Inciso A
        employee employee1= new employee();
        employee employee2= new employee();

        employee1.setDni("23456345");
        employee1.setName("Carlos");
        employee1.setSurname("Gutierrez");
        employee1.setSalary(25000);

        //Inciso B
        employee2.setDni("34234123");
        employee2.setName("Ana");
        employee2.setSurname("Sanchez");
        employee2.setSalary(27500);

        //Inciso C
        System.out.println(employee1.getEmployee());
        System.out.println(employee2.getEmployee());

        //Inciso D
        employee1.increaseSalary(15);
        System.out.println("Salario anual aumentado: " + employee1.calculateAnnalSalary());

        /////////////        /////////////
        //Ejercicio 3
        saleItem item1= new saleItem();

        //Inciso A
        item1.setId(1);
        item1.setDescription("Fernet branca");
        item1.setAmount(5);
        item1.setUnitaryPrice(450);

        //Inciso B
        System.out.println(item1.getSaleItem());

        /////////////        /////////////
        //Ejercicio 4
        //Inciso 1
        bankAccount account1= new bankAccount();

        account1.setBalance(15000);
        account1.setId(19);
        account1.setName("Lucas Mostafa");
        System.out.println(account1.getBankAccount());

        //Inciso 2
        account1.credit(2500);
        System.out.println(account1.getBankAccount());

        //Inciso 3
        account1.debit(1500);
        System.out.println(account1.getBankAccount());

        //Inciso 4
        account1.debit(30000);

        /////////////        /////////////
        //Ejercicio 5
        hour time= new hour(23, 59, 59);

        System.out.println(time.toString());

        time.addSecond();
        time.addSecond();
        time.addSecond();
        System.out.println(time.toString());

        time.backSecond();
        System.out.println(time.toString());
    }
}
