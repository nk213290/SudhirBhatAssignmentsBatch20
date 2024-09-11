public class CountVowels {
    public static void main(String[] args) {
        String str = "documentation";
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                counter++;
            }
        }
        System.out.println("The number of vowels is "+counter);
    }
}