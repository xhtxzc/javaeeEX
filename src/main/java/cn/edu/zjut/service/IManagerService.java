package cn.edu.zjut.service;

import cn.edu.zjut.bean.AccAndRef;
import cn.edu.zjut.pojo.NotAccept;

import java.util.ArrayList;

public interface IManagerService {
    ArrayList<NotAccept> getNotAccept(String id);
    boolean accept(AccAndRef number);
    boolean refuse(AccAndRef number);
}
