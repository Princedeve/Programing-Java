import java.util.Scanner;

public class fizzbuzz {
    public static void main(String args[]){

      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      // for(int i = 1; i<=n; i++){
      //   if(i%3==0 && i%5==0){
      //     System.out.println("FizzBuzz");
      //   }else if(i%3==0){
      //     System.out.println("Fizz");
      //   }else if(i%5==0){
      //     System.out.println("Buzz");
      //   }else{
      //     System.out.println(i);
      //   }
      // }

      int count3 = 0, count5 = 0;
      for(int i = 1; i<=n; i++){
        count3++; count5++;
        if(count3!=3 && count5!=5){
          System.out.print(i+" ");
        }
        if(count3==3){
          System.out.print("fizz ");
          count3 = 0;//reset
        }
        if(count5==5){
          System.out.print("buzz ");
          count5 = 0;//reset
        }
      }

    }
}
