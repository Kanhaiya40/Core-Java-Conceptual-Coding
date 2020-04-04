import java.io.Serializable;

public class EmployeeAL implements Serializable {
    private int eid;
    private String ename;
    DepartmentAL Department;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public DepartmentAL getDepartment() {
        return Department;
    }

    public void setDepartment(DepartmentAL department) {
        Department = department;
    }
}
