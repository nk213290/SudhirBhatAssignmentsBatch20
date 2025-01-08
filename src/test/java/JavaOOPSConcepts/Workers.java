package JavaOOPSConcepts;

public class Workers {
    public void work(){
        System.out.println("I am an employee working.");
    }
    protected void takeBreak(){
        System.out.println("I am an employee taking a break.");
    }
    void attendMeeting(){
        System.out.println("I am an employee attending a meeting.");
    }
    private void submitReports(){
        System.out.println("I am an employee submitting a report.");
    }
    public void hello(){
        System.out.println("method in employee class.");
    }
}// Create sub classes
// Manager
class Manager extends Workers{
public void work(){
    System.out.println("I am a manager working.");
}
protected void takeBreak(){
    System.out.println("I am a manager taking a break");
}
public void attendMeeting(){
    System.out.println("I am a manager attending a meeting.");
}
public void hello(){
    System.out.println("method in manager class.");
}
}
// Developer
class Developer extends Workers{
public void work(){
    System.out.println("I am a developer working");
}
protected void takeBreak(){
    System.out.println("I am a developer taking a break.");
}
void attendMeeting(){
    System.out.println("I am a developer attending a meeting.");
}
public void hello(){
    System.out.println("method in developer class.");
}
// Intern class
}
class Intern extends Workers {
    public void work() {
        System.out.println("I am an intern working.");
    }
    protected void takeBreak() {
        System.out.println("I am an intern taking a break.");
    }
    void attendMeeting() {
        System.out.println("I am an intern attending a meeting.");
    }
    public void hello() {
        System.out.println("method in intern class.");
    }
}