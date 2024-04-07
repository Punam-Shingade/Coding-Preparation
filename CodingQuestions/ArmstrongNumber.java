//Program to check number Armstrong or not
public class ArmstrongNumber {
    public static void main(String args[]) {

        // Logic of power
        int num = 153;
        int sum = 0;
        int temp = num;
        while (num > 0) {
            int digit = num % 10;
            sum = sum + (digit * digit * digit);
            num = num / 10;
        }
        if (temp == sum) {
            System.out.println("armstrong");
        } else
            System.out.println("Not Armstrong");
    }
}
