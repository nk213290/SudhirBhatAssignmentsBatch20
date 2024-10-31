package Construction;

public class E146EmployeeInfo {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee("Sudhir", "Bhat", 1008, "AUG022000", 21367.50);
        emp1.printDetails();
        emp2.printDetails();
    }
}
