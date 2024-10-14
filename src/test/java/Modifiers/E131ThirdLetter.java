package Modifiers;

public class E131ThirdLetter {
    public static String thirdLetter(String s){
        StringBuilder newstr = new StringBuilder(s);
        newstr = new StringBuilder(" ");
        for(int i=0; i<s.length(); i=i+3){
            newstr.append(s.charAt(i));
}
        return newstr.toString();
    }

    public static void main(String[] args) {
        System.out.println(thirdLetter("capsicum"));
    }
}
