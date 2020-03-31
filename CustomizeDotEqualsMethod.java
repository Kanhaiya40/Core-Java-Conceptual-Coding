import java.util.Objects;

public class CustomizeDotEqualsMethod {
    int roll;
    String name;
    CustomizeDotEqualsMethod(String name,int roll)
    {
        this.name=name;
        this.roll=roll;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof CustomizeDotEqualsMethod) {
            CustomizeDotEqualsMethod c1 = (CustomizeDotEqualsMethod) o;
            if (name.equals(c1.name) && roll == c1.roll) {
                return true;
            } else {
                return false;
            }
        }
        return  false;
    }


    public static void main(String[] args) {
        CustomizeDotEqualsMethod d1=new CustomizeDotEqualsMethod("Kanhaiya",40);
        CustomizeDotEqualsMethod d2=new CustomizeDotEqualsMethod("Durga",32);
        CustomizeDotEqualsMethod d3=new CustomizeDotEqualsMethod("Kanhaiya",40);
        CustomizeDotEqualsMethod d4=d1;
        System.out.println(d1.equals(d2));
        System.out.println(d1.equals(d3));
        System.out.println(d2.equals(d3));
        System.out.println(d1.equals(d4));
        System.out.println(d2.equals(d4));
        System.out.println(d3.equals(d4));
    }
}
