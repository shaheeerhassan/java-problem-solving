// Q - Check if a number is positive, negative, or zero

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        in.close();

        //Conditions
        if(num==0) System.out.println(num+" is zero");
        else if(num>0) System.out.println(num+" is positive");
        else System.out.println(num+" is negative");
    }
}
