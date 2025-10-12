public class advancePattern {
    public static void butterfly(int n){
         for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            for(int j = n-1; j>=i; j--){
                System.out.print("  ");
            }
            for(int j = n-1; j>=i; j--){
                System.out.print("  ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 1; i<=n; i++){
            for(int j = n-1; j>=i; j--){
                System.out.print("* ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("  ");
            }
            for(int j = n-1; j>=i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void solidRhombus(int r, int c){
        //outer loop
        for(int i = 1; i<=c; i++){
            for(int j = c-i; j>=1; j--){
                System.out.print("  ");
            }
            //inner loop
            for(int j = 1; j<=r; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
     public static void hollowRhombus(int r, int c){
        //outer loop
        for(int i = 1; i<=c; i++){
            for(int j = c-i; j>=1; j--){
                System.out.print("  ");
            }
            //inner loop
            for(int j = 1; j<=r; j++){
                if(j==1||j==r||i==1||i==c){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void dimondPattern(int n){
        for(int i = 1; i<=n; i++){
            for(int j = n-i+1; j>=2; j--){
                System.out.print("  ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            for(int j = 2; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
         for(int i = 1; i<=n; i++){
            
            for(int j = 2; j<=i; j++){
                System.out.print("  ");
            }
            for(int j = n-i+1; j>=1; j--){
                System.out.print("* ");
            }
           for(int j = n-i+1; j>=2; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // int r = 4;
        // int c = 5;
        // for(int i = 1; i<=r; i++){
        //     for(int j = 1; j<=c; j++){
        //         if(i==1||j==1||i==r||j==c){
        //             System.out.print("* ");// true
        //         }else{
        //             System.out.print("  ");//false
        //         }
        //     }
        //     System.out.println();
        // }

        // int n = 4;
        // for(int i=1; i<=n; i++){
        //     for(int j = n; j>=i; j--){
        //         System.out.print("  ");
        //     }
        //     for(int k = 1; k<=i; k++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // int n = 5;
        // for(int i = 1; i<=n; i++){
        //     for(int j = 1; j<=n-i+1; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
        // int n = 5;
        // int c = 1;
        // for(int i = 1; i<=n; i++){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print(c+" ");
        //         c++;
        //     }
        //     System.out.println();
        // }
        // int n = 5;
        // for(int i = 1; i<=n; i++){
        //     for(int j = i; j>=1; j--){
        //      
        //         if(j%2==0){
        //             System.out.print("0 "); 
        //         } else{
        //             System.out.print("1 ");
        //         }
        //    
        //     }
        //     System.out.println();
        // }

    //     int n =6;
    //    butterfly(n);
    // int r = 4;
    // int c = 5;
    // solidRhombus(r, c);
    // hollowRhombus(r, c);
    int n = 4;
    dimondPattern(n);
    }
}
