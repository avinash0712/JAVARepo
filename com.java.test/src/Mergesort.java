import java.util.Scanner;

public class Mergesort {
    
    public static void divide(int arr[], int start, int end){
        if(start>=end){
            return;
        }
        int mid = start + (end - start)/2;

        divide(arr, start, mid);
        divide(arr, mid+1, end);

        conquer(arr, start, end, mid);
    }

    public static void conquer(int arr[], int start, int end, int mid){
        int [] merged = new int[end-start+1]; 
        int start1 = start;
        int start2 = mid+1;
        int x = 0;

        while(start1<=mid && start2<=end){
            if(arr[start1]<=arr[start2]){
                merged[x++] = arr[start1++];
            }else{
                merged[x++] = arr[start2++];
            }
        }
        while(start1<=mid){
            merged[x++] = arr[start1++];
        }
        while (start2<=end) {
            merged[x++] = arr[start2++];
        }
        for(int i=0,j=start;i<merged.length;j++,i++){
            arr[j] = merged[i];
        }
    }

    public static void printArr(int arr[]){
        for(int val : arr){
            System.out.print(" "+val);
        }
         System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Enter size of an array to sort :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter element in array :");
        for(int i=0;i<n;i++){
           arr[i] = sc.nextInt();
        }
        System.out.println("Element in array before sorting :");
        printArr(arr);
        divide(arr, 0, n-1);
        System.out.println("Element in array after sorting :");
        printArr(arr);
    }
}
