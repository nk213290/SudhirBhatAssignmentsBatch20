public class E129StaticVarMeth {
    static String countryName;
    static String continent;
    static void display(){
        System.out.println(countryName+" located on "+continent+" continent");
    }

    public static void main(String[] args) {
        countryName = "Switzerland";
        continent = "Europe";
        display();
    }
}
