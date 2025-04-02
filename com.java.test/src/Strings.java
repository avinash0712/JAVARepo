
import java.util.Scanner;


public class Strings {

    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the first name : ");
        // String firstname = sc.next();
        // System.out.println("Enter the middle name : ");
        // String middlename = sc.next();
        // System.out.println("Enter the last name : ");
        // String lastname = sc.next();

        // //Concatination of string
        // String fullname = firstname+" "+middlename+" "+lastname;
        // System.out.println("Your full name is : "+fullname);

        // //print lenght of string
        // System.out.println("Length of the fullname is :" +fullname.length());
        // //Access character of string

        // for(int i=0;i<fullname.length();i++){
        //     System.out.println("Charcter at "+i+" postion is :"+ fullname.charAt(i));
        // }
        // //compare two string
        // if(firstname.equals(middlename)){
        //     System.out.println("First name and middle name are same!!!!! ");
        // }else{
        //     System.out.println("First name and middle name are different :( ");
        // }

        // //substring of a string
        // System.out.println("Nick name :" + firstname.substring(0,3));

        // //parseInt method of integer class
        // try{
        //     int num = Integer.parseInt(firstname);
        //     System.out.println(num);
        // }catch(NumberFormatException e){
        //     System.out.println("first name does not contain number or it is mixer of number and char");
        // }

        // //toString method of String class
        // int num = 1234567890;
        // String str = Integer.toString(num);
        // System.out.println(str.getClass());

        //ALWAYS REMEMBER : Java Strings are Immutable.

        // problem 1 : Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String array[] = new String[size];
        int totLength = 0;

        for(int i=0;i<size;i++){
            array[i] = sc.next();
            totLength += array[i].length();
        }

        System.out.println(totLength);

    }
}
