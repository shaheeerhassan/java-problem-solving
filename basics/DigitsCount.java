// Q9 - Count the number of digits in a number

import java.util.Scanner;

public class DigitsCount {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to count digits: ");
        int num = in.nextInt();
        in.close();

        //Digits Counter
        int digitsCount = 0;

        if(num==0) digitsCount = 1;

        while(num != 0) {
            digitsCount++;

            //Discards last digit every iteration
            num /= 10;
        }

        System.out.println("The number of digits are: "+digitsCount);

    }
}