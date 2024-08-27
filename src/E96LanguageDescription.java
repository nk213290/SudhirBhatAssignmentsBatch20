import java.util.Scanner;
public class E96LanguageDescription {
    public static void main(String[] args) {
        Scanner datum = new Scanner(System.in);
        String language;
        System.out.println("Input a language.");
        language = datum.nextLine();
        // conditional statements
        if(language.equals("Java")){
            System.out.println("Java is a programming language");
        } else if (language.equals("C")) {
            System.out.println("C is a procedural programming language");
            
        } else if (language.equals("c++")) {
            System.out.println("C++ is a middle-level programming language");

        }else
            System.out.println("Doesn't match any programming language");
    }
}
