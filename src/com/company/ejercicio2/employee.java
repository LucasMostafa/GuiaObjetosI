package com.company.ejercicio2;

public class employee {

    private String dni;
    private String name;
    private String surname;
    private double salary;

    public employee() {
    }

    public employee(String dni, String name, String surname, double salary){
        this.dni= dni;
        this.name= name;
        this.surname= surname;
        this.salary= salary;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double calculateAnnalSalary(){
        return this.salary * 12;
    }

    public void increaseSalary(double percentage){
        this.salary= this.salary + (this.salary * percentage/100);
    }

    public String getEmployee(){
        return "\nEmpleado: \nDNI: " + this.dni + "\nNombre: " + this.name + "\nApellido: " + this.surname + "\nSalario: " + this.salary;
    }
}
