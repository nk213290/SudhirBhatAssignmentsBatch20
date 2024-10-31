package Construction;

public class E150MultiLevel {
    public static void main(String[] args) {
        Employees emp = new Employees("Isaac", "Cruz",22, 47600);
        student stu = new student("Iman", "Suleyman", 18, 0, 97);
        Retiree ret = new Retiree("Joel", "Windland",73, 32000, 0, "driving");
        emp.printEmployeeDetails();
        stu.printStudentDetails();
        ret.printSeniorDetails();
    }

}
