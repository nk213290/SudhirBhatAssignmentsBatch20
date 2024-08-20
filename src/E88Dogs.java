public class E88Dogs {
    public static void main(String[] args) {
        Canines d1 = new Canines();
        Canines d2 = new Canines();
        Canines d3 = new Canines();
        d1.breed = "Husky";
        d1.name = "Vodka";
        d1.color = "Sable";
        d2.breed = "Bulldog";
        d2.name = "Drago";
        d2.color = "Brown";
        d3.breed = "Labrador";
        d3.name = "Sally";
        d3.color = "Black";
        // Print behaviors
        System.out.print(d1.breed);
        d1.bark();
        System.out.print(d2.breed);
        d2.run();
        System.out.print(d3.breed);
        d3.play();
    }
}
