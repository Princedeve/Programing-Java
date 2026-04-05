import java.util.*;;
public class tests {
 
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int item1 = 25;
        int item2 = 35;
        int item3 = 50;
        
        int total = 0;
        int choice = 1;

        while (choice == 1) {
            System.out.println("Select Item: ");
            System.out.println("1. Item1 = 25");
            System.out.println("2. Item2 = 35");
            System.out.println("3. Item3 = 50");

            int item = sc.nextInt();
            System.out.println("Enter quantity: ");
            int qty = sc.nextInt();

            int price = 0;

            if (item == 1) {
                price = 25;
            }else if(item == 2){
                price = 35;
            }else if(item == 3){
                price = 50;
            }else {
                System.out.println("Invalid item!");
                continue;
            }

            total = total + (price * qty);

            System.out.println("Press 1 to continue, 0 to stop: ");
            choice = sc.nextInt();

        }

        System.out.println("Total Bill = "+total);
     
    }
}
