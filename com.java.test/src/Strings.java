import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name : ");
        String firstname = sc.next();
        System.out.println("Enter the middle name : ");
        String middlename = sc.next();
        System.out.println("Enter the last name : ");
        String lastname = sc.next();

        //Concatination of string
        String fullname = firstname+" "+middlename+" "+lastname;
        System.out.println("Your full name is : "+fullname);

        //print lenght of string
        System.out.println("Length of the fullname is :" +fullname.length());
        //Access character of string

        for(int i=0;i<fullname.length();i++){
            System.out.println("Charcter at "+i+" postion is :"+ fullname.charAt(i));
        }
        //compare two string
        if(firstname.equals(middlename)){
            System.out.println("First name and middle name are same!!!!! ");
        }else{
            System.out.println("First name and middle name are different :( ");
        }
    }
}
