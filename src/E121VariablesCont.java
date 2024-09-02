public class E121VariablesCont {
    int number;
    double decimal;
    char z;

    public static void main(String[] args) {
        E121VariablesCont assign = new E121VariablesCont();
        assign.number = 100;
        assign.decimal = 3.14159585;
        assign.z = 'Z';
        System.out.println(assign.number);
        System.out.println(assign.decimal);
        System.out.println(assign.z);
    }
}
