package com.syntax.JavaClass18;

public class Account {

    private String userName="Andrew";
    private String password="Admin";
    public String accountNumber="123456";
    private double balance=-1500;

    private void printUserName(){
        System.out.println(userName);
    }
    protected void printPassword(){
        System.out.println(password);
    }
void printBalance(){
    System.out.println(balance);
}
public void printAccountNumber(){
    System.out.println(accountNumber);
}

    public static void main(String[] args) {
        Account ac=new Account();
        ac.printUserName();
        ac.printBalance();
        ac.printAccountNumber();
        ac.printPassword();
    }
}
