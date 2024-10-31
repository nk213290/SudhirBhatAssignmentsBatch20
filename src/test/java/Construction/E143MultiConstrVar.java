package Construction;

public class E143MultiConstrVar {
    public static void main(String[] args) {
        Car c1 = new Car("Honda", "Civic Sport", 4, 200, 24869.52);
        Car c2 = new Car("Honda", "Civic Sport", 200, 24869.52);
        Car c3 = new Car(4, 200, 24869.52);
        Car c4 = new Car("Honda", "Civic Sport", 4);
        c1.display();
        c2.display();
        c3.display();
        c4.display();

    }
}
