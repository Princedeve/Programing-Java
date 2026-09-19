import java.util.*;

public class test {
    public static int power(int n, int m){
        int result = 1;
        for(int i = 1; i<=m; i++){
            result *= n;
        }
        return result;
    }
    public static void binaryToDecimal(int n){
        int decimal = 0;
        int power = 0;
        while (n > 0) {
            int digit = n % 10;
            decimal += digit * power(2,power);
            power++;
            n = n / 10;
        }
        System.out.println(decimal);
    }
    public static void main(String[] args) {
        // for(int i = 2; i%3!=0||i%5!=0; i++){
        //     System.out.println(i+" ");
        // }

        //Fizz Buzz
        // for(int i = 1; i<=30; i++){
        //     if(i%3==0){
        //         System.out.println("fizz ");
        //     }
        //     if(i%5==0){
        //         System.out.println("buzz ");
        //     }
        //     if(i%3!=0&&i%5!=0){
        //         System.out.println(i);
        //     }
        // }
        //optimiz
        // int counter3 = 0, counter5 = 0;
        // for(int i = 1; i<=30; i++){
        //     counter3++; counter5++;

        //     if(counter3 != 3 && counter5!=5){
        //         System.out.println(i+" ");
        //     }else if(counter3 == 3){
        //         System.out.println("fizz");
        //         counter3 = 0;
        //     }
        //     if(counter5 == 5){
        //         System.out.println("buzz");
        //         counter5 = 0;
        //     }
        // }
        binaryToDecimal(1010);
       
    }

}