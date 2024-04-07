//Write a Java program to take the last three characters from a given string.
// It will add the three characters at both the front and back of the string. 
//String length must be greater than three and more.
public class AddFrontAndBack {
    public static void main(String[] args) {
        String str = "Python";
        int n = str.length();
        char a = str.charAt(n - 1);
        char b = str.charAt(n - 2);
        char c = str.charAt(n - 3);
        String newString = "";
        newString += c;
        newString += b;
        newString += a;
        newString += str;
        newString += c;
        newString += b;
        newString += a;
        System.out.println(newString);

    }
}
