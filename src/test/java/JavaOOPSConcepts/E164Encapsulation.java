package JavaOOPSConcepts;
class Employees{
    private String empName = "John";
    private int empAge = 30;
    public String getEmpName(){
        return empName;
    }
    public int getEmpAge(){
        return empAge;
    }
}
public class E164Encapsulation {
    public static void main(String[] args) {
        Employees employees = new Employees();
        System.out.println("The employee name is: "+employees.getEmpName());
        System.out.println("The employee age is: "+employees.getEmpAge());
    }
}
