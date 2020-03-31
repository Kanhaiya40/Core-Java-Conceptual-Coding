public class SingletonClass {

    public static void main(String[] args) {

        Student s1=Student.getObject();
        Student s2=Student.getObject();
        Student s3=Student.getObject();
        Student s4=Student.getObject();
        Student s5=Student.getObject();
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);



    }
}


class Student {


    private Student() {

    }
    private static Student st=null;

    public static Student getObject()
    {
        if(st==null) {
            System.out.println("Object is null");
            return st = new Student();
        }
        else {
            System.out.println("Object is not null");
            return st;
        }


    }

}
