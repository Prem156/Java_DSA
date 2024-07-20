package Week0.Day1;

import java.util.*;

public class Pattern_printing {

    public static void pattern1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //$    * * * * * 
    //$    * * * * * 
    //$    * * * * * 
    //$    * * * * * 
    //$    * * * * *  


    public static void pattern2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //$    * 
    //$    * *
    //$    * * *
    //$    * * * *
    //$    * * * * *


    public static void pattern3(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //$    * * * * * 
    //$    * * * *
    //$    * * *
    //$    * *
    //$    *

    public static void pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int k = 1;k<=n-i;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //$            * 
    //$          * *
    //$        * * *
    //$      * * * *
    //$    * * * * *

    public static void pattern5(int n){
        for(int i=n;i>=1;i--){
            for(int k = 1;k<=n-i;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //$    * * * * * 
    //$      * * * * 
    //$        * * * 
    //$          * * 
    //$            *

    public static void pattern6(int n) {
    for(int i=n;i>=1;i--){
        for(int k=1;k<=n-i;k++){
            System.out.print("    ");
        }
        for(int j = 1;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
}
    //$    * * * * * 
    //$        * * * *
    //$            * * *
    //$                * *
    //$                    *

    public static void pattern7(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    //$    * * * * * 
    //$    *       *
    //$    *       *
    //$    *       *
    //$    * * * * *

    public static void pattern8(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j || i+j==n+1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    //$    *       * 
    //$      *   *
    //$        *
    //$      *   *
    //$    *       *

    public static void pattern9(int n){
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print("   ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*  ");
            }
            for(int j=2;j<=i;j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
    //$                *  
    //$             *  *  *
    //$          *  *  *  *  *
    //$       *  *  *  *  *  *  *
    //$    *  *  *  *  *  *  *  *  *

    public static void pattern10(int n){
        for(int i=n;i>=1;i--){
            for(int k=1;k<=n-i;k++){
                System.out.print("   ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*  ");
            }
            for(int j=2;j<=i;j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
 //$       *  *  *  *  *  *  *  *  *  
 //$          *  *  *  *  *  *  *
 //$             *  *  *  *  *
 //$                *  *  *
 //$                   *


 public static void pattern11(int n){
    for(int i=1;i<=n;i++){
        for(int k=1;k<=n-i;k++){
            System.out.print("  ");
        }
        
        for(int j=1;j<=i;j++){
            if(j%2==0){
                System.out.print("  ");
                
            }
            else{
                System.out.print("* ");
            }
        }
        for(int j=2;j<=i;j++){
            if((i+j)%2==0){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
}
//$           * 
//$          *   *
//$        *   *   *
//$      *   *   *   *
//$    *   *   *   *   * 

   
public static void pattern12(int n){
    for(int i=1;i<=n;i++){
        for(int k=1;k<=n-i;k++){
            System.out.print("  ");
        }
        
        for(int j=1;j<=i;j++){
            if(j%2==0){
                System.out.print("! ");
                
            }
            else{
                System.out.print("* ");
            }
        }
        for(int j=2;j<=i;j++){
            if((i+j)%2==0){
                System.out.print("* ");
            }
            else{
                System.out.print("! ");
            }
        }
        System.out.println();
    }
}

//$             * 
//$           * ! * 
//$         * ! * ! * 
//$       * ! * ! * ! *
//$     * ! * ! * ! * ! *
   
    public static void pattern13(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //$    *         
    //$    * *       
    //$    * * *     
    //$    * * * *   
    //$    * * * * * 
    //$    * * * *   
    //$    * * *
    //$    * *
    //$    *

    public static void pattern14(int n){
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int k=1;k<=n-i;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //$            * 
    //$          * * 
    //$        * * * 
    //$      * * * *
    //$    * * * * *
    //$      * * * * 
    //$        * * *
    //$          * * 
    //$            *

    public static void pattern15(int n){
        for(int i=n;i>=1;i--){
            for(int k=1;k<=n-i;k++){
                System.out.print("    ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=2;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print("    ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //$    * * * * *  
    //$        * * * *
    //$            * * *
    //$                * * 
    //$                    *
    //$                * *
    //$            * * * 
    //$        * * * *
    //$    * * * * *

    public static void pattern16(int n){
        
            for(int i=n;i>=1;i--){
                for(int k=1;k<=i-1;k++){
                    System.out.print("  ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
                for(int i=2;i<=n;i++){
                    for(int k=1;k<=i-1;k++){
                        System.out.print("  ");
                    }
                    for(int j=1;j<=i;j++){
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            }
        //$           * * * * * 
        //$         * * * *     
        //$       * * *
        //$     * *
        //$   *
        //$     * *
        //$       * * *
        //$         * * * *
        //$           * * * * *

    public static void pattern17(int n){
        // only valid for odd inputs.
        for(int i=n/2;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int k=1;k<=(n/2)-i;k++){
                System.out.print("  ");
            }
            for(int k=1;k<=(n/2)-i+1;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            
            System.out.println();
        }
        System.out.println();
        for(int i=(n/2)+2;i<=n;i++){
            for(int j=(n/2)+2;j<=i;j++){
                System.out.print("* ");
            }
            for(int k=1;k<=n-i+1;k++){
                System.out.print("  ");
            }
            for(int k=1;k<=n-i;k++){
                System.out.print("  ");
            }
            for(int j=(n/2)+2;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }  
    //$    * * *   * * * 
    //$    * *       * *
    //$    *           *
    //$    
    //$    *           *
    //$    * *       * *
    //$    * * *   * * *  
    
    public static void pattern18(int n){
        // only valid for odd inputs.
        for(int i=n/2;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=(n/2)-i;k++){
                System.out.print("* ");
            }
            for(int k=1;k<=(n/2)-i+1;k++){
                System.out.print("* ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("  ");
            }
            
            System.out.println();
        }
        for(int i=(n/2)+1;i<=n;i++){
            for(int j=(n/2)+2;j<=i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=n-i+1;k++){
                System.out.print("* ");
            }
            for(int k=1;k<=n-i;k++){
                System.out.print("* ");
            }
            for(int j=(n/2)+2;j<=i;j++){
                System.out.print("  ");
            }
            System.out.println();
        }
    }
    //$          *       
    //$        * * *
    //$      * * * * *
    //$    * * * * * * *
    //$      * * * * *
    //$        * * *
    //$          *

    public static void pattern19(int n){
        for(int i=(n/2)+1;i>=1;i--){
            for(int j=1;j<=i && j<=(n/2)+1-1;j++){
                System.out.print("* ");
            }
            for(int k=2;k<=(n/2)+1-i;k++){
                System.out.print("  ");
            }
            for(int k=1;k<=(n/2)+1-i;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=2;i<=(n/2)+1;i++){
            for(int j=1;j<=i && j<=(n/2)+1-1;j++){
                System.out.print("* ");
            }
            for(int k=2;k<=(n/2)+1-i;k++){
                System.out.print("  ");
            }
            for(int k=1;k<=(n/2)+1-i;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //$     Enter the input = 7
    //$     * * * * * * * 
    //$     * * *   * * *
    //$     * *       * *
    //$     *           *
    //$     * *       * *
    //$     * * *   * * *
    //$     * * * * * * *

    public static void pattern20(int n){
        for(int i=(n/2)+1;i>=1;i--){
            for(int j=1;j<=i && j<=(n/2)+1-1;j++){
                if(i==j){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
            }
            for(int k=2;k<=(n/2)+1-i;k++){
                System.out.print("  ");
            }
            for(int k=1;k<=(n/2)+1-i;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                if(j==1){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
            }
            System.out.println();
        }
        for(int i=2;i<=(n/2)+1;i++){
            for(int j=1;j<=i && j<=(n/2)+1-1;j++){
                if(i==j){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
            }
            for(int k=2;k<=(n/2)+1-i;k++){
                System.out.print("  ");
            }
            for(int k=1;k<=(n/2)+1-i;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                if(j==1){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
            }
            System.out.println();
        }
    }
    //$  Enter the input = 7
    //$          *       
    //$        *   *
    //$      *       *
    //$    *           *
    //$      *       *
    //$        *   *
    //$          *



    public static void pattern21(int n){
        // only valid for odd inputs.
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i && j<=n-1;j++){
                System.out.print("* ");
            }
            for(int k=1;k<n-i;k++){
                System.out.print("  ");
            }
            for(int k=1;k<=n-i;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //$     *               * 
    //$     * *           * *
    //$     * * *       * * *
    //$     * * * *   * * * *
    //$     * * * * * * * * * 

    
    public static void pattern22(int n){
        // only valid for odd inputs.
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i && j<=n-1;j++){
                System.out.print("* ");
            }
            for(int k=1;k<n-i;k++){
                System.out.print("  ");
            }
            for(int k=1;k<=n-i;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //$     * * * * * * * * * 
    //$     * * * *   * * * *
    //$     * * *       * * *
    //$     * *           * *
    //$     *               * 

    public static void pattern23(int n){
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print("   ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("1  ");
            }
            for(int j=2;j<=i;j++){
                System.out.print("1  ");
            }
            System.out.println();
        }
    }
    //$               1  
    //$             1  1  1
    //$          1  1  1  1  1
    //$       1  1  1  1  1  1  1
    //$    1  1  1  1  1  1  1  1  1

    public static void pattern24(int n){
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print("   ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i + "  ");
            }
            for(int j=2;j<=i;j++){
                System.out.print(i + "  ");
            }
            System.out.println();
        }
    }
        //$                1  
        //$              2  2  2
        //$           3  3  3  3  3  
        //$        4  4  4  4  4  4  4
        //$     5  5  5  5  5  5  5  5  5

    public static void pattern25(int n){
        int num = 1;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(num + "  ");
                num++;
            }
            for(int j=2;j<=i;j++){
                System.out.print(num + "  ");
                num++;
            }
            System.out.println();
        }
    }
     //$                    1  
     //$                 2  3  4
     //$              5  6  7  8  9  
     //$       10  11  12  13  14  15  16
     //$   17  18  19  20  21  22  23  24  25   
     
     public static void pattern26(int n){
         for(int i=1;i<=n;i++){
            int num = 1;
            for(int k=1;k<=n-i;k++){
                System.out.print("   ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(num + "  ");
                num++;
            }
            for(int j=2;j<=i;j++){
                System.out.print(num + "  ");
                num++;
            }
            System.out.println();
        }
    }
        //$                1  
        //$             1  2  3
        //$          1  2  3  4  5  
        //$       1  2  3  4  5  6  7
        //$    1  2  3  4  5  6  7  8  9

        public static void pattern27(int n){
            for(int i=1;i<=n;i++){
                int num = 1;
                for(int k=1;k<=n-i;k++){
                    System.out.print("   ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print(num + "  ");
                    num++;
                }
                num = num-2;
                for(int j=2;j<=i;j++){
                    System.out.print(num + "  ");
                    num--;
                }
                System.out.println();
            }
        }
        //$               1  
        //$             1  2  1
        //$          1  2  3  2  1  
        //$       1  2  3  4  3  2  1
        //$    1  2  3  4  5  4  3  2  1

        public static void pattern28(int n){
            int num = 1;
            for(int i=1;i<=n;i++){
                for(int k=1;k<=n-i;k++){
                    System.out.print("   ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print(num + "  ");
                    num++;
                }
                for(int j=2;j<=i;j++){
                    num = num-2;
                    System.out.print(num + "  ");
                    num++;
                }
                System.out.println();
            }
        }
        //$                1  
        //$             2  3  2  
        //$          3  4  5  4  3
        //$       4  5  6  7  6  5  4
        //$    5  6  7  8  9  8  7  6  5

        public static void pattern29(int n){
            for(int i=1;i<=n;i++){
                for(int k=1;k<=n-i;k++){
                    System.out.print("  ");
                }
                for(int j=1;j<=i;j++){
                   if(j==1){
                    System.out.print(i + " ");
                   }
                   else{
                    System.out.print("0 ");
                   }
                }
                for(int j=2;j<=i;j++){
                    if(i==j){
                        System.out.print(i + " ");
                    }
                    else{
                        System.out.print("0 ");
                    }
                }
                System.out.println();
            }
        }
        //$   Enter the input = 5
        //$           1 
        //$         2 0 2
        //$       3 0 0 0 3
        //$     4 0 0 0 0 0 4
        //$   5 0 0 0 0 0 0 0 5 

        public static void pattern30(int n){
            for(int i=1;i<=n;i++){
                int num = n;
                for(int j=1;j<=n;j++){
                    System.out.print(num + " ");
                    num--;
                }
                System.out.println();
            }
        }
        //$     Enter the input = 5
        //$     5 4 3 2 1 
        //$     5 4 3 2 1
        //$     5 4 3 2 1
        //$     5 4 3 2 1
        //$     5 4 3 2 1

        public static void pattern31(int n){
            for(int i=1;i<=n;i++){
                int num = n;
                for(int j=1;j<=n;j++){
                    if(i+j==n+1){
                        System.out.print("* ");
                        num--;
                    }
                    else{
                        System.out.print(num + " ");
                    num--;
                    }
                }
                System.out.println();
            }
        }
        //$     Enter the input = 5
        //$     5 4 3 2 * 
        //$     5 4 3 * 1
        //$     5 4 * 2 1
        //$     5 * 3 2 1
        //$     * 4 3 2 1

        public static void pattern32(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=2*i-1;j++){
                    if(j%2==0){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print(i + " ");
                    }
                }
                System.out.println();
            }
            for(int i=n-1;i>=1;i--){
                for(int j=1;j<=2*i-1;j++){
                    if(j%2==0){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print(i + " ");
                    }
                }
                System.out.println();
            }

            
        }
        //$    Enter the input = 5
        //$    1 
        //$    2 * 2 
        //$    3 * 3 * 3         
        //$    4 * 4 * 4 * 4     
        //$    5 * 5 * 5 * 5 * 5 
        //$    4 * 4 * 4 * 4     
        //$    3 * 3 * 3         
        //$    2 * 2 
        //$    1 


        public static void pattern33(int n){
            for(int i=1;i<=n;i++){
                int num = n+1-i;
                int num2 = n-1;
                for(int k=1;k<=n-i;k++){
                    System.out.print("  ");
                }
                for(int j=1;j<=i;j++){
                    if(j==1){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print(num + " ");
                    num ++;
                    }
                }
                System.out.print("0 ");
                for(int j=1;j<=i-1;j++){
                    System.out.print(num2 + " ");
                    num2--;
                }
                System.out.println();
            }
        }
    //$  Enter the input = 10
    //$                    0 
    //$                  9 0 9 
    //$                8 9 0 9 8
    //$              7 8 9 0 9 8 7
    //$            6 7 8 9 0 9 8 7 6 
    //$          5 6 7 8 9 0 9 8 7 6 5
    //$        4 5 6 7 8 9 0 9 8 7 6 5 4
    //$      3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 
    //$    2 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 2
    //$  1 2 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 2 1       

        
         public static void main(String[] args) {
        System.out.print("Enter the input = ");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        pattern25(n);
        sc.close();
    }
}
