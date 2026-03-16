public class patterns {
    public static void main(String[] args) {
        // int n = 4;
        // for(int i = n; i>=1; i--){
        //     for(int j = i; j>=1; j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i = 1; i<=n; i++){
        //     for(int j = 1; j<=n-i+1; j++){//3+1,2+1,1+1,0+1
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int line = 1; line<=4; line++){
        //     for(int number = 1; number<=line; number++){
        //         System.out.print(number);
        //     }
        //     System.out.println();
        // }
        // int n = 4;
        // char ch = 'A';
        // for(int i = 1; i<=n; i++){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // }
        
        // int r = 4;
        // int c = 5;
        // for(int i = 1; i<=r; i++){
        //     for(int j = 1; j<=c; j++){
        //         if(j==1||j==c||i==1||i==r){
        //         System.out.print("* ");
        //         }else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
      
        // int n = 5;
        // for(int i = 1; i<=n; i++){
        //     for(int j = 1; j<=i; j++){
        //         if(j==1||j==i||i==n){
        //             System.out.print("* ");
        //         }else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
        // int n = 4;
        // for(int i = n; i>=1; i--){
        //     for(int j= i; j>=1; j--){
        //         System.out.print("  ");
        //     }
        //     for(int j = 1; j<=n-i+1; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // int n = 5;
        // for(int i = 1; i<=n; i++){
        //     for(int j = 1; j<=n-i+1; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // int n = 5;
        // int sum = 1;
        // for(int i = 1; i<=n; i++){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print(sum+" ");
        //         sum++;
        //     }
        //     System.out.println();
        // }

        // int n = 5;
        // for(int i = 1; i<=n; i++){
        //     for(int j = i; j>=1; j--){
        //      if(j%2==0){
        //          System.out.print(0);
        //         }else{
        //          System.out.print(1);
        //      }
        //     }
        //     System.out.println();
        // }

        int n = 4;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            for(int j = n-i+1; j>=2; j--){
                System.out.print("    ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
            
        }
        for(int i = 1; i<=n; i++){
            for(int j = n-i+1; j>=1; j--){
                System.out.print("* ");
            }
            for(int j = 2; j<=i; j++){
                System.out.print("    ");
            } 
            for(int j = n-i+1; j>=1; j--){
                System.out.print("* ");
            }
            System.out.println();
        }

        // int n = 5;
        // for(int i = 1; i<=n; i++){
        //     for(int j = n-i+1; j>=1; j--){
        //         System.out.print("  ");
        //     }
        //     for(int j = 1; j<=n; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // int n = 5;
        // for(int i = 1; i<=n; i++){
        //     for(int j = n-i+1; j>=1; j--){
        //         System.out.print("  ");
        //     }
        //     for(int j = 1; j<=n; j++){
        //         if(j==1||j==n||i==n||i==1){
        //             System.out.print("* ");
        //         }else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
        
        // int n = 5;
        // for(int i = 1; i<=n; i++){
        //     for(int j = n-i+1; j>=2; j--){
        //         System.out.print("  ");
        //     }
        //     for(int j = 2; j<=i; j++){
        //         System.out.print("* ");
        //     }
        //      for(int j = 1; j<=i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        //   for(int i = 1; i<=n; i++){
        //     for(int j = 2; j<=i; j++){
        //         System.out.print("  ");
        //     }
        //     for(int j = n-i+1; j>=1; j--){
        //         System.out.print("* ");
        //     }
        //      for(int j = n-i+1; j>=2; j--){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // int n = 5;
        // for(int i = 1; i<=n; i++){
        //     for(int j = n-i+1; j>=2; j--){
        //         System.out.print("  ");
        //     }
        //     for(int j = 1; j<=i; j++){
        //         System.out.print(i+"   ");
        //     }
        //     System.out.println();
        // }

        // int n = 5;
        // for(int i = 1; i<=n; i++){
        //     for(int j = n-i+1; j>=2; j--){
        //         System.out.print("  ");
        //     }
        //     for(int j = i; j>=1; j--){
        //         System.out.print(j+" ");
        //     }
        //      for(int j = 2; j<=i; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
    }
}
