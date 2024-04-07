//How to calculate the number of vowels and consonants in a string?
public class NoOfVowelsAndConson {
    public static void main(String[] args) {
        String str = "punamshingade";
        int c = 0;
        int v = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == '0'
                    || str.charAt(i) == 'u')
                    || (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'O' || str.charAt(i) == 'U'
                            || str.charAt(i) == 'I')) {
                v++;
            } else {
                c++;
            }
        }
        System.out.println("Number of vowels:" + v);
        System.out.println("Number of consonants:" + c);
    }
}
