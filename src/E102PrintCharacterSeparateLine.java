import java.util.Scanner;
public class E102PrintCharacterSeparateLine {
    public static void main(String[] args) {
    Scanner datum = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = datum.nextLine();
        for(int i=0; i < word.length(); i++){
            System.out.println(word.charAt(i));
        }
    }// test word platypus
}
