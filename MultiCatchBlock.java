public class MultiCatchBlock {
    public static void main(String[] args) {
        try {
            String s=null;
            System.out.println(s.length());
            System.out.println(10 / 0);
            Thread.sleep(2000);


        }
        catch (ArithmeticException|NullPointerException|InterruptedException e)
        {
            throw new NumberFormatException();

        }
    }
}
