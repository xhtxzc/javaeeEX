package cn.edu.zjut.bean;

import cn.edu.zjut.pojo.Preference;

import java.util.ArrayList;

public class Preferences {
    private String id;
    private ArrayList<Preference> preferences;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Preference> getPreferences() {
        return preferences;
    }

    public void setPreferences(ArrayList<Preference> preferences) {
        this.preferences = preferences;
    }
}
