package com.syntax.JavaClass25;
//generated getter setter to print the individuals
public class BankAccount {
   private double balance=12345;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String userName="Andrew";
   private String password="Andrew123";
   void printBalance(String userName,String password){
       if(userName.equals(this.userName)&&password.equals(this.password)){
           System.out.println(balance);
       }else{
           System.out.println("username or password is incorrect");
       }
   }
}
