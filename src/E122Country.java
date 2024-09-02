 class Country{
    String countryName;
    String capital;
    int populationSize;
public  void sentence(){
    System.out.println("The capital of "+countryName+" is "+capital+" and the population is "+populationSize);
}
}

public class E122Country {
    public static void main(String[] args) {
        Country c = new Country();
        c.countryName = "USA";
        c.capital = "Washington DC";
        c.populationSize = 330000000;

        Country d = new Country();
        d.countryName = "Kazakhstan";
        d.capital = "Astana";
        d.populationSize = 18500000;

        c.sentence();
        d.sentence();



    }
}
