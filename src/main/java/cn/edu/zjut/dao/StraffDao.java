package cn.edu.zjut.dao;

import cn.edu.zjut.bean.MyRos;
import cn.edu.zjut.po.AlterDayInDB;
import cn.edu.zjut.po.EmployeeLeave;
import cn.edu.zjut.po.GetGroupInDB;

import java.util.ArrayList;

public interface StraffDao {
    int AlterPreferenceDay(AlterDayInDB dayInDB);
    ArrayList<String > getGroup(GetGroupInDB time);
    ArrayList<EmployeeLeave> getLefts(String id);
    ArrayList<MyRos> getMyRos(String id);
}
