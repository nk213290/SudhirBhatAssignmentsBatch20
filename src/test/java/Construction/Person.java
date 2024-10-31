package Construction;

 class Person {
     private  String name;
     private  String lastName;
     private  int age;
     // Create Constructor
     Person(String name, String lastName, int age){
         this.name = name;
         this.lastName = lastName;
         this.age = age;
     }
     void displayInfo(){
         System.out.print(name+" "+lastName+" "+age+" ");
     }
}
class Employees extends Person {
private int salary;

    Employees(String name, String lastName, int age, int salary) {
        super(name, lastName, age);
        this.salary = salary;
    }
    void printEmployeeDetails(){
        super.displayInfo();
        System.out.println(salary+" ");
    }
}
class student extends Employees{
     int grade;
    student(String name, String lastName, int age, int salary, int grade) {
        super(name, lastName, age, salary );
        this.grade = grade;
    }
    void printStudentDetails(){
        super.printEmployeeDetails();
        System.out.println(grade+" ");
    }
}
class Retiree extends student {
     String seniorActivity;
    Retiree(String name, String lastName, int age, int salary, int grade, String seniorActivity) {
        super(name, lastName, age, salary, grade);
        this.seniorActivity = seniorActivity;
    }
    void printSeniorDetails(){
        super.printStudentDetails();
        System.out.println(seniorActivity);
    }
}
