// Q -Find the largest of three numbers

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {

        //Taking Input of 3 numbers
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = in.nextInt();
        System.out.print("Enter second number: ");
        int b = in.nextInt();
        System.out.print("Enter third number: ");
        int c = in.nextInt();
        in.close();

        //Ternary Operator
        int max = (a>b && a>c)? a : (b>c)? b : c;

        //Print largest number
        System.out.println("The largest number is: "+max);
    }
}
