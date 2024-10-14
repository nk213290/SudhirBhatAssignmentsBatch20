package Modifiers;

public class E135Parentheses {
    public static String Surround(String s, String search_term){
        s = s.replace(search_term, "("+search_term+")");
        return s;
    }
    public static void main(String[] args) {
        System.out.println( Surround("fhjilknbvcddddfghh","d"));
    }
}
