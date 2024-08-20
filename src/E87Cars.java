public class E87Cars {
    public static void main(String[] args) {
        Car auto1 = new Car();
        Car auto2 = new Car();
        // first vehicle
        auto1.carColor = "Black";
        auto1.carYear = 2019;
        auto1.carMake = "BMW";
        // second vehicle
        auto2.carColor = "White";
        auto2.carYear = 2018;
        auto2.carMake = "Toyota";
        // print objects
        System.out.println("Car color is "+auto1.carColor+" and car year is "+auto1.carYear+" and car model is "+auto1.carMake);
        System.out.println("Car color is "+auto2.carColor+" and car year is "+auto2.carYear+" and car model is "+auto2.carMake);



    }
}
