public class MethodtoString {
    int roll;
    String name;
    MethodtoString(String name,int roll)
    {
        this.name=name;
        this.roll=roll;


    }

    public static void main(String[] args) {
        MethodtoString m1=new MethodtoString("Kanhaiya",27);
        System.out.println(m1);
        System.out.println(m1.toString());
    }
}
/*
1. In This Program Object Class toString() has been Automatically called.
2. So it will always gives output  --ClassName@hexa-decimal-form-ofhashcode.


 */