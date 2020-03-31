public class DotEqualsMethod {
    int roll;
    String name;
    DotEqualsMethod(String name,int roll)
    {
        this.name=name;
        this.roll=roll;

    }

    public static void main(String[] args) {
        DotEqualsMethod d1=new DotEqualsMethod("Kanhaiya",40);
        DotEqualsMethod d2=new DotEqualsMethod("Durga",32);
        DotEqualsMethod d3=new DotEqualsMethod("Kanhaiya",40);
        DotEqualsMethod d4=d1;
        System.out.println(d1.equals(d2));
        System.out.println(d1.equals(d3));
        System.out.println(d2.equals(d3));
        System.out.println(d1.equals(d4));
        System.out.println(d2.equals(d4));
        System.out.println(d3.equals(d4));
    }
}

/*
1. By Default Object Class .equals method is reference comparision but equals method means content comparison so we do Overriding of .equals Method.
 */
