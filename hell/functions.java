public class functions {
    public static int findProduct(int a, int b) {
       System.out.println("Product of a & b is : "+(a*b));
        return 1;
    }
    public static int findFactorial(int n){
        int fact = 1;
        for(int i = 1; i<=n; i++){
            fact *= i;
        }
        return fact;
    }
    public static int binomialCoefficient(int n, int r){
        int n_fact = findFactorial(n);
        int r_fact = findFactorial(r);
        int nmr_fact = findFactorial(n-r);

        int bc = n_fact / (r_fact * nmr_fact);
        return bc;
    }

    public static int sum(int a, int b){
        return a+b;
    }
    public static float sum(float a, float b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }

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
    //   int n = 5;
    //   int r = 2;
    //   System.out.println(binomialCoefficient(n, r));

    // double n = 4;
    // n = Math.pow(n, 2);// 16
    // System.out.println(Math.sqrt(n));// 4*4 = 16

    // System.out.println(sum(2, 3));
    // System.out.println(sum(1.0f, 2.3f));

    // checkPrime(3);
    // System.out.println(isPrime(5));

    // primesInRange(10);


    }
}
