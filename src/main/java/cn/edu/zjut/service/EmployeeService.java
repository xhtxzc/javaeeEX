package cn.edu.zjut.service;

import cn.edu.zjut.bean.MyRos;
import cn.edu.zjut.bean.Preferences;
import cn.edu.zjut.bean.SeeRosGroup;
import cn.edu.zjut.dao.EmployeeDao;
import cn.edu.zjut.dao.PreferenceDao;
import cn.edu.zjut.dao.StraffDao;
import cn.edu.zjut.po.AlterDayInDB;
import cn.edu.zjut.po.EmployeeLeave;
import cn.edu.zjut.po.GetGroupInDB;
import cn.edu.zjut.pojo.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Service("employeeService")
public class EmployeeService implements IEmployeeService{
    @Override
    public ArrayList<MyRos> getMyRos(String id) {
        try{
            SqlSession session;
            InputStream config= Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory ssf= new SqlSessionFactoryBuilder().build(config);
            session = ssf.openSession();
            StraffDao dao = session.getMapper(StraffDao.class);
            ArrayList<MyRos> list = dao.getMyRos(id);
            session.commit();
            session.close();
            return list;

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ArrayList<EmployeeLeave> getLefts(String id) {
        try{
            SqlSession session;
            InputStream config= Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory ssf= new SqlSessionFactoryBuilder().build(config);
            session = ssf.openSession();
            StraffDao dao = session.getMapper(StraffDao.class);
            ArrayList<EmployeeLeave> list = dao.getLefts(id);
            session.commit();
            session.close();
            return list;

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public SeeRosGroup getOneTimeWorkers(int time) {
        try{
            SqlSession session;
            InputStream config= Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory ssf= new SqlSessionFactoryBuilder().build(config);
            session = ssf.openSession();
            SeeRosGroup seeRosGroup = new SeeRosGroup();
            StraffDao dao = session.getMapper(StraffDao.class);
            GetGroupInDB group = new GetGroupInDB();
            group.setTime(time);
            group.setDatabaseName("ros202201");
            group.setDatabaseName1("time");
            seeRosGroup.setName(dao.getGroup(group));
            session.commit();
            session.close();
            return seeRosGroup;

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean AlterDay(AlterDayInDB dayInDB) {
        try{
            SqlSession session;
            InputStream config= Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory ssf= new SqlSessionFactoryBuilder().build(config);
            session = ssf.openSession();

            StraffDao dao = session.getMapper(StraffDao.class);
            dao.AlterPreferenceDay(dayInDB);
            session.commit();
            session.close();
            return true;

        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Preferences getPreById(String id) {
        try{
            SqlSession session;
            InputStream config= Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory ssf= new SqlSessionFactoryBuilder().build(config);
            session = ssf.openSession();

            PreferenceDao dao = session.getMapper(PreferenceDao.class);
            Preferences p = new Preferences();
            p.setPreferences(dao.selectPreferenceById(id));
            p.setId(id);
            session.commit();
            session.close();

            return p;

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    //获取个人资料
    @Override
    public Employee GetPersonaldata(String id){
        try{
            SqlSession session;
            InputStream config= Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory ssf= new SqlSessionFactoryBuilder().build(config);
            session = ssf.openSession();

            EmployeeDao employeeDao = session.getMapper(EmployeeDao.class);
            Employee employee = employeeDao.SelectEmployeeById(id);
            session.commit();
            session.close();
            return employee;

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    //获取全部人员的资料
    @Override
    public List<Employee> GetAllEmployee(){
        try{
            SqlSession session;
            InputStream config= Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory ssf= new SqlSessionFactoryBuilder().build(config);
            session = ssf.openSession();

            EmployeeDao employeeDao = session.getMapper(EmployeeDao.class);
            List<Employee> employeeArrayList = employeeDao.SelectAllEmployee();
            session.commit();
            session.close();
            return employeeArrayList;

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean DeleteEmployeeById(String id){
        try{
            SqlSession session;
            InputStream config= Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory ssf= new SqlSessionFactoryBuilder().build(config);
            session = ssf.openSession();

            EmployeeDao employeeDao = session.getMapper(EmployeeDao.class);
            Integer lineNumber = employeeDao.DeleteEmployeeById(id);
            session.commit();
            session.close();
            return lineNumber > 0;

        }catch (Exception e){
            e.printStackTrace();
        }

        return false;
    }
}
