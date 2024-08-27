public class E107ReverseStringBuffer {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        str.append("Hello ");
        str.append("Friends");
        str.reverse();
        String phrase = str.toString();
        System.out.println(phrase);
    }
}
