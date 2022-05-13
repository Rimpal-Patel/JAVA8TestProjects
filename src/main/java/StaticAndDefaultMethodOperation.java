interface demo
{
   static void setemp(Employee e) {
        e.setId(1);
        e.setName("richa");
        e.setGender("Female");
        e.setEmail("r@gmail.com");
        e.setAge(28);
        e.setDept("Mechanical");

    }
   static void showemp(Employee e)
    {
        System.out.println(e);
    }

    default Employee getEmp() {
        return new Employee();
    }

}
public class StaticAndDefaultMethodOperation implements demo  {
    public static void main(String[] args) {
       Employee e1= new Employee();

        demo.setemp(e1);
        demo.showemp(e1);


    }
}
