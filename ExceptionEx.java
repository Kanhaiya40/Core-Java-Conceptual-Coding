class Exception extends Throwable {
    public void doStuff() throws ArithmeticException
    {
        doMoreStuff();
        System.out.println("Hi");
    }
    public void doMoreStuff() throws ArithmeticException
    {
        System.out.println("Hello");

    }
}





public class ExceptionEx {
    public static void main(String[] args) throws ArithmeticException {
       Exception e1=new Exception();

       e1.doStuff();
        System.out.println(10/0);

    }
}






