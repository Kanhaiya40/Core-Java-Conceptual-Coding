import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class OurOwnGenricClass {
    public static void main(String[] args) {

        Genric<String> g1 = new Genric<String>("Kanhaiya");
        g1.addEmployee("Kanhaiya");
        System.out.println(g1.getEmployee());
    }


}
class Genric<Employee>
{
    Employee t;
    public Genric(Employee t)
    {
        this.t=t;
    }
    public boolean  addEmployee(Employee e)
    {
        System.out.println("This is Variables Class Names:"+t.getClass().getName());
        return true;
    }
    public Employee getEmployee()
    {
        System.out.println("Employee Name:");
        return  t;
    }
}
