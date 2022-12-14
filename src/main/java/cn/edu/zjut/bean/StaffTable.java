package cn.edu.zjut.bean;

import cn.edu.zjut.dao.EmployeeDao;
import cn.edu.zjut.pojo.Employee;
import cn.edu.zjut.pojo.Preference;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class StaffTable {
    private List<Staff> StaffTable = new ArrayList<Staff>();

    public StaffTable(){
        try{
            SqlSession session;
            InputStream config= Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory ssf= new SqlSessionFactoryBuilder().build(config);
            session = ssf.openSession();

            EmployeeDao employeeDao = session.getMapper(EmployeeDao.class);
            List<Employee> employeeList = employeeDao.SelectAllEmployee();

            for(Employee employee:employeeList){
                if(employee.getPosition().equals("staff")) {
                    List<Preference> preferenceList = employee.getPreferenceList();
                    Staff staff = new Staff();
                    staff.setStaffId(employee.getId());
                    System.out.println(employee.getId());
                    staff.setWorkedTime(0);
                    staff.setWorkedTimeDay(new int[7]);

                    for (Preference preference : preferenceList) {
                        JSONObject jsonObject = JSON.parseObject(preference.getValue());
                        JSONArray jsonArray = jsonObject.getJSONArray("select");

                        ArrayList<Integer> tempList = new ArrayList<Integer>();

                        for (int i = 0; i < jsonArray.size(); i++) {
                            tempList.add(jsonArray.getInteger(i));
                        }

                        if (preference.getType().equals("day")) {
                            staff.setWorkDayPr(tempList);
                        } else if (preference.getType().equals("time")) {
                            staff.setWorkTimePr(tempList);
                        } else {
                            staff.setDuration(tempList);
                        }

                    }
                    addStaff(staff);
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    //根据员工id查找员工
    public Staff getStaffById(String id){
        for(Staff staff:StaffTable){
            if(staff.getStaffId().equals(id)){
                return staff;
            }
        }
        return null;
    }

    //更新员工的当天工作时间和总工作时间
    public boolean updateStaff(Staff staff){
        for(Staff staff1:StaffTable){
            if(staff1.getStaffId().equals(staff.getStaffId())){
                staff1.setWorkedTimeDay(staff.getWorkedTimeDay());
                staff1.setWorkedTime(staff.getWorkedTime());
                return true;
            }
        }
        return false;
    }

    public List<Staff> getStaffTable() {
        return StaffTable;
    }

    public void setStaffTable(List<Staff> staffTable) {
        StaffTable = staffTable;
    }

    public void addStaff(Staff staff){
        StaffTable.add(staff);
    }
}
