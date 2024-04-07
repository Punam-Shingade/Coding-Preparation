/**
 * MoveHashToFront
 */
public class MoveHashToFront {
    public static void MoveHash(String str, int len, int count, String newString, String hashStr) {
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == '#') {
                hashStr += '#';
            } else {
                newString += str.charAt(i);
            }
        }
        System.out.println(hashStr + newString);

    }

    public static void main(String[] args) {
        String str = "Move#Hash#to#Front";
        int len = str.length();
        MoveHash(str, len, 0, "", "");

    }
}