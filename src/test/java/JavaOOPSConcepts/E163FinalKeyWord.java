package JavaOOPSConcepts;

public class E163FinalKeyWord {
    public static void main(String[] args) {
        StringManipulator reverse = new StringManipulator("mendacity");
        System.out.println(reverse.ReverseString());
        ArrayManipulator manipulator = new ArrayManipulator();
        System.out.println(manipulator.avgElements(new int[]{5, 6, 8, 9, 3}));
    }
}
