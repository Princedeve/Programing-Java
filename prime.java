// import java.util.Scanner;
public class prime {
        public static boolean checkPrime(int n){
        boolean isPrime = true;
        if(n <= 1){
            System.out.println((n)+" is not a prime number");
            return isPrime;
        }

        for(int i = 2; i<n; i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            System.out.println((n)+" is a prime number");
        }else{
            System.out.println(n+" is not a prime number");
        }

        return isPrime;
    }

    // optimized
    //    public static boolean isPrime(int n){
    //     for(int i = 2; i<=Math.sqrt(n); i++){
    //         if(n % i == 0){
    //             return false;
    //         }
    //     }

    //     return true;
    // }
    public static boolean isPrime(int n) {
    if (n <= 1) return false;
    if (n == 2) return true;
    if (n % 2 == 0) return false;

    for (int i = 3; i <= Math.sqrt(n); i += 2) {
        if (n % i == 0)
            return false;
    }
    return true;
}

public static void primesInRange(int n){
    for(int i = 2; i<=n; i++){
        if(isPrime(i)){
            System.out.println(i);
        }
    }
}
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number: ");
        // int n = sc.nextInt();
        // int n = 2;
        // boolean isPrime = true;
        // if(n >= 0 && n <= 1){
        //     System.out.println((n)+" is not a prime number");
        //     return;
        // }
        // for(int i = 2; i<n; i++){
        //     if(n % i == 0){
        //         isPrime = false;
        //         break;
        //     }
        // }
        // if(isPrime){
        //     System.out.println((n)+" is a prime number");
        // }else{
        //     System.out.println((n)+" is not a prime number");
        // }

        checkPrime(3);

    }
}
