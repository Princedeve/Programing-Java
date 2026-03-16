import java.lang.*;
import java.util.*;
public class hello{
    public static int average(int a, int b, int c){
      return (a+b+c) / 3;
    }
    public static boolean isEven(int n){
      if(n%2==0){
        return true;
      }else{
      return false;
      }
    }
    public static void isPalindrom(int n){
      int m = n;
      int reverse = 0;

      while (m!=0) {
        int digits = m % 10;
        reverse = reverse * 10 + digits;
        m = m / 10;
      }
      if(reverse == n){
        System.out.println((n)+" is a palindrom");
      }else{
        System.out.println((n)+" is not a palindrom");
      }
    }
    public static int findMin(int a, int b){
      if(a<b){
        return a;
      }
      return b;
    }
    public static int findMax(int a, int b){
      if(a>b){
        return a;
      }
      return b;
    }
    public static double findSqrt(double n){
      
      double d = n/2.0;

      return d;
    }
    public static int calculatePow(int a, int b){
      int pow = 1;
      for(int i = 1; i<=b; i++){
        pow *= a;
        
      }
      return pow;
    }
    public static int findAbs(int n){
      int p = -1 * n;
      return p;
    }
    public static int sumOfDigits(int n){
      int sum = 0;
      while (n>0) {
        int digits = n % 10;
        sum += digits;
        n = n / 10;
      }
      return sum;
    }
    public static void main(String args []){
      int a = 2;
      int b = 3;
      int c = 4;
      // System.out.println(average(a, b, c));
      // System.out.println(isEven(7));
      // isPalindrom(121);
      // System.out.println(Math.min(a, b));
      // System.out.println(Math.max(a, b));
      // System.out.println(Math.sqrt(2));
      // System.out.println(Math.pow(a, b));
      // System.out.println(Math.abs(-32));//return positive value
      // System.out.println(findMin(a, b));
      // System.out.println(findMax(a, b));
      // System.out.println(findSqrt(2));
      // System.out.println(calculatePow(5,2));
      // System.out.println(findAbs(-4));
      // System.out.println(sumOfDigits(15));

    }
}