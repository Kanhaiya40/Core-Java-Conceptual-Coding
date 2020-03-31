public class OverridingHashCodeMethod {
    public static void main(String[] args) {
        Hashcode h1=new Hashcode("Kanhaiya",10);
        Hashcode h2=new Hashcode("Kanhaiya",54);
        System.out.println(h2);
       if (h1.equals(h2))
       {
           System.out.println("Same Hashcode");
       }
       else
       {
           System.out.println("Hash code are not same");
       }
        System.out.println(h1);
    }
}
class Hashcode
{
    private String name;
    private int rollno;
    public Hashcode(String name,int rollno)
    {
        this.rollno=rollno;
    }


    @Override
    public int  hashCode() {
       // return 100;/* Improper Overriding of Hashcode */
        return  rollno; /* Proper Overriding of HashCode */
    }

    @Override
    public boolean equals(Object o) {
        Hashcode h4=(Hashcode)o;
        if (rollno==h4.rollno)
        {
            return  true;

        }
        else
        {
            return  false;
        }


    }

}