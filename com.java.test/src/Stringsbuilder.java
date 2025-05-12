
import java.util.Scanner;
//import java.lang.*;

public class Stringsbuilder {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name : ");
        String str = sc.next();
        StringBuilder sb = new StringBuilder(str);
        
        //get a charcter from index
        System.out.println(sb.charAt(1));

        //Insert a character at index i
        sb.insert(3, 'i');
        System.out.println(sb);

        //set a char at index 
        sb.setCharAt(3, 'y');
        System.out.println(sb);

        //delete a char at index 
        sb.delete(3, 4);
        System.out.println(sb);

        // replace in the String at index
        sb.replace(0, 0, "Hello ");
        System.out.println(sb);

        // Append in the string 
        sb.append(" How are you ?");
        System.out.println(sb);

        //reverse the srting method 1
        sb.reverse();
        System.out.println(sb);

        //reverse the string method 2
        for(int i=0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length()-i-1;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);

        
    }
}
