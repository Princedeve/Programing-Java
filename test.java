import java.util.Scanner;

public class test {
    public static int pow(int a, int b){
        int r = 1;
        int c = 0;
       while (b>0) {
        b = b / 10;
        c++;
       }
       for(int i = 0; i<c; i++){
        r = r * a;
       }
        return r;
    }
    public static void main(String[] args) {
    //   int n = 123;
    //     int reverse = 0;
    //     while (n>0) { // n!=0
    //         int temp = n % 10;
    //         reverse = reverse * 10 + temp;
    //         n = n / 10;
    //     }
    //     System.out.println(reverse);

    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // for(int i = 1; i<=n; i++){
    //     int inp = sc.nextInt();
    //     if(inp >0){
    //         System.out.println("positive");
    //     }else if(inp<0){
    //         System.out.println("negative");
    //     }else{
    //         System.out.println("zero");
    //     }
    // }

    // int a = 63, b = 36;
    // boolean x = (a<b)? true: false;
    // int y = (a>b)? a: b;
    // System.out.println(x+" , "+y);

    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // if(n%4==0){
    //     if(n%100==0){
    //         if(n%400==0){
    //             System.out.println("Leap Year");
    //         }else{
    //             System.out.println("Not a leap year");
    //         }
    //     }else{
    //         System.out.println("Leap year");
    //     }
    // }else{
    //     System.out.println("Not a leap year");
    // }
    // int reverse = 0;
    // while (n!=0) {
    //     int temp = n % 10;
    //     reverse = reverse * 10 + temp;
    //     n = n / 10;
    // }
    // System.out.println(reverse);


// float sum = 0;
// float result = 0;
//     for(int i = 1; i<=n; i++){
//         System.out.println("Enter value "+(i)+" : ");
//         float val = sc.nextFloat();
//         sum += val;
//         // result = sum / n;
//     }
//     System.out.println(sum/n);
    // System.out.println("Average of n : "+ result);
    // System.out.println(n);
   int n = 153;
   int n1 = n;
   int rev = 0;
   for(int i = 1; n>0; i++){
    int d = n % 10;
    int p = pow(d,n1);
    rev = rev + p;
    n = n / 10;
   }

   System.out.println(rev);

    }
}

// fizz buzz      
// if number is multiply by 3 return fizz
// if number is multiply by 5 return buzz
// if number is multiply by both then return fizz buzz
// if number is not multiply by from these conditions so retrun number
// n = 30 