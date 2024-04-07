
//Using recursion
import java.util.Scanner;

public class Fibonacci {
    public static void printFibonacci(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        printFibonacci(b, c, n - 1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = 0, b = 1;

        System.out.println("Enter nth term");
        int n = s.nextInt();
        System.out.println(a);
        System.out.println(b);
        printFibonacci(a, b, n - 2);
    }
}
