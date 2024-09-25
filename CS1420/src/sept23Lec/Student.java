package sept23Lec;

public class Student {

    private String name;

    // this is a constuctor
    public Student() {
        this.name = "Default";
    }

    public Student(String studentName) {
        this.name = studentName;
    }

    // access modifiers
    //  public -- any class can use
    //  private -- only the defining class can use

    // always make instance variables private
}
