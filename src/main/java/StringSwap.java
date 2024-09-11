public class StringSwap {
    public static void main(String[] args) {
        String word1 = "pelican";
        String word2 = "husky";
        System.out.println(word1+" "+word2); // print first and second string
        word1 = word1+word2;
        word2 = word1.replaceAll(word2,"");
        word1 = word1.replaceAll(word2,"");
        System.out.println(word1+" "+word2); // Values swapped without third variable

    }
}
