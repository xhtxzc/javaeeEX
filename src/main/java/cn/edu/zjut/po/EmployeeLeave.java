package cn.edu.zjut.po;

public class EmployeeLeave {
    private String id,approval_name,information;
    private int pass,type,time;

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getApproval_name() {
        return approval_name;
    }

    public void setApproval_name(String approval_name) {
        this.approval_name = approval_name;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }
}
