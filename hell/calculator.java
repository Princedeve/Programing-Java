
public class calculator {
    public static void calculator(int x, int y, int check){
        switch (check) {
            case 1: System.out.println(x+y);
            break;
            case 2: System.out.println(x-y);
            break;
            case 3: System.out.println(x*y);
            break;
        default: System.out.println("not valid");   
        break;
    }
    }
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        int check = 2;
        calculator(x, y, check);
    }
   
}
