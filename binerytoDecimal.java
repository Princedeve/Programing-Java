public class binerytoDecimal {
public static int power(int n, int pow){

    int result = 1;
    for(int i = 1; i<=pow; i++){
        result *= n;
    }
    return result;

}
public static void binToDec(int binNum){
    int mybin = binNum;
    int pow = 0;
    int decNum = 0; 
    while (binNum > 0) {// binNum != 0;
        int lasDigit = binNum % 10;
        decNum = decNum + (lasDigit * power(2, pow));
    // decNum = decNum + (lasDigit * (int)Math.pow(2, pow)); //type casting
        pow++;
        binNum = binNum / 10;
    }
    System.out.println("decimal of "+mybin+" = "+decNum);
    return;
}
public static void decToBin(int decNum){ 
    int myDec = decNum;
    int pow = 0;
    int binNum = 0;

    while (decNum > 0) {
        int rem = decNum % 2;
        binNum = binNum + rem * power(10, pow);
        pow++;
        decNum = decNum / 2;
    }
    System.out.println("binary of "+(myDec)+" = "+(binNum));
    return;
}
    public static void main(String[] args) {
        binToDec(101);
        binToDec(10100011);
        decToBin(11);
    }
}