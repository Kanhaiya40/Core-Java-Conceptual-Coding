interface TypeCast1
{
    public void m1();

}
class TypeCast2 implements TypeCast1
{
    @Override
    public void m1() {
        System.out.println("This is Child Class");
    }
}

public class TypeCasting {
    public static void main(String[] args) {
        TypeCast2 t2=new TypeCast2();
        TypeCast1 t5 = (TypeCast1) t2;
        t2.m1();
        t5.m1();

    }
}
