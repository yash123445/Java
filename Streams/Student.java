import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Student {
    public String name;

    public float percentagee;


    public Student(String name, float d) {
        super();
        this.name = name;
        this.percentagee = d;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", percentagee=" + percentagee + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPercentagee() {
        return percentagee;
    }

    public void setPercentagee(float percentagee) {
        this.percentagee = percentagee;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Yash", 74));
        students.add(new Student("John", 39));
        students.add(new Student("Alice", 36));
        students.add(new Student("Bob", 67));

        List<Student> failStudent =  students.stream().
                filter((Student) -> Student.getPercentagee() <40).
                map((student) -> new Student(student.getName(), student.getPercentagee()+5.0f)).    // here we incresed the 5 % in failed students results.
                toList();

      // Sorting the students by their names 
        List<Student> sortedStudents = students.stream().sorted(Comparator.comparing(Student::getName)).
                collect(Collectors.toList());
        System.out.println(sortedStudents);
        System.out.println(failStudent);
    }
}

