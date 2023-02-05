package com.inventoryManagement;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        InventoryManagerSystem system = new InventoryManagerSystem();


        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                system.addProducts();
            }
        });
        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                system.displayProductsSold();

            }
        });
        threadA.start();

            Thread.sleep(3000);

        threadB.start();
    }
}
