import java.util.Scanner;
public class E104PrintFirstThreeCharacters {
    public static void main(String[] args) {
        Scanner datum = new Scanner(System.in);
        String names[] = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a name.");
            names[i] = datum.nextLine();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(names[i].substring(0, 3));
        }
    }
}