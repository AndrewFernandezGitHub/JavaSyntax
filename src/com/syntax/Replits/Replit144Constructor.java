package com.syntax.Replits;

public class Replit144Constructor {
    public static void main(String[] args) {
        StoreProduct obj = new StoreProduct("Eggs", 3.0, "Produce", true, 10);
        obj.display();
        StoreProduct obj1 = new StoreProduct("Paper Towels", 2.0, 24);
        obj1.display();
        StoreProduct obj2 = new StoreProduct("Paper Towels", 2.0);
        obj2.display();
    }
}
     class StoreProduct {
        String lable;
        double price;
        String category;
        boolean hasExpiration;
        int stock;

        StoreProduct(String lable, double price, String category, boolean
                hasExpiration, int stock) {
            this(lable, price);
            this.category = category;
            this.hasExpiration = hasExpiration;
            this.stock = stock;
        }

        StoreProduct(String lable, double price, int stock) {
            this(lable, price);
            this.stock = stock;
            this.category = "misc";
            this.hasExpiration = false;
        }

        StoreProduct(String lable, double price) {
            this.lable = lable;
            this.price = price;
            this.stock = 0;
        }

        public void display() {
            System.out.print(lable + " " + price + " " + category + " " + hasExpiration + " " +
                    stock + "\n");
        }
    }
