package Q1;

public class Main {
    public static void main(String[] args) {

        Student s1=new Student();

        s1.Name="Nimal";
        s1.StdAge=10;
        s1.StdID=1123;

        System.out.println(s1.Name);

        Student s2=new Student(12345,"pina",12);

        System.out.println(s2.Name);
    }
}
