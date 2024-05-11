import java.util.ArrayList; import java.util.function.BiConsumer;

class EmployeeConsumer{
    String empName;
    Double salary;
    EmployeeConsumer(String empName,Double salary)
    {
        this.empName=empName;
        this.salary=salary;
    }
}
public class BiConsumerTest {
    public static void main(String[] args) {
        ArrayList<EmployeeConsumer> employeeConsumersArrayList = new ArrayList<>();
         populate(employeeConsumersArrayList);
         BiConsumer<EmployeeConsumer,Double> biConsumer=(employeeConsumer,amountToIncrease)->{
             employeeConsumer.salary= employeeConsumer.salary+amountToIncrease;
         };
         for (EmployeeConsumer employeeConsumer:employeeConsumersArrayList)
         {
             biConsumer.accept(employeeConsumer,500.9);
             System.out.println("Employee name:"+employeeConsumer.empName);
             System.out.println("Employee salary:"+employeeConsumer.salary);
         }
       }

    private static void populate(ArrayList<EmployeeConsumer> employeeConsumersArrayList) {
        employeeConsumersArrayList.add(new EmployeeConsumer("Rohit", 1000.17));
        employeeConsumersArrayList.add(new EmployeeConsumer("Nitish", 3000.10));
        employeeConsumersArrayList.add(new EmployeeConsumer("Sourabh", 433287.10));
    }
}

