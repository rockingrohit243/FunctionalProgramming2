import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student{
    String name;
    Integer percentage;
    Student(String name,Integer percentage)
    {
        this.name=name;
        this.percentage=percentage;
    }
}
public class FunctionMarkSheets {
    public static void main(String[] args) {


        Student[] studentsArray = {
                new Student("Rohit", 90),
                new Student("Sourabh", 80),
                new Student("Nitish", 60),
                new Student("Manas", 50),
                new Student("Swastik", 40),
                new Student("HIMA", 30),
                new Student("Rohit2", 20)
        };
        Function<Student, String> functionInterface =
                student -> {
                    int percentage = student.percentage;
                    if (percentage >= 90) {
                        return "0[outstanding]";
                    }
                    if (percentage >= 70) {
                        return "A[AVERAGE]";
                    }
                    if (percentage >= 40) {
                        return "D[NOT GOOD]";
                    } else return "FAILED";
                };
        Predicate<Student> studentPredicate= s->s.percentage>=60;
        Consumer<Student> studentConsumer= s->{
            System.out.println("Student name: "+s.name);
            System.out.println("Student percentage :"+s.percentage);
        };
        for (Student studentsExampleNormal : studentsArray) {
            if (studentPredicate.test(studentsExampleNormal)){
            studentConsumer.accept(studentsExampleNormal);
            System.out.println("Student grade: "+functionInterface.apply(studentsExampleNormal));
            System.out.println("------------------------------");
        }
        }
    }
}
