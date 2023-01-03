package cn.edu.zjut.dao;

import cn.edu.zjut.bean.AccAndRef;
import cn.edu.zjut.pojo.NotAccept;

import java.util.ArrayList;

public interface ManagerDao {
    ArrayList<NotAccept> getNotAccept(String id);
    boolean accept(AccAndRef number);
    boolean delete(AccAndRef number);
    boolean refuse(AccAndRef number);

}
