package cn.edu.zjut.bean;

import cn.edu.zjut.dao.EmployeeDao;
import cn.edu.zjut.pojo.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class WorkTable {
    private Vector<ArrayList<ArrayList<Staff>>> table = new Vector<ArrayList<ArrayList<Staff>>>();

    //初始化一张没有经过排班算法的表
    public WorkTable(){
        StaffTable staffTable = new StaffTable();
        List<Staff> staffList = staffTable.getStaffTable();
        ArrayList<ArrayList<Staff>> tempList = new ArrayList<ArrayList<Staff>>();

        for(int i = 0 ; i < 42 ; i++){
            tempList.add(new ArrayList<Staff>());
            table.add(new ArrayList<ArrayList<Staff>>());
        }


        for(Staff staff:staffList){
            if(staff.getWorkTimePr() != null && staff.getWorkDayPr() != null){
                ArrayList<Integer> time = staff.getWorkTimePr();
                ArrayList<Integer> day = staff.getWorkDayPr();

                for(int i =0 ; i < time.size() ; i++ )
                {
                    tempList.get(day.get(i)*6+time.get(i)-1).add(staff);
                }
            }
        }

        for(int i=0 ; i<table.size();i++)
        {
            if(tempList.get(i).size() != 0)
                table.get(i).add(tempList.get(i));
        }
    }

    //获取 周index1 的第index2个班次的员工组组
    public ArrayList<ArrayList<Staff>> getStaffList(int index1 , int index2){
        int index = index1*6 + index2 -1;//转换为Vector中的下标,6为一天的班次总数
        return table.get(index);
    }

    //添加一个List<Staff> 到周index1 的第index2个班次中
    public void addStaffList(ArrayList<Staff> staffList,int index1 , int index2){
        table.get(index1*6+index2-1).add(staffList);
    }

}
