class Teacher
{
    private String sub;
    private int period;
    Teacher(String sub , int period)
    {
        this.sub=sub;
        this.period=period;
    }
    public boolean equals(Object obj)
    {
        if (obj instanceof Teacher)
        {
            Teacher t1=(Teacher)obj;
            if (sub.equals(t1.sub)&& period==t1.period)
            {
                return true;
            }
            else {
                return false;
            }
        }
        return true;
    }

}








public class DotEqualsMethodDemo {
    public static void main(String[] args) {
        Teacher t1=new Teacher("Maths",3);
        Teacher t2=new Teacher("Science",5);
        Teacher t3=new Teacher("Maths",3);
        System.out.println(t1.equals(t2));
        System.out.println(t2.equals(t3));
        System.out.println(t3.equals(t1));
    }
}
