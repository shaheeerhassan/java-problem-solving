import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        in.close();
        if(isEven(num)) System.out.println(num+" is an even number");
        else System.out.println(num+" is an odd number");
    }

    static boolean isEven(int n) {
        return n%2==0;
    }

}