public class E126CountingInstances {
    static int instanceCount = 0;

    public E126CountingInstances(){
        instanceCount++;
    }

    public static void main(String[] args) {
        E126CountingInstances x = new E126CountingInstances();
        E126CountingInstances y = new E126CountingInstances();
        E126CountingInstances z = new E126CountingInstances();

        System.out.println(E126CountingInstances.instanceCount);
    }
}
