public class BoundedTypeGenricClasses {
    public static void main(String[] args) {
        Bounded<Integer> b1=new Bounded<Integer>();//Only Number type Wrapper Classes Can be Used
       // Bounded<String> b2=new Bounded<String>();//Type parameter 'java.lang.String' is not within its bound; should extend 'java.lang.Number'
        BoundedT<Integer,String> b2=new BoundedT<Integer,String>();
        BoundedTy<Thread> b3=new BoundedTy<Thread>();

    }

}
class Bounded<T extends Number>
{

}
class BoundedT<T extends Number,String>
{

}
class BoundedTy<T extends Runnable>
{

}