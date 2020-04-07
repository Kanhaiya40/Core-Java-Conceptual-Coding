public class NonGenricToGenricClass {
    public static void main(String[] args) {
        System.out.println("So This  Object is Of Non Genric ArrayList:");
        System.out.println("ArrayList a=new ArrayList();");
        System.out.println("This Object is Of Genric Class ArrayList:");
        System.out.println("ArrayList<String> a=new ArrayList<String>();");
        ArrayList2 a=new ArrayList2();//No Error
        ArrayList1<String1> a1=new ArrayList1<String1>();//No Exception
        }
    }

//This Is Non Genric Version Of ArrayList Class
class ArrayList2
{
    public boolean add(Object o)
    {
        return true;
    }
    public Object get(int i)
    {
        return true;
    }
}

//Now Genric Version Of ArrayList Class

  class ArrayList1<String>
{
    public boolean add(String s)
    {
        return true;
    }
    public String get(int i)
    {
        return null;
    }

}
