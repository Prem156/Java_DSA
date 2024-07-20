package Week0.Day1;
import java.util.*;

public class morepatterns {
    public static void pattern1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j==1 || i==n || i==j){
                    System.out.print(j + " ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    //$   Enter the input = 5
    //$   1 
    //$   1 2
    //$   1   3
    //$   1     4
    //$   1 2 3 4 5

    public static void pattern2(int n){
        for(int i=n;i>=1;i--){
            int num = n-i+1;
            // num++;
            for(int j=1;j<=i;j++){
                if(j==1 || i==n || i==j){
                    System.out.print(num + " ");
                    num++;
                }
                else{
                    System.out.print("  ");
                    num++;
                }
            }
            System.out.println();
        }
    }
    //$   Enter the input = 5
    //$   1 2 3 4 5 
    //$   2     5
    //$   3   5
    //$   4 5
    //$   5

    public static void pattern3(int n){
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=n-1;j++){
    //             System.out.print("* ");
    //         }
    //         for(int k=1;k<=n-i;k++){
    //             System.out.print("* ");
    //         }
    //         for(int j=1;j<=i;j++){
    //             if(j%2!=0){
    //                 System.out.print(i + " ");
    //             }
    //             else{
    //                 System.out.print("* ");
    //             }
    //         }
    //         for(int j=2;j<=i;j++){
    //             if((i+j)%2==0){
    //                 System.out.print(i + " ");
    //             }
    //             else{
    //                 System.out.print("* ");
    //             }
    //         }
    //         for(int k=1;k<=n-i;k++){
    //             System.out.print("* ");
    //         }
    //         for(int j=1;j<=n-1;j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    
    // for(int i=n-1;i>=1;i--){
    //     for(int j=1;j<=n-1;j++){
    //         System.out.print("* ");
    //     }
    //     for(int k=1;k<=n-i;k++){
    //         System.out.print("* ");
    //     }
    //     for(int j=1;j<=i;j++){
    //         if(j%2!=0){
    //             System.out.print(i + " ");
    //         }
    //         else{
    //             System.out.print("* ");
    //         }
    //     }
    //     for(int j=2;j<=i;j++){
    //         if((i+j)%2==0){
    //             System.out.print(i + " ");
    //         }
    //         else{
    //             System.out.print("* ");
    //         }
    //     }
    //     for(int k=1;k<=n-i;k++){
    //         System.out.print("* ");
    //     }
    //     for(int j=1;j<=n-1;j++){
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    // }

    //* Short method.
    for(int i=0;i<n;i++){
        int start_num_index = 8-i;
        int num = i+1;
        int count_num = num;
        for(int j=0;j<17;j++){
            if(j==start_num_index && count_num>0){
                System.out.print(num + " ");
                start_num_index+=2;
                count_num--;
            }
            else{
                System.out.print("* ");
            }
        }
        System.out.println();

    }
    for(int i=n-2;i>=0;i--){
        int start_num_index = 8-i;
        int num = i+1;
        int count_num = num;
        for(int j=0;j<17;j++){
            if(j==start_num_index && count_num>0){
                System.out.print(num + " ");
                start_num_index+=2;
                count_num--;
            }
            else{
                System.out.print("* ");
            }
        }
        System.out.println();

    }
}
    //$    Enter the input = 5
    //$    * * * * * * * * 1 * * * * * * * * 
    //$    * * * * * * * 2 * 2 * * * * * * * 
    //$    * * * * * * 3 * 3 * 3 * * * * * *
    //$    * * * * * 4 * 4 * 4 * 4 * * * * *
    //$    * * * * 5 * 5 * 5 * 5 * 5 * * * * 
    //$    * * * * * 4 * 4 * 4 * 4 * * * * *
    //$    * * * * * * 3 * 3 * 3 * * * * * *
    //$    * * * * * * * 2 * 2 * * * * * * *
    //$    * * * * * * * * 1 * * * * * * * * 

    public static void pattern4(int n){
        int num=1;
        int num2 = n+3;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=2*i-1;j++){
                if(j%2!=0){
                    System.out.print(num + " ");
                    num++;
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        int start_num = num-n;
        for(int i=n;i>=1;i--){
            int k = start_num;
            for(int j=1;j<=2*i-1;j++){
                num = num-3;
                if(j%2!=0){ 
                    System.out.print(k + " ");
                    k++;
                }
                else{
                    System.out.print("* ");
                }
            }
            start_num = start_num-i+1;
            System.out.println();
        }
    }
    //$    Enter the input = 4
    //$    1 
    //$    2 * 3 
    //$    4 * 5 * 6      
    //$    7 * 8 * 9 * 10 
    //$    7 * 8 * 9 * 10 
    //$    4 * 5 * 6      
    //$    2 * 3 
    //$    1 

    //*  Pallindrome triangle
    public  static void pattern5(int n){
        for(int i=0;i<n;i++){
            int cond = i<=n/2 ? 2*i : 2*(n-i-1);
            for(int j=0;j<=cond;j++){
                if(j<=cond/2){
                    System.out.print(j+1 + " ");
                }
                else{
                    System.out.print(cond-j+1 + " ");
                }
            }
            System.out.println();
        }
    }
    //$   Enter the input = 5
    //$   1 
    //$   1 2 1
    //$   1 2 3 2 1
    //$   1 2 1 
    //$   1

    //* Pascal triangle
    public static void pattern6(int n){
        for(int i=1;i<=n;i++){
            int num = 1;
            for(int j=1;j<=i;j++){
                System.out.print(num + " ");
                num = num * (i-j)/j;
            }
            System.out.println();
        }
    }
        //$   Enter the input = 7
        //$   1 
        //$   1 1
        //$   1 2 1
        //$   1 3 3 1
        //$   1 4 6 4 1
        //$   1 5 10 10 5 1 
        //$   1 6 15 20 15 6 1


        public static void main(String[] args) {
        System.out.print("Enter the input = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern6(n);
        sc.close();
    }
}
