interface  Inside
{
    public int getNoOfBooks();

    class Inside1 implements Inside
    {
        @Override
        public int getNoOfBooks() {
            System.out.println(3);
            return 3;
        }
    }
    class  Inside2 implements  Inside
    {
        @Override
        public int getNoOfBooks() {
            System.out.println(6);
            return 6;
        }
    }
}


public class ClassInsideInterface {
    public static void main(String[] args) {
        Inside.Inside1 i1=new Inside.Inside1();
        i1.getNoOfBooks();
        Inside.Inside2 i2=new Inside.Inside2();
        i2.getNoOfBooks();
    }
}
