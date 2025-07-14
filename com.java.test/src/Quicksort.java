import java.util.Scanner;

public class Quicksort {
    public static void qSort(int arr[],int low,int high){
        if(low<high){
            int pivotIndex = partition(arr, low, high);
            qSort(arr, low, pivotIndex-1);
            qSort(arr, pivotIndex+1, high);
        }
    }
    public static int partition(int arr[],int low,int high){
        int pivot = arr[high];
        int i = low-1;

        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
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
        qSort(arr, 0, n-1);
        System.out.println("Element in array after sorting :");
        printArr(arr);
    }
}
