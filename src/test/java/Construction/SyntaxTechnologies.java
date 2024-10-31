package Construction;

public class SyntaxTechnologies {
String schoolName;
int batch;
int year;
String lastDayofClass;
// Non-parameter
    SyntaxTechnologies(){
        schoolName=null;
        batch = 0;
        year = 0;
        lastDayofClass = null;
    }
    // Parameterized
    SyntaxTechnologies(String schoolName, int batch,int year, String lastDayofClass){
        this.schoolName = schoolName;
        this.batch = batch;
        this.year = year;
        this.lastDayofClass = lastDayofClass;
    }
    public void display(){
        System.out.println(schoolName+" "+batch+" "+year+" "+lastDayofClass);
    }

}
