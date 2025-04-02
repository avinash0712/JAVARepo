import java.util.Random;
import java.util.Scanner;

public class TwoDarray{
    public static void main (Strings args []){

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter the no of rows in 2Darray: ");
        int rows = sc.nextInt();
        System.out.println("");
        System.out.print("Enter the number of column in an 2d array: ");
        int column = sc.nextInt();

        int [][] TwoDarray = new int[rows][column];

        for(int i=0; i<rows; i++){
            for(int j=0; j<column; j++){
                TwoDarray[i][j] = rand.nextInt(100);
                System.out.println("Number at "+i+" row and "+j+" column is : "+TwoDarray[i][j]);
            }
        }

        System.out.print("Enter the number you want to find in the 2Darray : ");
        int num = sc.nextInt();

        for(int i=0; i<rows; i++){
            for(int j=0; j<column; j++){
                if(TwoDarray[i][j] == num){
                    System.out.println("Number found "+i+" row and "+j+" column");
                }
            }
        }
    }
}