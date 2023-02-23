package com.deloitte.employee.dao;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
 
import com.deloitte.employee.model.Employee;
import com.deloitte.employee.model.EmploymentHistory;
 
@Repository
public class EmployeeDaoImpl implements EmployeeDao{
 
    @Autowired
    JdbcTemplate jdbcTemplate;
    
    @Override
    public List<Employee> search(Long empId) {
 
        return jdbcTemplate.query("select * from employees where emp_id=?", 
                new BeanPropertyRowMapper<Employee>(Employee.class),empId);
    }
 
    @Override
    public List<Employee> search(String name) {
        System.out.println(name);
        String sql="select * from employees where first_name like '%"+name+"%'";
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<Employee>(Employee.class));
    }
    
    @Override
    public List<EmploymentHistory> findHistory(Long empId) {
        return jdbcTemplate.query("select * from employment_history where emp_id=?",new BeanPropertyRowMapper<EmploymentHistory>(EmploymentHistory.class),empId );
        }
 
}

