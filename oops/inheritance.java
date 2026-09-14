package oops;
import java.util.*;
class Vehicle{ // parent se properties lena
    void start(){
        System.out.println("Vehicle start");
    }

    void stop(){
        System.out.println("Vehicle stop");
    }
}

class Car extends Vehicle{ // inheritance use extends
    void drive(){
        System.out.println("Car is driving");
    }
}
public class inheritance {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.drive();
        c1.start();
    }
}
