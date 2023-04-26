package project.spring4.mvc.employee.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import project.spring4.mvc.employee.model.Employee;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository("empdao")
public class EmployeeDAOimpl implements EmployeeDAO{
    private JdbcTemplate jdbcTemplate;

    // @Value("#{jdbc['insertSQL']}") private String insertSQL;
    @Value("#{jdbc['selectSQL']}") private String selectSQL;
    // @Value("#{jdbc['selectOneSQL']}") private String selectOneSQL;
    // @Value("#{jdbc['updateSQL']}") private String updateSQL;
    // @Value("#{jdbc['deleteSQL']}") private String deleteSQL;

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
        RowMapper<Employee> mapper = new EmployeeMapper();
        return jdbcTemplate.query(selectSQL, mapper);
    }

    private class EmployeeMapper implements RowMapper<Employee> {
        @Override
        public Employee mapRow(ResultSet rs, int num) throws SQLException {
            Employee emp = new Employee(
                    rs.getInt(1), rs.getString(2),
                    rs.getString(3),rs.getString(4),
                    rs.getInt(5)
            );
            return emp;
        }
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
