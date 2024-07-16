package Week1.Day2;
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
    //$ * * * * * 
    //$ * * * * * 
    //$ * * * * * 
    //$ * * * * * 
    //$ * * * * *  


    public static void pattern2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //$ * 
    //$ * *
    //$ * * *
    //$ * * * *
    //$ * * * * *


    public static void pattern3(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //$ * * * * * 
    //$ * * * *
    //$ * * *
    //$ * *
    //$ *

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
    //$         * 
    //$       * *
    //$     * * *
    //$   * * * *
    //$ * * * * *

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
    //$ * * * * * 
    //$   * * * * 
    //$     * * * 
    //$       * * 
    //$         *

    public static void main(String[] args) {
        System.out.print("Enter the input = ");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        pattern5(n);
        sc.close();
    }
}
