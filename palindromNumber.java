public class palindromNumber {
    // 121 
    public static void main(String args[]){
        int orignal = 121;
        int number = orignal;
        int revers = 0;
        while (number != 0) {
            int digits = number % 10;
            revers = revers * 10 + digits;
            number = number / 10;
        }
          
        if( revers == orignal){
            System.out.println((orignal)+" is a palindrom number.");
        }else{
            System.out.println((orignal)+" is not a palindrom number.");
        }
    }
}
