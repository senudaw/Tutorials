package Q1;

public class Student {
    int StdID;
    String Name;
    int StdAge;

    public Student(){

    }

    public Student(int StdID, String Name, int StdAge) {
        this.StdID = StdID;
        this.Name = Name;
        this.StdAge = StdAge;
    }

    public void Study() {
        System.out.println("I'm Studying.");
    }
}
