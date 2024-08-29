import java.util.concurrent.Callable;
public class CreateMethods {// E108
    public void m1(){
        System.out.println("m1 method implementation");
    }
    public void m2(){
        System.out.println("m2 method implementation");
    }

    public static void main(String[] args) {
        CreateMethods p = new CreateMethods();
        p.m1();
        p.m2();
    }
}
