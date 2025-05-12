import java.util.Scanner;

public class Bits {

    // Converting decimal to binary and storing in array and printing
    static void decToBinary(int n) {
        int num = n;
        int binaryNum[] = new int[1000];
        int i = 0;
        while (n > 0) {
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
        System.out.println("Binary for number " + num + " is :");
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binaryNum[j]);
        }
        System.out.println();
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        int num = sc.nextInt();
        decToBinary(num);

        // get bit at ith position
        System.out.println("Enter the position of bit you want to get");
        int pos = sc.nextInt();
        int bitMask = 1 << pos;
        if ((bitMask & num) == 0) {
            System.out.println("Bit at pos " + pos + " is zero");
        } else {
            System.out.println("Bit at pos " + pos + " is one");
        }

        // set bit at ith position
        System.out.println("Enter the position you want to set bit");
        int pos1 = sc.nextInt();
        int bitMask1 = 1 << pos1;
        int newNumber = bitMask1 | num;
        System.out.println("The new number after set bit operation is : " + newNumber);
        decToBinary(newNumber);

        // clear bit at ith position
        System.out.println("Enter the position of bit you want to clear");
        int pos2 = sc.nextInt();
        int bitMask2 = 1 << pos2;
        int notBitMask = ~bitMask2;
        int newNumber1 = notBitMask & num;
        System.out.println("The new number after clear bit operation is : " + newNumber1);
        decToBinary(newNumber1);

        // Update bit at ith position
        System.out.println("Enter the position of bit you want to update");
        int pos3 = sc.nextInt();
        System.out.println("Enter the value of bit (0 or 1) you want to update");
        int value = sc.nextInt();
        int bitMask3 = 1 << pos3;
        if (value == 1) {
            int newNumber2 = bitMask3 | num;
            System.out.println("The new number after update bit operation is : " + newNumber2);
            decToBinary(newNumber2);
        } else {
            int notBitMask1 = ~bitMask3;
            int newNumber3 = notBitMask1 & num;
             System.out.println("The new number after update bit operation is : " + newNumber3);
             decToBinary(newNumber3);
        }
    }
}
