
import java.util.Scanner;


public class Strings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
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

        // //ALWAYS REMEMBER : Java Strings are Immutable.

        // // problem 1 : Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

        // int size = sc.nextInt();
        // String array[] = new String[size];
        // int totLength = 0;

        // for(int i=0;i<size;i++){
        //     array[i] = sc.next();
        //     totLength += array[i].length();
        // }

        // System.out.println(totLength);

        // problem 2 : Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 

        // String str1 = sc.nextLine();
        // String result = "";

        // for(int i=0;i<str1.length();i++){
        //     if(str1.charAt(i)=='e'){
        //         result += 'i';
        //     }else{
        //         result += str1.charAt(i);
        //     }
        // }
        // System.out.println("Original string: "+str1+ "  String after replacing letter e with i: "+result);

        // problem 3 : Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.

        System.out.println("Enter your email: ");
        String email = sc.next();
        String username = "";

        for (int i = 0; i < email.length(); i++) {
            if(email.charAt(i)=='@'){
                break;
            }else{
                username += email.charAt(i);
            }
        }
        System.out.println("Username is: "+username);
    }
}
