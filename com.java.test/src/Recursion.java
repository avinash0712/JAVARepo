import java.util.HashSet;
import java.util.Scanner;

public class Recursion {

    // // Q1 --- print number from 5 to 1 using recursion
    // public static void printNumber(int n){
    // if(n==0){
    // return;
    // }
    // System.out.println(n);
    // printNumber(n-1);
    // }

    // public static void main(String args[]){
    // System.out.print("Enter the number : ");
    // Scanner sc = new Scanner(System.in);
    // int num = sc.nextInt();
    // printNumber(num);
    // }

    // // Q2 --- print sum of n natural number
    // public static void printSum(int i, int n, int sum){
    // if(i==n){
    // sum += i;
    // System.out.println(sum);
    // return;
    // }
    // sum = sum+i;
    // printSum(i+1, n, sum);
    // }

    // public static void main(String args[]){
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter the starting number : ");
    // int i = sc.nextInt();
    // System.out.print("Enter the ending number : ");
    // int n = sc.nextInt();
    // int sum = 0;
    // printSum(i, n, sum);
    // }

    // // Q3 --- print factorial of number

    // public static int factorial(int n){
    // if (n==1 || n==0){
    // return 1;
    // }
    // return n * factorial(n-1);
    // }
    // public static void main(String args[]){
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter the number you want factorial of : ");
    // int i = sc.nextInt();
    // int fact = factorial(i);
    // System.out.println("Factorial of number "+i+" is : "+fact);
    // }

    // // Q4 --- print Fibonacci series

    // public static void printFib(int a, int b, int n){
    // if(n==0){
    // return;
    // }
    // int c = a+b;
    // System.out.print(c + " ");
    // printFib(b, c, n-1);
    // }
    // public static void main(String args[]) {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter the number of terms you want fibonacci series of :
    // ");
    // int n = sc.nextInt();
    // int a = 0; int b = 1;
    // System.out.print(a + " ");
    // System.out.print(b + " ");
    // printFib(a, b, n-2);
    // }

    // // Q5 --- Print x^n (Stack height n)

    // public static int calcPower(int x, int n){
    // if(x==0){
    // return 0;
    // }
    // if(n==0){
    // return 1;
    // }
    // int pow = x * calcPower(x,n-1);
    // return pow;
    // }

    // public static void main(String args[]) {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter the number x : ");
    // int x = sc.nextInt();
    // System.out.print("Enter the number n : ");
    // int n = sc.nextInt();
    // int ans = calcPower(x,n);
    // System.out.println(ans);
    // }
    
    
    
// // Q6 --- Print x^n (Stack height (log n))

//     public static int calcPower(int x, int n) {
//         if (x == 0) {
//             return 0;
//         }
//         if (n == 0) {
//             return 1;
//         }
//         if(n%2 == 0){
//             return calcPower(x, n/2) * calcPower(x, n/2);
//         }else{
//             return calcPower(x, n/2) * calcPower(x, n/2) *x;
//         }
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number x : ");
//         int x = sc.nextInt();
//         System.out.print("Enter the number n : ");
//         int n = sc.nextInt();
//         int ans = calcPower(x, n);
//         System.out.println(ans);
//     }

// // Q7 --- Tower of hanoi 

//     public static void towerOfHanoi(int n, String source, String helper, String Destination){
//         if(n==1){
//             System.out.println("Transfer disk "+n+" from "+source+" to "+Destination );
//             return;
//         }
//         towerOfHanoi(n-1, source, Destination, helper);
//         System.out.println("Transfer disk "+n+" from "+source+" to "+Destination );
//         towerOfHanoi(n-1, helper, source, Destination);
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of disk : ");
//         int x = sc.nextInt();
//         towerOfHanoi(x, "S", "H", "D");
//     }

// // Q8 --- Print a string in reverse 

//     public static void reverseString(int index, String input){
//         if(index<0){
//             return;
//         }
//         System.out.print(input.charAt(index));
//         reverseString(index-1, input);
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the string you want to reverse : ");
//         String input = sc.nextLine();
//         int index = input.length();
//         reverseString(index-1, input);
//     }

// // Q9 --- Find first and last occurance of element in string 
//     public static int first = -1;
//     public static int last = -1;

//     public static void firstAndLastOccuranceOfElement(String input, char element, int index){
//         if(index==input.length()){
//             System.out.println("The first occurance of the character "+element+" in the string is at : "+first);
//             System.out.println("The last occurance of the character "+element+" in the string is at : "+last);
//             return;
//         }
//         if(input.charAt(index) == element){
//             if(first == -1){
//                 first = index;
//             }
//             else{
//                 last = index;
//             }
//         }
//         firstAndLastOccuranceOfElement(input, element, index+1);
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the string : ");
//         String input = sc.nextLine();
//         System.out.println("Enter the character in the string you want to find : ");
//         char element = sc.next().charAt(0);
//         int index = 0;
//         firstAndLastOccuranceOfElement(input, element,index);
//     }
// // Q10 --- Check given array is sorted (Strictly increasing order)

//     public static boolean checArraySorted(int array[],int index){
//         if(index==array.length-1){
//             return true;
//         }
//         if(array[index]<array[index+1]){
//             return checArraySorted(array, index+1);
//         }else{
//             return false;
//         }
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of elements in array : ");
//         int size = sc.nextInt();
//         int array[] = new int[size];
//         System.out.println("Enter the element in the array : ");
//         for(int i=0; i<size;i++){
//             array[i] = sc.nextInt();
//         }
//         for(int i=0; i<size; i++){
//             System.out.println(array[i]);
//         }
//         System.out.println(checArraySorted(array,0));
//     }

// // Q11 --- Move all 'x' at the end of string

//     public static void moveAllX(String input,int index, char x, int count, String output){
//         if(index == input.length()){
//             System.out.println("The number of times "+x+" occurs in the string is : "+count);
//             System.out.println("Moving "+x+" at last of the string");
//             for(int i=0;i<count;i++){
//                 output += x;
//             }
//             System.out.println(output);
//             return;
//         }
//         if(input.charAt(index) == x){
//             count++;
//             moveAllX(input, index+1, x, count, output);;
//         }else{
//             output += input.charAt(index);
//             moveAllX(input, index+1, x, count, output);
//         }
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the String : ");
//         String input = sc.nextLine();
//         System.out.println("Enter the element you want to move at last : ");
//         char element = sc.next().charAt(0);
//         moveAllX(input, 0, element, 0, "");
//     }

// // Q12 --- Remove duplicates letter in the string

//     public static boolean map[] = new boolean[26];
//     public static void removeDuplicates(String input,int index, String output){
//         if(index==input.length()){
//             System.out.println("The output string is : "+output);
//             return;
//         }
//         char currChar = input.charAt(index);
//         if(map[currChar-'a']){
//             removeDuplicates(input, index+1, output);
//         }else{
//             output += currChar;
//             map[currChar-'a'] = true;
//             removeDuplicates(input, index+1, output);
//         }
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the String : ");
//         String input = sc.nextLine();
//         removeDuplicates(input, 0, "");
//     }


// // Q13 --- Print all subsequence of string

//     public static void subSequence(String input, String output, int index){
//         if(index==input.length()){
//             System.out.println(output);
//             return;
//         }
//         char currChar = input.charAt(index);
//         subSequence(input, output+currChar, index+1);
//         subSequence(input, output, index+1);

//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the String : ");
//         String input = sc.nextLine();
//         subSequence(input, "", 0);
//     }

// // Q14 --- Print all unique subsequence of string

//     public static void subSequence(String input, String output, int index, HashSet set){
//         if(index==input.length()){
//             if(set.contains(output)){
//                 return;
//             }else{
//                 System.out.println(output);
//                 set.add(output);
//                 return;
//             } 
//         }
//         char currChar = input.charAt(index);
//         subSequence(input, output+currChar, index+1, set);
//         subSequence(input, output, index+1, set);

//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the String : ");
//         String input = sc.nextLine();
//         HashSet <String> set = new HashSet<>();
//         subSequence(input, "", 0,set);
//     }

// Q15 --- Print keypad combination

    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printCombo(String input, int index, String combination ){
        if(index == input.length()){
            System.out.println(combination);
            return;
        }
        char currChar = input.charAt(index);
        String mapping = keypad[currChar - '0'];
        for(int i=0;i<mapping.length();i++){
            printCombo(input, index+1, combination+mapping.charAt(i));
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String input = sc.nextLine();
        printCombo(input, 0, "");
    }
}
