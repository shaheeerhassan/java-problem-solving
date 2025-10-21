// Q - Find the sum of digits of a number

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        //Takes input of a number
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        //It runs until the user enters a positive number
        while(num<0) {
            System.out.print("Please enter positive number: ");
            num = in.nextInt();
        }
        in.close();

        //Running Sum
        int sum = 0;

        //Runs until num == 0
        while(num>0) {
            //Adding last digit of the num in sum
            sum+=num%10;
            //Dicarding last integer
            num/=10;
        }

        System.out.println("The sum of digits = "+sum);
    }    
}
