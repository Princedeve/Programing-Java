public class armstrong{
    public static void main(String args[]){
        int n = 153;
        int check = n;
        int digits = String.valueOf(n).length();
        int result = 0;

        while (n != 0) {
            int digit = n % 10;
            result += Math.pow(digit, digits);
            n = n / 10;
        }
        
        if(check == result){
            System.out.println((check)+" is a armstrong number");
        }else{
            System.out.println((check)+" is not a armstrong number");
        }
       
    }
}