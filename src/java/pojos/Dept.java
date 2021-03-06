package pojos;

public class Dept implements java.io.Serializable {

    private int deptNo;
    private String dnombre;
    private String loc;

    public Dept() {
    }

    public Dept(int deptNo) {
        this.deptNo = deptNo;
    }

    public Dept(int deptNo, String dnombre, String loc) {
        this.deptNo = deptNo;
        this.dnombre = dnombre;
        this.loc = loc;
    }

    public int getDeptNo() {
        return this.deptNo;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    public String getDnombre() {
        return this.dnombre;
    }

    public void setDnombre(String dnombre) {
        this.dnombre = dnombre;
    }

    public String getLoc() {
        return this.loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

}
