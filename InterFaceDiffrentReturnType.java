interface Return1
{
    public Object sum();

}
interface Return2
{
    public String sum();

}

class ReturnType implements  Return1,Return2
{
    @Override
    public String sum() {          /* Here we not able to implement both Interfaces Simutaneously bacause of Diffrent Return type */
        System.out.println("Kanhaiya");

        return "Kanhiaya";


    }
}


public class InterFaceDiffrentReturnType {

    public static void main(String[] args) {
        ReturnType r1=new ReturnType();
        r1.sum();

    }
}
