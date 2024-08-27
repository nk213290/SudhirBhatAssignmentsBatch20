import java.util.Scanner;
public class E100ReverseString {
    public static void main(String[] args) {
     Scanner datum = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = datum.next();
        StringBuilder backward = new StringBuilder(word);
        backward.reverse();
        System.out.println(backward);
    }
}
