package cn.edu.zjut.bean;

import java.util.ArrayList;

public class Staff {
    private String staffId;//员工ID
    private int workedTime;//已工作时间
    private int[] workedTimeDay = new int[7];//当天工作时间
    private ArrayList<Integer> workDayPr;//工作日偏好
    private ArrayList<Integer> workTimePr;//工作时间偏好
    private ArrayList<Integer> Duration;//班次时长

    public int[] getWorkedTimeDay() {
        return workedTimeDay;
    }

    public void setWorkedTimeDay(int[] workedTimeDay) {
        this.workedTimeDay = workedTimeDay;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public int getWorkedTime() {
        return workedTime;
    }

    public void setWorkedTime(int workedTime) {
        this.workedTime = workedTime;
    }

    public ArrayList<Integer> getDuration() {
        return Duration;
    }

    public ArrayList<Integer> getWorkDayPr() {
        return workDayPr;
    }

    public ArrayList<Integer> getWorkTimePr() {
        return workTimePr;
    }

    public void setDuration(ArrayList<Integer> duration) {
        Duration = duration;
    }

    public void setWorkDayPr(ArrayList<Integer> workDayPr) {
        this.workDayPr = workDayPr;
    }

    public void setWorkTimePr(ArrayList<Integer> workTimePr) {
        this.workTimePr = workTimePr;
    }


}
