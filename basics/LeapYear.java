import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter year A.D: ");
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
        if(year%4!=0) {
            return false;
        } else if(year%100!=0) {
            return true;
        } else if(year%400==0) {
            return true;
        } return false;
    }
}
