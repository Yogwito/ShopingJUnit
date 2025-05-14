/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

public class Product {
    private int id;
    private String name;
    private double price;
    private int stock;

    public Product(int id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public double buy(int amount) {
        if (stock < amount) {
            throw new ProductOutOfStockException("Not enough stock for product: " + name);
        }
        stock -= amount;
        return price * amount;
    }

    public int getId() {
        return id;
    }

    // Otros getters y setters si es necesario
}
