//Program to remove duplicate elements from the array
public class RemoveDuplicates {
    public static boolean map[] = new boolean[26];

    public static void remove(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a']) {
            remove(str, idx + 1, newString);
        } else {
            newString += currChar;
            map[currChar - 'a'] = true;
            remove(str, idx + 1, newString);
        }
    }

    public static void main(String[] args) {
        String str = "aabccdb";
        remove(str, 0, "");
    }
}
