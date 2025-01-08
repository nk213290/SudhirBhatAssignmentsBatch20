package JavaOOPSConcepts;

public class E161OverridingMethods {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Developer developer = new Developer();
        Intern intern = new Intern();
        Workers[] workers = {manager,developer,intern};
for (int i=0; i< workers.length; i++){
    workers[i].hello();
}
Developer dev = new Developer();
dev.work();
dev.attendMeeting();
dev.takeBreak();
    }
}
