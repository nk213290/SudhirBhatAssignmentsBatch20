import java.util.Scanner;
public class E105PrintVowels {
    public static void main(String[] args) {
        Scanner datum = new Scanner(System.in);
        System.out.println("Enter a word."); // Epidermis
        String str = datum.next();
        str = str.toLowerCase();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u'){
                System.out.print(str.charAt(i)+" ");
            }
        }
    }
}
