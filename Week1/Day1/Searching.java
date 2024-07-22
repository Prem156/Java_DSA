package Week1.Day1;

public class Searching {
    static int linear_search(int[] arr,int n){

        // for(int i : arr){
        //     if(i == n) {
        //         return true;
        //     }
        //     return false;
        // }

        // for(int i=0;i<arr.length;i++){
        //     if(arr[i] == n){
        //         return i;
        //     }
        // }
        // return -1;
    }

    static int binary_search(int[] arr,int n,int a,int b){
        int s = a;
        int e = b;
        while(s<=e){
            int mid = (s+e)/2;
            if(arr[mid] == n){
                return mid;
            }
            if(arr[mid]<n){
                s= mid+1;
            }
            else{
                e = mid-1;
            }
            // mid = (s+e)/2;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,8,9,10};
        // System.out.println(linear_search(arr, 4));
        System.out.println(binary_search(arr, 5,1,7));
    }
    
}
