package cn.edu.zjut.service;

import cn.edu.zjut.bean.MyRos;
import cn.edu.zjut.bean.Preferences;
import cn.edu.zjut.bean.SeeRosGroup;
import cn.edu.zjut.bean.SubLeave;
import cn.edu.zjut.po.AlterDayInDB;
import cn.edu.zjut.po.EmployeeLeave;
import cn.edu.zjut.pojo.Employee;

import java.util.ArrayList;
import java.util.List;

public interface IEmployeeService {
    public Employee GetPersonaldata(String id);
    public List<Employee> GetAllEmployee();

    public boolean DeleteEmployeeById(String id);

    Preferences getPreById(String id);

    boolean AlterDay(AlterDayInDB dayInDB);
    SeeRosGroup getOneTimeWorkers(int time);
    ArrayList<EmployeeLeave> getLefts(String id);
    ArrayList<MyRos> getMyRos(String id);
    boolean askLeave(SubLeave leave);
}
