//Given a string with multiple characters that are repeated consecutively, 
//reduce the size of the string using mathematical logic.
// Replace consecutive repeated characters with the character followed by the count of repetitions.
//Input: aabbbbeeeeffggg
//Output: a2b4e4f2g3
public class Que24 {
    public static String reduceString(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        StringBuilder reducedString = new StringBuilder();
        char currentChar = s.charAt(0);
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == currentChar) {
                count++;
            } else {
                reducedString.append(currentChar).append(count);
                currentChar = s.charAt(i);
                count = 1;
            }
        }

        reducedString.append(currentChar).append(count);

        return reducedString.toString();
    }

    public static void main(String[] args) {
        String inputString = "aabbbbeeeeffggg";
        String reduced = reduceString(inputString);
        System.out.println(reduced);
    }
}
