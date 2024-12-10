package Static_Method;

public class MainStudent {
    public static void main(String[] args) {
        Student.change();  // chu dao

        Student s1 = new Student(11, "Nali");
        Student s2 = new Student(12,"La Ly");
        Student s3 = new Student(13 , "Trang");

        s1.display();
        s2.display();
        s3.display();
    }
}
