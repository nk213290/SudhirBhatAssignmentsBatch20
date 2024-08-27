import java.util.Scanner;
public class E97BrowserValidationUserInput {
    public static void main(String[] args) {
        Scanner datum = new Scanner(System.in);
        String browser;
        System.out.println("Input a browser.");
        browser = datum.nextLine();
        if (browser.equalsIgnoreCase("Chrome")) {
            System.out.println("Proceed with Chrome browser");
        } else if (browser.equalsIgnoreCase("Firefox")) {

        } else if (browser.equalsIgnoreCase("IE")) {
            System.out.println("Proceed with IE browser");

        }else
            System.out.println("Invalid browser");
    }
}