package cn.edu.zjut.bean;

import java.util.ArrayList;

public class SeeRos {
    private ArrayList<ArrayList<String>> names;

    public SeeRos() {
        names = new ArrayList<>();
    }

    public ArrayList<ArrayList<String>> getNames() {
        return names;
    }

    public void setNames(ArrayList<ArrayList<String>> names) {
        this.names = names;
    }
}
