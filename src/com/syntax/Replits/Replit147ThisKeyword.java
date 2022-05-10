package com.syntax.Replits;

public class Replit147ThisKeyword {
    public static void main(String[] args) {
        carObjects toyota = new carObjects("Toyota", 2500, 1000);
        carObjects bmw = new carObjects("BMW", 6529.8, 100);
        toyota.carStockValue();
        bmw.carStockValue();
    }
}
   class carObjects {
        String model;
        double price;
        int quantity;

        carObjects(String model, double price, int quantity) {
            this.model = model;
            this.price = price;
            this.quantity = quantity;
        }

        void carStockValue() {
            double stock_Value = price * quantity;
            System.out.println(model + " 2019 Stock Value " + stock_Value);
        }
    }
