package Student;

public class Student {
    private String name;
    private String classes;


    public Student() {
    }

    public Student(String name, String classes) {
        this.name = "john";
        this.classes = "CO2";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
