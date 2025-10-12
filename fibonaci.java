public class fibonaci {
    public static int fib(int n ){
        int first = 0;
        int second = 1;

        for(int i = 1; i<=n; i++){
            int temp = first + second;
            first = second;
            second = temp;
        }
        return first;
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(fib(n));
    }
}
