
import java.util.ArrayList;
import java.util.function.Predicate;

class EmployeeDetails{
    String name;
    double salary;

    public EmployeeDetails(String name, double salary) {
        this.name=name;
        this.salary=salary;
    }
}
public class EmployeeSalaryFetchUsingPredicate {
    public static void main(String[] args) {
        ArrayList<EmployeeDetails> employeeDetailsArrayList=new ArrayList<>();
        employeeDetailsArrayList.add(new EmployeeDetails("Nitish",10089.90));
        employeeDetailsArrayList.add(new EmployeeDetails("Sourabh",20000.90));
        employeeDetailsArrayList.add(new EmployeeDetails("Rohit",182323.94));
        employeeDetailsArrayList.add(new EmployeeDetails("Soumya",23000.78));
        Predicate<EmployeeDetails> employeeDetailsPredicate=employeePass -> employeePass.salary>3000.00 && employeePass.name.length()%2==0;
        for (EmployeeDetails singleEmployee:employeeDetailsArrayList)
        {
            if (employeeDetailsPredicate.test(singleEmployee)){
                System.out.println(singleEmployee.name+" "+
                        singleEmployee.salary);
            }
        }
    }
}
