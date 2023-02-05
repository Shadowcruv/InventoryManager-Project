package com.inventoryManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventoryManagerSystem {

   private List<Product>  soldProductList  = new CopyOnWriteArrayList<>();
   private List<Product>  purchasedList   = new CopyOnWriteArrayList<>();

   public void addProducts(){
       for (int i=1;i<1001; i++ ){
          Product product = new Product(i,"product" + i);
           soldProductList.add(product);
           System.out.println("ADDED : " + product);
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
   }

   public void displayProductsSold(){
       for (Product product: soldProductList) {
           System.out.println("PRINTING SOLD PRODUCT : "+ product);
           try {
               Thread.sleep(53333000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }

   }
}
