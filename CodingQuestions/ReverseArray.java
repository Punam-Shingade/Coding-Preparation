public class ReverseArray {

    public static void main(String[] args) {
        int n = 5;
        int a[] = { 1, 23, 4, 5, 6 };
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Reverse of array is:");
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
