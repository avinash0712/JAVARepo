import java.util.ArrayList;
import java.util.Scanner;

public class RecursionAdvance {
    // // Q1 --- print all permutaion of string

    // public static void printperm(String input, String output ){
    //     if(input.length() == 0){
    //         System.out.println(output);
    //         return;
    //     }
    //     for(int i=0;i<input.length();i++){
    //        char currChar = input.charAt(i);
    //        String newStr = input.substring(0, i) + input.substring(i+1);
    //        printperm(newStr, output+currChar);
    //     }
    // }

    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the string : ");
    //     String input = sc.nextLine();
    //     printperm(input, "");
    // }

    // // Q2 --- Count total path in a maze to move from (0,0) to (n,m)

    // public static int countPaths(int i, int j, int m, int n){
    //      if(i == n || j == m){
    //         return 0;
    //     }
    //     if(i == n-1 && j == m-1){
    //         return 1;
    //     }

    //     int downPaths = countPaths(i+1, j, m, n);
    //     int rightPaths = countPaths(i, j+1, m, n);
    //     return downPaths + rightPaths;
    // }

    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the number of rows : ");
    //     int m = sc.nextInt();
    //     System.out.println("Enter the number of columns : ");
    //     int n = sc.nextInt();
    //     int totalPaths = countPaths(0, 0, m, n);
    //     System.out.println("Total paths is : "+totalPaths);

    // }

    // // Q3 --- Place tile of size 1XM in a floor of size NXM

    // public static int placeTiles(int n, int m){
    //     if(n == m ){
    //         return 2;
    //     }
    //     if (n < m){
    //         return 1;
    //     }
    //     int verticalPlacement = placeTiles(n-m, m);
    //     int horizontalPlacement = placeTiles(n-1, m);
    //     return verticalPlacement + horizontalPlacement;
    // }

    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the number of rows : ");
    //     int n = sc.nextInt();
    //     System.out.println("Enter the number of columns : ");
    //     int m = sc.nextInt();
    //     System.out.println("Total no of ways is : "+placeTiles(n, m));

    // }

    // // Q4 --- find number of ways in which you can invite n people to party single or in pairs

    // public static int callGuest(int n){
    //     if(n <= 1){
    //         return 1;
    //     }

    //     int ways1 = callGuest(n-1);
    //     int ways2 = (n-1) * callGuest(n-2);
    //     return ways1+ways2;
    // }

    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the number of guest : ");
    //     int n = sc.nextInt();
    //     System.out.println("No of ways guest can be called : "+callGuest(n));
    // }

    // Q5 --- print all subset of set of first n natural number
    public static void printSubset(ArrayList<Integer> subset){
        for(int i=0;i<subset.size();i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void findSubsets(int n, ArrayList<Integer> subset){
        if(n==0){
            printSubset(subset);
            return;
        }
        subset.add(n);
        findSubsets(n-1, subset);

        subset.remove(subset.size()-1);
        findSubsets(n-1, subset);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt();
        ArrayList<Integer> subset = new ArrayList<>();
        findSubsets(n, subset);
    }

}
