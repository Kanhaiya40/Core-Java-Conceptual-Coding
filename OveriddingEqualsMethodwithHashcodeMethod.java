public class OveriddingEqualsMethodwithHashcodeMethod {
    public static void main(String[] args) {
        EqualWithHashcode e1=new EqualWithHashcode("Kanhaiya",10);
        EqualWithHashcode e2=new EqualWithHashcode("Kanhaiya",10);
        System.out.println(e1);
        System.out.println(e1==e2);
        System.out.println(e1.equals(e2));

    }

}
class EqualWithHashcode
{
    String name;
    int rollno;
    EqualWithHashcode(String name,int rollno)
    {
        this.name=name;
        this.rollno=rollno;

    }
    @Override
    public boolean equals(Object o) {
        if (o instanceof EqualWithHashcode) {
            EqualWithHashcode e1 = (EqualWithHashcode) o;
            if (e1.name.equals(name) && e1.rollno == rollno) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode()+rollno;
    }

    @Override
    public String toString() {
        return name+rollno;
    }
}
