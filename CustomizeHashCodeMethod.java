import java.util.Objects;

public class CustomizeHashCodeMethod {
    int i;

    CustomizeHashCodeMethod(int i)
    {
        this.i=i;
    }



    @Override
    public int hashCode() {
        return i;
    }

    public static void main(String[] args) {
        CustomizeHashCodeMethod c1=new CustomizeHashCodeMethod(10);
        System.out.println(c1);
    }
}
