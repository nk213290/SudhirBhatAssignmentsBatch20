class Instance{
    int myInt;
    String mystring;
    double myDouble;
    Boolean myboolean;
    float myFloat;
    void dispplay(){
        System.out.println(myboolean);
        System.out.println(myDouble);
        System.out.println(myFloat);
        System.out.println(mystring);
        System.out.println(myInt);
    }
}

public class E123VariablesDefault {
    public static void main(String[] args) {
        Instance k = new Instance();
        k.dispplay();
    }
}
