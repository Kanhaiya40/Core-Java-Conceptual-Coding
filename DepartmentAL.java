import java.io.Serializable;

public class DepartmentAL implements Serializable {
    private  int did;
    private String dname;
    private String degination;

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDegination() {
        return degination;
    }

    public void setDegination(String degination) {
        this.degination = degination;
    }
}
