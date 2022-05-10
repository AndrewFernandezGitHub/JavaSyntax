package com.syntax.JavaClass18;

public class Facebook {
   private String userName;
   private String password;
   private int age;
   void setAge(int personAge){
       if(age>5&& age<80){
           age=personAge;
       }else{
           System.out.println("Not allowed its not a horse");
       }
   }

   int getAge(String userPassword){
       //protecting the age with a password
       if(userPassword.equals(password)){
           return age;
       }else {
           return -1;
       }
   }

}
