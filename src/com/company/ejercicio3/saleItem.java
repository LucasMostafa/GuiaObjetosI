package com.company.ejercicio3;

public class saleItem {
    private int id;
    private String description;
    private int amount;
    private double unitaryPrice;

    public saleItem(){
    }

    public saleItem(int id, String description, int amount, double unitaryPrice){
        this.id= id;
        this.description= description;
        this.amount= amount;
        this.unitaryPrice= unitaryPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getUnitaryPrice() {
        return unitaryPrice;
    }

    public void setUnitaryPrice(double unitaryPrice) {
        this.unitaryPrice = unitaryPrice;
    }

    public double calculateTotalPrice(){
        return this.unitaryPrice * this.amount;
    }

    public String getSaleItem(){
        return "Item venta || Id: " + this.id + " | Descripcion: " + this.description + "| Cantidad: " + this.amount + " | Precio unitario: " + this.unitaryPrice + " | Precio total: " + calculateTotalPrice();
    }
}
