public class E120InstanceVariables {
    int year;
    String school;
    int batch;

    public static void main(String[] args) {
        E120InstanceVariables assign = new E120InstanceVariables();
        assign.batch = 20;
        assign.school = "Syntax";
        assign.year = 2024;
        System.out.println("I am a student of batch "+assign.batch+" studying at "+assign.school+" in the year of "+assign.year);
    }
}


