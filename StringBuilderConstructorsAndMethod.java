public class StringBuilderConstructorsAndMethod {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder();
        sb1.append("Kanhaiya");
        StringBuilder sb2=new StringBuilder("Sistec");
        sb2.reverse();
        System.out.println(sb1.capacity());
        System.out.println(sb2.capacity());
        System.out.println(sb1+"\t"+sb2);
        sb1.ensureCapacity(20);
        System.out.println(sb1.capacity());
        sb2.setLength(5);
        System.out.println(sb2);
        sb2.trimToSize();
        System.out.println(sb2.capacity());
        sb1.insert(4," ");
        System.out.println(sb1);
        String s3=sb1.substring(0,5);
        System.out.println(sb1);
        System.out.println(s3);
        StringBuilder sb3=new StringBuilder(2000);
        System.out.println(sb3.capacity());
        for (int i = 0; i <2000 ; i++) {
            sb3.append(i);
        }
        System.out.println(sb3);
        sb3.append(2000);
        System.out.println(sb3);
        sb3.append(2001);
        System.out.println(sb3.capacity());

    }
}
