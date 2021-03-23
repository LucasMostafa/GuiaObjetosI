package com.company.ejercicio4;

public class bankAccount {
    private int id;
    private String name;
    private double balance;

    public bankAccount(){
    }

    public bankAccount(int id, String name, double balance){
        this.id= id;
        this.name= name;
        this.balance= balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //Inciso A
    public double credit(double deposit){
        this.balance= this.balance + deposit;
        return this.balance;
    }

    //Inciso B
    public double debit(double retirement){
        if(this.balance>=retirement)
            this.balance= this.balance - retirement;
        else
            System.out.println("No hay dinero suficiente en la cuenta.");
        return this.balance;
    }

    //Inciso C
    public String getBankAccount(){
        return "Cuenta bancaria || Id: " + this.id + " | Nombre: " + this.name + " | Balance: " + this.balance;
    }
}
