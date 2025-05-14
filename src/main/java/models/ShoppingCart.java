/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author juans
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShoppingCart {
    private int id;
    private List<Product> products;

    public ShoppingCart(int id) {
        this.id = id;
        this.products = new ArrayList<>();
    }

    public boolean addProduct(Product product) {
        return products.add(product);
    }

    public boolean removeProduct(int productId) {
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product p = iterator.next();
            if (p.getId() == productId) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public Product searchProduct(int productId) {
        for (Product p : products) {
            if (p.getId() == productId) {
                return p;
            }
        }
        return null;
    }

    public int size() {
        return products.size();
    }

    public void buy() {
        for (Product p : products) {
            p.buy(1);  // Asume que se compra 1 unidad de cada producto
        }
        products.clear();
    }
}
