package object_oriented.getter_setter.CarOwner;

import object_oriented.getter_setter.methods.MyCar;

public class CarOwner {
    public static void main(String[] args){
        MyCar BMW = new MyCar( "Black", "BMW", 100.0, 1000000);
        System.out.println(BMW);
        BMW.setColor("Red");
        BMW.setModel("Toyota");
        System.out.println(BMW);
    }
}
