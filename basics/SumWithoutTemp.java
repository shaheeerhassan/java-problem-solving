public class SumWithoutTemp {
    public static void main(String[] args) {
        //Initialize two variables
        int a = 10;
        int b = 20;

        //a = 30
        a = a + b;
        //b = 10
        b = a - b;
        //a = 20
        a = a - b;

        System.out.println("a = "+a+" and b = "+b);
    }
}
