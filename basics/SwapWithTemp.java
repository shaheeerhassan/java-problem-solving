public class SwapWithTemp {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        //Swap with temporary variable
        
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = "+a+" and b = "+b);
    }
}
