package oops;
import java.util.*;
class Calculator{ // one name diffrenet behavior
    // Method overloading
    int add(int a, int b){
        return a+b;
    }
// same method name but different parameters
    int add(int a, int b, int c){
        return a+b+c;
    }
}

class Animal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}

class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Cat meows");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}
public class polymorphism {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(10, 20));
        System.out.println(c.add(10, 20, 30));

        Animal a1 = new Dog();
        Animal a2 = new Cat();
        a1.sound();
        a2.sound();
    }
}
