package cn.edu.zjut.bean;

import java.util.ArrayList;

public class SeeRosGroup {
    private ArrayList<String> name;
    private int time;

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public SeeRosGroup(){
        name = new ArrayList<>();
    }
    public ArrayList<String> getName() {
        return name;
    }

    public void setName(ArrayList<String> name) {
        this.name = name;
    }
}
