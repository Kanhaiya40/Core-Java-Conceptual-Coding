import java.sql.DatabaseMetaData;
import java.sql.SQLTransientException;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesOfSystemThroughCollection {
    public static void main(String[] args) {
        Properties p1= System.getProperties();
        Set s1=p1.entrySet();
        Iterator i1=s1.iterator();
        while (i1.hasNext())
        {
            Map.Entry m1=(Map.Entry)i1.next();
            System.out.println(m1.getKey()+" "+m1.getValue());
        }
    }
}
