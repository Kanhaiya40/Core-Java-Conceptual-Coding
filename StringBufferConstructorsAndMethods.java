public class StringBufferConstructorsAndMethods {
    public static void main(String[] args) {
        StringBuffer sb1=new StringBuffer();
        System.out.println(sb1.capacity());
        System.out.println(sb1.capacity());
        StringBuffer sb2=new StringBuffer(20);
        sb2.append("ksjhshgsjgsgsjgsjkhwjwkjwjwkkwhhwhw");
        System.out.println(sb2.capacity());
        StringBuffer sb3=new StringBuffer("Kanhaiya");
        System.out.println(sb3.capacity());

        //Methods

        System.out.println(sb1.length());
        System.out.println(sb2.length());
        System.out.println(sb3.length());

        System.out.println(sb2.charAt(10));
        sb3.setCharAt(1,'A');
        System.out.println(sb3);

        sb3.insert(5,"Aahuti");
        System.out.println(sb3);

        sb3.delete(5,9);
        System.out.println(sb3);

        System.out.println(sb3.reverse());

       sb3.setLength(8);
        System.out.println(sb3);


        sb3.replace(1,8,"Kanhaiya");
        System.out.println(sb3);
        System.out.println(sb3.capacity());

        sb3.ensureCapacity(30);

        System.out.println(sb3.capacity());

        sb3.trimToSize();

        System.out.println(sb3.capacity());

        sb3.ensureCapacity(10);
        System.out.println(sb3.capacity());

        sb3.delete(0,9);
        System.out.println(sb3);
        sb3.append("Kanhaiya").reverse().append(" ").reverse().append("Kumar").reverse();//Method Chaining
        System.out.println(sb3);




















    }
}
