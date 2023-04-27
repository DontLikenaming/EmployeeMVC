package project.spring4.mvc.employee.model;

public class Employee {
    private int empid;
    private String fname;
    private String lname;
    private String email;
    private String phone;
    private String hdate;
    private String jobid;
    private int sal;
    private double comm;
    private int mgrid;
    private int deptid;

    public Employee() {}

    public Employee(String fname, String lname, String email,
                    String phone, String hdate, String jobid,
                    int sal, double comm, int mgrid, int deptid) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.phone = phone;
        this.hdate = hdate;
        this.jobid = jobid;
        this.sal = sal;
        this.comm = comm;
        this.mgrid = mgrid;
        this.deptid = deptid;
    }

    public Employee(int empid, String fname, String email, String jobid, int deptid) {
        this.empid = empid;
        this.fname = fname;
        this.email = email;
        this.jobid = jobid;
        this.deptid = deptid;
    }

    public Employee(int empid, String fname, String lname,
                    String email, String phone, String hdate,
                    String jobid, int sal, double comm,
                    int mgrid, int deptid) {
        this(empid, fname, email, jobid, deptid);
        this.lname = lname;
        this.phone = phone;
        this.hdate = hdate;
        this.sal = sal;
        this.comm = comm;
        this.mgrid = mgrid;
    }

    public Employee(int empid, String jobid, int mgrid, int deptid) {
        this.empid = empid;
        this.jobid = jobid;
        this.mgrid = mgrid;
        this.deptid = deptid;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHdate() {
        return hdate.substring(0,10);
    }

    public void setHdate(String hdate) { this.hdate = hdate; }

    public String getJobid() {
        return jobid;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public double getComm() {
        return comm;
    }

    public void setComm(double comm) {
        this.comm = comm;
    }

    public int getMgrid() {
        return mgrid;
    }

    public void setMgrid(int mgrid) {
        this.mgrid = mgrid;
    }

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }

    @Override
    public String toString() {
        String fmt = "%d %s %s %s %s %s %s %d %.2f %d %d";
        return String.format(fmt, empid, fname, lname, email, phone,
                              hdate, jobid, sal, comm, mgrid, deptid);
    }
}
