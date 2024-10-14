package Modifiers;

public class E137DiffAccessModif {
    private  String name;
    String city;
    protected String schoolname;
    public int batch;
    // display method
    public void display(){
        System.out.println("My name is "+name+" and I live in "+city+", I study at "+schoolname+" in batch "+batch);

    }

    public static void main(String[] args) {
        E137DiffAccessModif dis = new E137DiffAccessModif();
        dis.name = "Sudhir";
        dis.city = "Houston";
        dis.schoolname = "Syntax";
        dis.batch = 20;
        dis.display();

    }

}
