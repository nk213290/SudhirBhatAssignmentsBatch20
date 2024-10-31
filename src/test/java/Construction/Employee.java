package Construction;

public class Employee {
    private String name, lastName;
    private int employeeID;
    private String startDate;
    private double salary;
    // Non-Argument Constructor
    Employee(){
        name=null;
        lastName=null;
        employeeID=0;
        startDate=null;
        salary=0.0;
    }// Parameter Constructor
    Employee(String name,String lastName,int employeeID, String startDate, double salary){
        this.name = name;
        this.lastName = lastName;
        this.employeeID = employeeID;
        this.startDate = startDate;
        this.salary = salary;
    } //Print the details in a single line
    void printDetails(){
        System.out.println(name+" "+lastName+" "+employeeID+" "+startDate+" "+salary);
    }
}
