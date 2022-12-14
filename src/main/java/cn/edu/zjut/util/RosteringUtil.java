package cn.edu.zjut.util;

import cn.edu.zjut.bean.FinalTable;
import cn.edu.zjut.bean.Staff;
import cn.edu.zjut.bean.StaffTable;
import cn.edu.zjut.bean.WorkTable;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class RosteringUtil {

    static Vector<Queue<List<Staff>>> vector = new Vector<>();
    static short[] each = new short[42];
    static Iterator<ArrayList<Staff>>[] iterators = new Iterator[42];
    static List<List<Staff>> table;
    static StaffTable staffTable;
    static short pos = 0;
    public static FinalTable start(WorkTable workTable ){
        build(workTable);
        short score = 0;
        ArrayList<Staff>[] s = new ArrayList[42];
        while(true){
            if (!iterators[pos].hasNext()){
                pos--;
                Delete(s[pos]);
            }
            ArrayList<Staff> list =iterators[pos].next();
            s[pos] = list;
            if (Add(list)) {
                if (pos==41){
                    score = 32;
                    break;
                }
                pos++;
                iterators[pos] = workTable.getStaffList(pos/7,pos%7+1).listIterator();
            }

        }
        System.out.println(score);
        return null;
    }
    private static int calculateScore(){
        return 0;
    }
    private static boolean Add(List<Staff> list){
        List<Staff> staffs = new ArrayList<>();
        for (Staff staff0 : list){
            Staff staff = staffTable.getStaffById(staff0.getStaffId());
            for (Integer day : staff.getWorkDayPr()){
                if (day!=pos/7){
                    return false;
                }
            }
            for (Integer time : staff.getWorkTimePr()){
                if (time != pos%7+1){
                    return false;
                }
            }
            for (Integer duration : staff.getDuration()){
                if (duration == 1){
                    return false;
                }
            }
            if (staff.getWorkedTimeDay()[pos/7] >8 || staff.getWorkedTime()>40){
                continue;
            }
            staff.setWorkedTime(staff.getWorkedTime()+2);
            int [] ints = staff.getWorkedTimeDay();
            ints[pos/7] +=2;
            staff.setWorkedTimeDay(ints);
            staffs.add(staff);
        }
        for (Staff staff1:staffs){
            staffTable.updateStaff(staff1);
        }
        return true;
    }
    private static void Delete(List<Staff> list){
        for (Staff staff:list){
            Staff staff1 = staffTable.getStaffById(staff.getStaffId());
            staff1.setWorkedTime(staff1.getWorkedTime()-2);
            int [] ints = staff.getWorkedTimeDay();
            ints[pos/7] -=2;
            staff.setWorkedTimeDay(ints);
            staffTable.updateStaff(staff1);
        }
    }
    private static void build(WorkTable workTable){
        for (int i =0 ;i<42;i++){
            vector.add(new LinkedBlockingQueue<>());
            each[i] = 0;
            iterators[i] = workTable.getStaffList(i/7,i%7+1).listIterator();
        }
        table = new ArrayList<>();
        staffTable = new StaffTable();
    }
}
