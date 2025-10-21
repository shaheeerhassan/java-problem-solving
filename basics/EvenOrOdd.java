//Q - Check if a number is even or odd

import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {

        //Take input 
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        in.close();

        //Checks if isEven = true --> num = even
        if(isEven(num)) System.out.println(num+" is an even number");
        //Else num = odd
        else System.out.println(num+" is an odd number");
    }

    static boolean isEven(int n) {
        //function returns true if num is divisible by 2 and false otherwise
        return n%2==0;
    }

}