// Q - Check if a year is a leap year

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter year (A.D): ");
        int year = in.nextInt();
        while(year<=0) {
            System.out.print("Plese Enter A.D year only: ");
            year = in.nextInt();
        }
        in.close();

        if(isLeapYear(year)) System.out.println(year+" is a leap year");
        else System.out.println(year+" is not a leap year");
    }

    static boolean isLeapYear(int year) {
        //Must be divisible by 4
        //Either not divisible by 100 or multiple of 400
        return (year%4==0) && (year%100!=0 || year%400==0);
    }
}
