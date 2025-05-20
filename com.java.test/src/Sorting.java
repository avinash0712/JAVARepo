import java.util.Random;
import java.util.Scanner;

public class Sorting {
    public static void printArray(int array[]) {
        System.out.print("Values in the array are : ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(" " + array[j]);
        }
        System.out.println();
    }

    public static int[] createArray() {
        System.out.print("Enter the size of array : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];
        Random r = new Random();
        // fill the array with random number
        for (int i = 0; i < size; i++) {
            array[i] = r.nextInt(99);
        }
        //System.out.println();
        return array;
    }

    public static void main(String args[]) {
        
        // Bubble sort
        int array[] = createArray(); 
        printArray(array);
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Bubble sorting of array is done");
        printArray(array);

        //selection sort
        int array1[] = createArray();
        printArray(array1);
        for(int i=0; i<array1.length-1; i++){
            int smallest = i;
            for(int j=i+1; j<array1.length;j++){
                if(array1[smallest]>array1[j]){
                    smallest = j;
                }
            }
                int temp = array1[smallest];
                array1[smallest] = array1[i];
                array1[i] = temp; 
        }
        System.out.println("Selection sorting is done");
        printArray(array1);

        //insertion sort
        int array2[] = createArray();
        printArray(array2);
        for(int i=0; i<array2.length; i++){
            int current = array2[i];
            int j = i-1;
            while(j>=0 && current < array2[j]){
                array2[j+1] = array2[j];
                j--;
            }
            array2[j+1] = current;
        }
        System.out.println("Insertion sorting is done ");
        printArray(array2);

    }
}
