import java.util.ArrayList;
import java.util.List;

public class IterationListUsingLambda {
    public static void main(String[] args) {
        Employee e1=new Employee(1, "Manish",27, " a@gmail.com ", "Male" , "IT", 9000);
        Employee e2=new Employee(2, "Reema",36, " m@gmail.com ", "Female" , "IT", 25000);
        Employee e3=new Employee(3, "Akash",28, " k@gmail.com ", "Male" , "IT", 32000);
        Employee e4=new Employee(3, "Akash",26, " k@gmail.com ", "Male" , "IT", 32000);
        List<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.forEach(employee -> System.out.println(employee));

        }
    }

