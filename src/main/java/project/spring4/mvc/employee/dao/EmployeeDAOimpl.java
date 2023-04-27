package project.spring4.mvc.employee.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.EmptyResultDataAccessException;
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
    private static final Logger logger = LogManager.getLogger(EmployeeDAOimpl.class);

    @Value("#{jdbc['insertSQL']}") private String insertSQL;
    @Value("#{jdbc['selectSQL']}") private String selectSQL;
    @Value("#{jdbc['selectOneSQL']}") private String selectOneSQL;
    // @Value("#{jdbc['updateSQL']}") private String updateSQL;
    @Value("#{jdbc['deleteSQL']}") private String deleteSQL;

    @Autowired
    public EmployeeDAOimpl(JdbcTemplate jdbcTemplate) {

        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insertEmployee(Employee emp) {
        int cnt = -1;

        try {
            Object[] params = new Object[]{
                    emp.getEmpid(), emp.getFname(),
                    emp.getLname(), emp.getEmail(),
                    emp.getPhone(), emp.getHdate(),
                    emp.getJobid(), emp.getSal(),
                    emp.getComm(), emp.getMgrid(),
                    emp.getDeptid()
            };

            cnt = jdbcTemplate.update(insertSQL, params);
        } catch (Exception ex){
            logger.error("insertSungJuk 오류!");
            logger.info(ex.getMessage());
        }
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
        Object[] param = new Object[]{ empid };
        RowMapper<Employee> mapper = new EmployeeOneMapper();

        Employee emp = jdbcTemplate.queryForObject(
                selectOneSQL, mapper, param
        );

        return emp;
    }

    private class EmployeeOneMapper implements RowMapper<Employee> {
        @Override
        public Employee mapRow(ResultSet rs, int num) throws SQLException {
            Employee emp = null;

            try {
            emp = new Employee(
                    rs.getString(2),rs.getString(3),
                    rs.getString(4), rs.getString(5),
                    rs.getString(6), rs.getString(7),
                    rs.getInt(8), rs.getDouble(9),
                    rs.getInt(10), rs.getInt(11));
            emp.setEmpid(rs.getInt(1));
            } catch (Exception ex){
                logger.error("EmployeeOneMapper 오류!");
                logger.info(ex.getMessage());
            }
            return emp;
        }
    }

    @Override
    public int updateEmployee(Employee emp) {
        int cnt = -1;
        return cnt;
    }

    @Override
    public int deleteEmployee(int empid) {
        Object[] param = new Object[] { empid };

        return jdbcTemplate.update(deleteSQL, param);
    }
}
