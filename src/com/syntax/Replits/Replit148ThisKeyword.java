package com.syntax.Replits;

public class Replit148ThisKeyword {
    static class ShoppingStore {
        String item;
        double price;
        int quantity;
        ShoppingStore(String item,double price,int quantity){
            this.item=item;
            this.price=price;
            this.quantity=quantity;
        }
        double itemTotalPrice(){
            return price;
        }
    }
        public static void main(String[] args) {
            ShoppingStore item1 = new ShoppingStore("Blanket", 49.99, 2);
            ShoppingStore item2 = new ShoppingStore("Mattress", 439.18, 1);
            double item1Price = item1.itemTotalPrice();
            double item2Price = item2.itemTotalPrice();
            System.out.println(item1 + " Total Value " + item1Price);
            System.out.println(item1 + " Total Value " + item2Price);
            System.out.println("You purchased " + (item1Price + item2Price) + " Today");
        }
    }//need to figure out why getting the breadcrumbs instead of the actual string blanket and mattress
