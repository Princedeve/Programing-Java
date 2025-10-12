

public class h {
    public static void main(String args[]){
        int n = 153;
        int number = n;
        int result = 0;
        int digits = String.valueOf(n).length();
        
        while (n != 0) {
            int digit = n % 10;
            result += Math.pow(digit, digits);
            n = n / 10;
        }

        if(number == result){
            System.out.println("is armstrong");
        }else{
            System.out.println("is not armstrong");
        }
    }
}
