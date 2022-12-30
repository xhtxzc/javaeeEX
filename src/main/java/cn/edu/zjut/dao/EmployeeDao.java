package cn.edu.zjut.dao;

import cn.edu.zjut.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface EmployeeDao {
    public List<Employee> SelectAllEmployee();
    public Employee SelectEmployeeById(String id);
    public Integer DeleteEmployeeById(String id);
}
