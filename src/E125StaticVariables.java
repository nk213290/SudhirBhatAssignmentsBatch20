public class E125StaticVariables {
    static int number;

    public static void main(String[] args) {
        number =100;
        E125StaticVariables num = new E125StaticVariables();
        num.number=200;
        System.out.println(number);
        System.out.println(num.number);
    }
}
