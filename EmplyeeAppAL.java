
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmplyeeAppAL {

    ArrayList<EmployeeAL> l=new ArrayList<>();
    List l1=new ArrayList();
    Scanner sc=new Scanner(System.in);
    EmployeeAL e1=new EmployeeAL();
    DepartmentAL d1=new DepartmentAL();


    public void enteredToCompanyPortal()  {
        int choice;
        System.out.println("Enter Your Choice :");
        System.out.println("1. Get List Of Employees \n 2. Get Employee By Id \n 3. Add Employee \n 4. Logout");
        choice=sc.nextInt();
        int id;
        switch (choice)
        {
            case 1:
                System.out.println(getListOfEmployee());
                enteredToCompanyPortal();

            break;
            case 2:
                System.out.println("Enter Department id");
                id=sc.nextInt();
                getEmployeee(id) ;
                enteredToCompanyPortal();
            break;
            case 3:setEmployeeDetails();
                System.out.println(addEmployee(e1));
                enteredToCompanyPortal();

            break;
            case 4:
                System.out.println("Thnkyou");
                System.exit(0);
            break;
            default:
                System.out.println("InApropriate Choice Sorry");
        }


    }

    public void setEmployeeDetails()  {
        e1.setDepartment(d1);

        System.out.println("Enter Employee's DepartmentId:");
        e1.Department.setDid(sc.nextInt());

        sc.nextLine();


        System.out.println("Enter Employee's Desigination:");
        e1.Department.setDegination(sc.nextLine());


        System.out.println("Enter Employee's Department Name");
        e1.Department.setDname(sc.nextLine());




        System.out.println("Enter Employee's Id:");
        e1.setEid(sc.nextInt());

        sc.nextLine();


        System.out.println("Enter Employee's Name");
        e1.setEname(sc.nextLine());

        System.out.println("Employee Added");


    }
    public void getEmployeee(int id) {

         if(e1.Department.getDid()=='\0')
        {
            System.out.println("Please Add Emplyooee First");
        }



        else if(id==e1.Department.getDid())
        {
            System.out.println("Department Id:\t"+id);
            System.out.println("Department Name-\t"+e1.Department.getDname());
            System.out.println("Employee Name:\t"+e1.getEname());
            System.out.println("Emplyee Id:"+e1.getEid());
            System.out.println("Employee Desigination-\t"+e1.Department.getDegination());


        }




        else
        {
            System.out.println("There is No Employee With This Given Id:\t"+id);
        }
    }
    public Object addEmployee(EmployeeAL e)
    {

         l.add(e1);
         return  l;

    }
    public List getListOfEmployee()
    {
       l1.add(e1.getEname());


       return l1;
    }



}
