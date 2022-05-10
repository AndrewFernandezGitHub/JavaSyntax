package com.syntax.JavaClass25;

interface Healthable{
    void healthy();
}
public interface Walk extends Healthable {
    //void healthy();
    void burnCalories();
}
interface Milk extends Healthable{
   // void healthy();
    void giveEnergy();
}
interface Banana extends Healthable{
   // void healthy();
    void giveEnergy();
}
class Demo implements Banana{
    @Override
    public void healthy(){
        System.out.println("Banana is good for health");
    }
    @Override
    public void giveEnergy(){
        System.out.println("It gives us energy");
    }
}