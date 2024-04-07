public class CountEvenOddInArray {
    public static void main(String[] args) {
        int a[] = { 4, 3, 7, 2, 9, 1 };
        int even = 0;
        int odd = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even Integer :" + even);
        System.out.println("Odd Integer :" + odd);
    }
}
