import java.util.*;

public class test {
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
        int counter3 = 0, counter5 = 0;
        for(int i = 1; i<=30; i++){
            counter3++; counter5++;

            if(counter3 != 3 && counter5!=5){
                System.out.println(i+" ");
            }else if(counter3 == 3){
                System.out.println("fizz");
                counter3 = 0;
            }
            if(counter5 == 5){
                System.out.println("buzz");
                counter5 = 0;
            }
        }
    }

}