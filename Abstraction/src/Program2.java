abstract class Marks {
    abstract double getPercentage();
}
class A extends Marks {
    private int Marks1;
    private int Marks2;
    private int Marks3;

    public A (int Marks1, int Marks2, int Marks3){
        this.Marks1 = Marks1;
        this.Marks2 = Marks2;
        this.Marks3 = Marks3;
    }
    double getPercentage(){
        double totalMarks = Marks1 + Marks2 + Marks3;
        return (totalMarks/300) * 100;
    }

}
class B extends Marks {
    private int SubjectMarks1;
    private int SubjectMarks2;
    private int SubjectMarks3;
    private int SubjectMarks4;

    public B(int SubjectMarks1,int SubjectMarks2, int SubjectMarks3, int SubjectMarks4){
        this.SubjectMarks1 = SubjectMarks1;
        this.SubjectMarks2 = SubjectMarks2;
        this.SubjectMarks3 = SubjectMarks3;
        this.SubjectMarks4 = SubjectMarks4;
    }
    double getPercentage(){
        double totalMarks = SubjectMarks1 + SubjectMarks2 + SubjectMarks3 + SubjectMarks4;
        return (totalMarks / 400) * 100;
    }
}
public class Program2 {
    public static void main(String[] args) {
        A a = new A(45,70,60);
        B b = new B(78,98,56,90);

        System.out.println("Student A: " + a.getPercentage() + "%");
        System.out.println("Student B: " + b.getPercentage() + "%");
    }
}

