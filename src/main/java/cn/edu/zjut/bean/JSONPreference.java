package cn.edu.zjut.bean;

import java.util.ArrayList;

public class JSONPreference {
    private ArrayList<String>select;
    public JSONPreference(){
        select = new ArrayList<>();
    }

    public ArrayList<String> getSelect() {
        return select;
    }

    public void setSelect(ArrayList<String> select) {
        this.select = select;
    }

}
