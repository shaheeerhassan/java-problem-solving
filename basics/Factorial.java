// Q - Find the factorial of a number

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        in.close();

        int factorial = 1;

        //Undefined for negative numbers
        if(num<0) factorial = -1;

        //factotial = num * num-1 * num-2 * ..... * 1
        while(num>0) {
            factorial *= num;
            num--;
        }

        System.out.println("The factorial is "+factorial);

    }
}
