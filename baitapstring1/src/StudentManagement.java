import java.awt.desktop.SystemEventListener;
import java.util.ArrayList;
class Student {
    private String name;
    private int id;

    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
}
public class StudentManagement{
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Nguyen Van A", 1));
        students.add(new Student("Bob", 2));
        students.add(new Student("Nguyen Thi B", 3));
        students.add(new Student("Jack", 4));
        students.add(new Student("Nguyen Minh C", 5));

        System.out.println("cac sinh vien co ten bat dau bang 'Nguyen':");
        for(Student student : students){
            if(student.getName().startsWith("Nguyen")){
                System.out.println("ID: " + student.getId() + ", Name:" + student.getName());
            }
        }
    }

}
