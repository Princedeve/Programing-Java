package oops;
import java.util.*;
class BacnkAccount{ // data ko protact karna
    private double balance; // encapsulation

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }
    }

    public double getBalance(){
        return balance;
    }
}
public class encapsulation {
    public static void main(String[] args) {

        BacnkAccount account = new BacnkAccount();
        account.deposit(5000);

        System.out.println(account.getBalance());
    }
}
