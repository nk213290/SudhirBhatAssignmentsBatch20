public class E106StringBuffer {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        str.append("Hello ");
        str.append("World");
        String phrase = str.toString();
        phrase = phrase.toUpperCase();
        System.out.println(phrase);
    }
}

