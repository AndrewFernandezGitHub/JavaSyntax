package com.syntax.JavaClass26;

public class ShoppingCartTester {
    public static void main(String[] args) {
        ShoppingCart shoppingcart=new ShoppingCart();
       // shoppingcart.originalPrice=100;
        //shoppingcart.discount=.20;
        shoppingcart.calculatePrice();
        shoppingcart.setDiscount(.20);
        shoppingcart.calculatePrice();
        System.out.println(shoppingcart.getDiscount());
        shoppingcart.calculatePrice();
    }
}
