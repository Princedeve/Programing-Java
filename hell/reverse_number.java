public class reverse_number {
    public static void main(String args []){
        int n = 10899;
        int reverse = 0;
        // String r = "";
        while (n!=0) { // 0<n
            int temp = n % 10;
            // r += temp;
            reverse = reverse * 10 + temp;
            n = n / 10;
            // System.out.println(n);
        }
        // System.out.println(r);
        System.out.println(reverse);
    }
}