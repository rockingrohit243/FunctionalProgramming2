import java.util.Arrays;
import java.util.List;
class StudentsExampleNormal {
    private String name;
    private int marks;
    StudentsExampleNormal(String name, int marks)
    {
        this.name=name;
        this.marks=marks;
    }
    public String getName()
    {
        return this.name;
    }
    public Integer marks()
    {
        return this.marks;
    }
}
public class StreamNormalExample {
    public static void main(String[] args) {
        List<StudentsExampleNormal>  studentsExampleNormalList= Arrays.asList(
                new StudentsExampleNormal("Rohit",12),
                new StudentsExampleNormal("Sourabh",23));
//        studentsExampleNormalList.parallelStream().map()
    }


}
