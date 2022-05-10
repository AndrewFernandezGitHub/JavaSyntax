package com.syntax.Replits;

public class Replit181Encapsulation {
}
class Account181 {
    private String accountName;
    private String name;
    private String email;
    private double amount;

    Account181(String accountName, String name, String email, double amount) {
        setAccountName(accountName);
        setName(name);
        setEmail(email);
        setAmount(amount);

    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getAmount() {
        return amount;
    }
}
class R181Main{
    public static void main(String[] args) {
        Account181 account181=new Account181("123456789","Andrew","Andrew@gmail.com",5000.00);
        System.out.println(account181.getAccountName()+" "+account181.getName()+" "+account181.getEmail()+" "+account181.getAmount());
    }
}