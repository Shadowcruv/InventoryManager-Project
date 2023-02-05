package com.inventoryManagement;

public class Product {
    private String name;
    private int id;

    public Product(int id, String name) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
