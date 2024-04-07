//Remove all char except alphabets
public class RemoveCharExceptAlph {
    public static void main(String[] args) {
        String str = "#1sTr5In*g";
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                newString += str.charAt(i);
            }
        }
        System.out.println(newString);
    }
}
