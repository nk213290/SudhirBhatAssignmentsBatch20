import  java.util.Scanner;
public class E101EveryOtherLetter {
    public static void main(String[] args) {
    Scanner datum = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = datum.nextLine();
        for(int i=0; i < word.length(); i+=2){ // starts on first letter
            System.out.print(word.charAt(i)+" ");
        }
    } // test word fiduciary
}
