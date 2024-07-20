package Week1.Day0;

public class Arrays {
    static void printarr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    static int sum_array(int[] arr){
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum = arr[i] + sum;
        }
        return sum;
    }
    static void reverse_oder(int[] arr){
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
    }

    static void reverse_array(int[] arr){
        int length = arr.length;
        for(int i=0;i<length/2;i++){
            int temp = arr[i];
            arr[i] = arr[length-1-i];
            arr[length-1-i] = temp;
        }
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        /*int[] arr2 = new int[5];
        arr2[0] = 5;
        System.out.println(arr2);
        char[] arr1 = new char[5];
        arr1[0] = 97;
        arr1[1] = 98;
        arr1[2] = 99;
        System.out.println(arr1);*/
        
        int[] arr = new int[5];
        for(int i=0 ;i<arr.length;i++){
            arr[i] = i+1;
        }

        int [] nums = {1,2,3,4,5};
        // printarr(arr);
        // System.out.println(sum_array(nums));
        // reverse_oder(nums);
        reverse_array(arr);
    }
}
