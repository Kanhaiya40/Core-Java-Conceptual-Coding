import java.util.Comparator;
import java.util.TreeMap;

public class CustomizeSortingByBothComparableAndComparatorInterface {
    public static void main(String[] args) {
        TreeMap t1=new TreeMap();
        Bank b1=new Bank("BOB",2685);
        Bank b2=new Bank("SBI",4527);
        Bank b3=new Bank("BOI",4578);
        Bank b4=new Bank("HDFC",6898);
        Bank b5=new Bank("Union",2458);
        Bank b6=new Bank("Yes",1546);
        Bank b7=new Bank("Dena",7548);
        Bank b8=new Bank("Corparate",3265);
        Bank b9=new Bank("ICICI",6458);
        Bank b10=new Bank("UK",1945);
        Bank b11=new Bank("Central",5625);
        t1.put(b1,1);
        t1.put(b2,1);
        t1.put(b3,1);
        t1.put(b4,1);
        t1.put(b5,1);
        t1.put(b6,1);
        t1.put(b7,1);
        t1.put(b8,1);
        t1.put(b9,1);
        t1.put(b10,1);
        t1.put(b11,1);
        System.out.println(t1);
        TreeMap t2=new TreeMap(new Bank("COmparator Interface",1));
        t2.put(b1,1);
        t2.put(b2,1);
        t2.put(b3,1);
        t2.put(b4,1);
        t2.put(b5,1);
        t2.put(b6,1);
        t2.put(b7,1);
        t2.put(b8,1);
        t2.put(b9,1);
        t2.put(b10,1);
        t2.put(b11,1);
        System.out.println(t2);
        Thief s1=new Thief("Kamal");
        Thief s2=new Thief("Nagarjun");
        Thief s3=new Thief("NTR");
        Thief s4=new Thief("Pawan");
        Thief s5=new Thief("Chiranjivi");
        Thief s6=new Thief("Aalu Arjun");
        Thief s7=new Thief("Jhony");
        Thief s8=new Thief("Rajni ");
        Thief s9=new Thief("Prabhash");
        Thief s10=new Thief("Yash");
        TreeMap t3=new TreeMap(new Thief("Comparator Interface"));
        t3.put(s1,1);
        t3.put(s2,1);
        t3.put(s3,1);
        t3.put(s4,1);
        t3.put(s5,1);
        t3.put(s6,1);
        t3.put(s7,1);
        t3.put(s8,1);
        t3.put(s9,1);
        t3.put(s10,1);
        System.out.println(t3);














    }
}
class Bank implements Comparable, Comparator
{
    private String bankName;
    private int bankCode;
    public Bank(String bankName,int bankCode)
    {
        this.bankName=bankName;
        this.bankCode=bankCode;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankName='" + bankName + '\'' +
                ", bankCode=" + bankCode +
                '}';
    }

    public int compareTo(Object o)
    {
        Bank b1=(Bank)o;
        String s1=b1.bankName;
        String s2=this.bankName;
        return s2.compareTo(s1);
    }
    public int compare(Object o,Object t1)
    {
        Bank b1=(Bank)o;
        Bank b2=(Bank)t1;
        int i1=b1.bankCode;
        int i2=b2.bankCode;
        if(i1>i2)
        {
            return +1;

        }
        else if(i1<i2)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}
class Thief implements Comparator
{
    private String thiefName;
    public Thief(String thiefName)
    {
        this.thiefName=thiefName;
    }

    @Override
    public String toString() {
        return "Thief{" +
                "thiefName='" + thiefName + '\'' +
                '}';
    }

    public int compare(Object o, Object t1)
    {
        Thief t2=(Thief)o;
        Thief t3=(Thief)t1;
        String s1=t2.thiefName;
        String s2=t3.thiefName;
        int l1=s1.length();
        int l2=s2.length();
        if (l2>l1)
        {
            return +1;
        }
        else if (l2<l1)
        {
            return -1;
        }
        else
        {
            return s1.compareTo(s2);
        }
    }
}
