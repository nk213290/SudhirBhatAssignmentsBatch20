import java.util.Scanner;
public class E95ExtractUsingScanner {
    public static void main(String[] args) {
        Scanner datum = new Scanner(System.in);
        String word;
        System.out.println("Input a word.");
        word = datum.nextLine();
        String partial = word.substring(0,3);
        System.out.println("The first three letters of "+word+" are "+partial);
    }
}
