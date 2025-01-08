package JavaOOPSConcepts;

public class E162OverridingMethodsPet {
    public static void main(String[] args) {
        Cat cat = new Cat();
        kitten1 k1 = new kitten1();
        kitten2 k2 = new kitten2();
        kitten3 k3 = new kitten3();
        Felines[] felines = {cat,k1,k2,k3};
        for (int i=0; i< felines.length; i++){
            felines[i].eat();
            felines[i].sleep();
        }
        cat.makeSound();
    }
}