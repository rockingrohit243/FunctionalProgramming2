import java.util.ArrayList;
import java.util.function.BiFunction;
class Employee{
    Integer empNo;
    String  empName;
    Employee(Integer empNo,String empName)
    {
        this.empNo=empNo;
        this.empName=empName;
    }
}
public class ArrayListBiFunction {
    public static void main(String[] args) {
        ArrayList<Employee> employeeArrayList=new ArrayList<>();
        BiFunction<Integer,String,Employee> biFunction=(empId,enmpName)->
                new Employee(empId,enmpName);

        employeeArrayList.add(biFunction.apply(1,"Rohit"));
        employeeArrayList.add(biFunction.apply(2,"Sourabh"));
        employeeArrayList.add(biFunction.apply(3,"Nitish"));
        for (Employee employee:employeeArrayList)
        {
            System.out.println("Employee Id :"+employee.empNo);
            System.out.println("Employee Name: "+employee.empName);
            System.out.println();
        }
    }
}
