import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Backtracking {

//Q1 --- Print all permutation of string

    public static void printPermutation(String s, String per, int index){
        if(s.length()==0){
            System.out.println(per);
            return;
        }
        for(int i=0;i<s.length();i++){
            char currChar = s.charAt(i);
            String newString = s.substring(0, i) + s.substring(i+1);
            printPermutation(newString, per+currChar, index+1);
        }
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        printPermutation(str, "", 0);
    }
}
