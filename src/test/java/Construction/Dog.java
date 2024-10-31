package Construction;

public class Dog {
    private String dogName;
    private double dogWeight; // kg
    static String dogBreed = "Siberian Husky ";
    // constructor
    Dog(String dogName, double dogWeight){
        this.dogName = dogName+" ";
        this.dogWeight = dogWeight;
    }
    public void display(){
        String result = dogName.concat(dogBreed).concat(String.valueOf(dogWeight));
        System.out.println(result);
    }
}
