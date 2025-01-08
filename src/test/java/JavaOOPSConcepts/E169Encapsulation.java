package JavaOOPSConcepts;

public class E169Encapsulation {
    public static void main(String[] args) {
        Employ employ = new Employ();
        employ.setEmpName("Sudhir");
        employ.setEmpAge(49);
        System.out.println("Employee Name: "+employ.getEmpName());
        System.out.println("Employee Age: "+employ.getEmpAge());
    }
}
