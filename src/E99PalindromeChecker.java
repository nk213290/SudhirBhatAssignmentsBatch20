import java.util.Locale;
import java.util.Scanner;
public class E99PalindromeChecker {
    public static void main(String[] args) {
        Scanner datum = new Scanner(System.in);
        System.out.println("Input a word.");
        String letters = datum.next();
        letters = letters.toLowerCase();
        StringBuilder word = new StringBuilder(letters);
        word.reverse();
        String reverseword = word.toString();
        if(reverseword.equals(letters)){
            System.out.println("true");
        }else
            System.out.println("false");

    }
}
