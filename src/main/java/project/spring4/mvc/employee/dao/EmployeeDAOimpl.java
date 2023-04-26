package project.spring4.mvc.employee.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import project.spring4.mvc.employee.model.Employee;

import java.util.List;

@Repository("empdao")
public class EmployeeDAOimpl implements EmployeeDAO{
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public EmployeeDAOimpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insertEmployee(Employee emp) {
        int cnt = -1;
        return cnt;
    }

    @Override
    public List<Employee> selectEmployee() {
        return null;
    }

    @Override
    public Employee selectOneEmployee(int empid) {
        return null;
    }

    @Override
    public int updateEmployee(Employee emp) {
        int cnt = -1;
        return cnt;
    }

    @Override
    public int deleteEmployee(int empid) {
        int cnt = -1;
        return cnt;
    }
}
