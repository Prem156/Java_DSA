package Week1.Day0;

public class Methods {
    static void swap(int a,int b){
        System.out.println("Before Swapping : ");
        System.out.println("a = "  + a);
        System.out.println("b = "  + b);
        int t = a;
        a = b;
        b= t;
        System.out.println("After Swapping : ");
        System.out.println("a = "  + a);
        System.out.println("b = "  + b);
    }
    static void printN(int n){
        for(int i=1;i<=n;i++){
            System.out.print(i + " ");
        }
    }
    static boolean check_prime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    static int reverse(int n){
        int temp=0;
        while(n>0){
            int a = n%10;
            temp = temp*10 + a;
            n = n/10;
        }
        return temp;
    }

    static int count(int n){
        int count=0;
        while(n>0){
            count++;
            n = n/10;
        }
        return count;
    }
    
    static boolean amstrong(int n){
        int d = count(n);
        int sum =0;
        int temp=n;
        while(n!=0){
            sum = sum + (int)Math.pow((n%10), d);
            n/=10;
        }
        return (sum==temp);
    }

    public static void main(String[] args) {
        
        // swap(3,4);
        // printN(5);
        // System.out.println(check_prime(5));
        // System.out.println(reverse(1234));
        // System.out.println(count(1230));
        System.out.println(amstrong(153));

    }
}
