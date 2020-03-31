public class CreatingDriverMangerClass {
    public static void main(String[] args) {
        Connection con=DriverManger.getConnection("rockstartkanhaiya40@gmail.com","8294741264kk");
        System.out.println(con);
    }
}

class DriverManger implements Connection
{
    private String UserName;
    private String Password;

    private DriverManger()
    {

    }

    private static DriverManger dm=null;

    public static DriverManger getConnection(String Username,String Password)
    {
        if(dm==null)
        {
             return dm=new DriverManger();
        }
        else
        {
            return dm;
        }
    }
}
interface Connection
{

}