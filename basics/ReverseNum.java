// Q - Reverse a number

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int num = in.nextInt();
        in.close();


        //To store reversed number
        int reversedNum = 0;

        
        while(num != 0) {
            int temp = num % 10;
            num /= 10;
            reversedNum = reversedNum * 10 + temp;
        }

        System.out.println("The reversed number is: " + reversedNum);

    }
}
