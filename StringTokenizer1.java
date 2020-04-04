import java.util.StringTokenizer;

public class StringTokenizer1 {
    public static void main(String[] args) {
        StringTokenizer st=new StringTokenizer("This-is-Kanhaiya's-House","-");
        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }



    }
}
