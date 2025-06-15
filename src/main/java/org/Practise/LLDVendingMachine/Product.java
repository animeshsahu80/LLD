package org.Practise.LLDVendingMachine;

public class Product {
    String name;
    double price;
    int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Product(String name, double price, int code) {
        this.name = name;
        this.price = price;
        this.code= code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
