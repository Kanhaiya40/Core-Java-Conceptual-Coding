public class TryCatch {
    public static void main(String[] args) {
        System.out.println("Hello");
        try {

            System.out.println(10 / 0);
        }
        catch(ArithmeticException e)
        {
            e.printStackTrace();
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(10/2);
        }

    }
}
