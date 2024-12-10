package Student;

public class MainStudent {
    public static void main(String[] args) {
        Student student = new Student();

        System.out.println("gia tri mac dinh name : " + student.getName());
        System.out.println("gia tri mac dinh classes :" + student.getClasses());

        student.setClasses("O2");
        student.setName("My My");

        System.out.println("gia tri name :" +  student.getName());
        System.out.println("gia tri classes :" + student.getClasses());

    }
}
