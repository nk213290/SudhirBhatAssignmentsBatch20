public class E127CreatingMethods {
    public static void staticMethod(){
        System.out.println("Java is awesome.");
    }
    public void nonStaticMethod(){
        System.out.println("Programming is amazing.");
    }

    public static void main(String[] args) {
        E127CreatingMethods s = new E127CreatingMethods();
        s.nonStaticMethod();
        staticMethod();
    }
}
