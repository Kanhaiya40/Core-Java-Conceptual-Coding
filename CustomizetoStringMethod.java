 class Customize {
    int roll;
    String name;
    Customize(String name,int roll)
    {
        this.name=name;
        this.roll=roll;


    }
    public String toString()
    {
        return name+"..."+roll;
    }
}
public class CustomizetoStringMethod {
    public static void main(String[] args) {
        Customize m1=new Customize("Kanhaiya",27);
        System.out.println(m1);

    }
}
/*
1. In this Program we have Overridden toString() of Object class.
2. Our Own Customize toString() has been Called That which is present in our current Program.
 */