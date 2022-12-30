package cn.edu.zjut.dao;
import cn.edu.zjut.pojo.Preference;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.List;

public interface PreferenceDao {
    //一个员工有多个偏好
    public ArrayList<Preference> selectPreferenceById(String id);
}
