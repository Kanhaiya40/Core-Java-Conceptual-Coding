public class ToStringMethod {
    public static void main(String[] args) {
        String1 s1=new String1();
        s1.setName("Kanhaiya");
        s1.setRollno(40);
        System.out.println(s1);
    }

}
class String1
{
    private java.lang.String name;
    private int rollno;

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public java.lang.String toString()
    {
        return name+""+rollno;
    }
}
