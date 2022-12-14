package cn.edu.zjut.pojo;

import java.util.List;

public class Employee {
    private String id;
    private String name;
    private String email;
    private String storeId;
    private String password;
    private String position;

    private List<Preference> preferenceList;

    public List<Preference> getPreferenceList() {
        return preferenceList;
    }

    public void setPreferenceList(List<Preference> preferenceList) {
        this.preferenceList = preferenceList;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getId() {
        return id;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }


}
