package UnaryOperatorExample;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;
import java.util.function.UnaryOperator;
@Data
class Student{
    private  int  id;
    private String name;
    private  Long marks;
    private Double fees;
    Student(int id,String  name,Long marks,Double fees)
    {
        this.id=id;
        this.name=name;
        this.marks=marks;
        this.fees=fees;
    }
}
public class UnaryOperatorStudent {
    public static void main(String[] args) {
        Logger logger= LoggerFactory.getLogger(UnaryOperatorStudent.class);
        List<Student> studentList=new ArrayList<>();
        studentList.add(new Student(1, "Alice", 85L,25000.00));
        studentList.add(new Student(2, "Bob", 34L,50000.90));
        studentList.add(new Student(3, "Charlie", 54L,2111.11));
        logger.error("Applying unary operator interface....");
        UnaryOperator<Student> studentUnaryOperator = getStudentUnaryOperator();
        for (Student student:studentList)
        {
            System.out.println(studentUnaryOperator.apply(student));
        }
    }
    private static UnaryOperator<Student> getStudentUnaryOperator() {
        IntUnaryOperator intUnaryOperator=i->i+2105266100;
        LongUnaryOperator longUnaryOperator=i->i+10;
        DoubleUnaryOperator doubleUnaryOperator=fee->fee*2337.90;
        return student ->{
            student.setName(student.getName().toUpperCase());
            student.setMarks(longUnaryOperator.applyAsLong(student.getMarks()));
            student.setId(intUnaryOperator.applyAsInt(student.getId()));
            student.setFees(doubleUnaryOperator.applyAsDouble(student.getFees()));
            return student;
        };
    }
}
