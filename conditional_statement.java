import java.util.Scanner;
public class conditional_statement{
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
//     System.out.println("Enter your salary: ");
//    int income = sc.nextInt();
//    int tax;
//    if(income < 500000){
//     tax = 0;
//    }else if(income >= 500000 && income < 1000000){
//     tax = (int) (income*0.2);
//    }else{
//     tax = (int) (income*0.3);
//    }

//    System.out.println("your tax is: "+ tax);
System.out.println("enter year: ");
int year = sc.nextInt();
// if(year % 4 == 0){
//     if(year % 100 == 0){
//         if(year % 400 == 0){
//             System.out.println("Leap Year");
//         }else{
//             System.out.println("Not a Leap Year");
//         }
//     }else{
//         System.out.println("Leap Year");
//     }

// }else{
//     System.out.println("Not a Leap Year");
// }
boolean x = (year % 4) == 0;
boolean y = (year % 100) != 0;
boolean z = ((year % 100 == 0) && (year % 400 == 0));
if (x && (y || z)) {
    System.out.println(year+" is a leap year");
}else{
    System.out.println(year+" is not a laap year");
}
    }
}