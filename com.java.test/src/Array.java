import java.util.*;

public class Array{
    public static void main (Strings args []){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Enter Size of the array : ");
        int size = sc.nextInt();
        int number[] = new int[size];

        for(int i = 0; i < size; i++){
            number[i] = rand.nextInt(100);
            System.out.println("Enter the number at "+ i +" index : "+number[i]);        
        }
        int max= Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<number.length;i++){
            if(number[i]<min){
                min=number[i];
            }
            if(number[i]>max){
                max=number[i];
            }
        }
        System.out.println("Maximum number in array is: "+max);
        System.out.println("Minimum number in array is: "+min);

        for(int i=0; i<size;i++){
            System.err.println("Number at "+i+" index is : " + number[i]);
        }
        System.out.print("Enter the number you want to search in the array: ");
        int find_number = sc.nextInt();

        for(int i=0; i<size; i++){
            if(find_number == number[i]){
                System.out.println("Number "+find_number+" found in the array at "+i+ " index");
            }
        }

    }
}