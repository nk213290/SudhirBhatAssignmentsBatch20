package Modifiers;

public class E136AcessModifiers {
    private static void priv(){
        System.out.println("This is a private method.");
    }
    static void defaul(){
        System.out.println("This is a default method.");
    }
    protected static void protect(){
        System.out.println("This is a protected method.");
    }
    public static void publius(){
        System.out.println("This is a public method.");
    }
    // Run
    public static void main(String[] args) {
        priv();
        defaul();
        protect();
        publius();
    }
}
