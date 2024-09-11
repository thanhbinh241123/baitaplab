import java.util.Scanner;
interface IPerson{
    void input();
   void display();
}

class Person implements IPerson {
    protected String id;
    protected String name;
    protected int age;

    public Person(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id : ");
        id = scanner.nextLine();
        System.out.println("Enter name : ");
        name = scanner.nextLine();
        System.out.println("Enter age : ");
        age = scanner.nextInt();
    }

    public void display() {
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}
class Student extends Person{
    private int mark;
    private String grade;

    public Student(String id, String name, int age, int mark) {
        super(id, name, age);
        this.mark = mark;
        setGrade();
    }
    public int getMark() {
        return mark;
    }
    public String getGrade() {
        return grade;
    }
    public void setMark(int mark) {
        this.mark = mark;
        setGrade();
    }
    private void setGrade() {
        if (mark >= 8) {
            grade = "A";
        }else if (mark >= 7) {
            grade = "B";
        }else if (mark >= 6) {
            grade = "C";
        }else if (mark >= 5) {
            grade = "D";
        }else {
            grade = "Tach cmnr";
        }
    }
    public void display() {
        super.display();
        System.out.println("Mark:"+ mark);
        System.out.println("Grade: " + grade);
    }

}
public class Main {
    public static void main(String[] args) {
        Student student = new Student("SV001", "Ngyen Van A", 20, 7);
        student.display();
        student.setMark(4);

        System.out.println("Sau khi cap nhap diem:");
        student.display();
    }
}