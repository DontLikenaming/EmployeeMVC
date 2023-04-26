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

    public Employee(int empid, String fname, String lname,
                    String email, String phone, String hdate,
                    String jobid, int sal, double comm,
                    int mgrid, int deptid) {
        this.empid = empid;
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

    public Employee(String jobid, int mgrid, int deptid) {
        this.jobid = jobid;
        this.mgrid = mgrid;
        this.deptid = deptid;
    }

    @Override
    public String toString() {
        String fmt = "%d %s %s %s %s %s %s %d %.2f %d %d";
        return String.format(fmt, empid, fname, lname, email, phone,
                              hdate, jobid, sal, comm, mgrid, deptid);
    }
}
