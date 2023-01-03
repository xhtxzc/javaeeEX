package cn.edu.zjut.service;

import cn.edu.zjut.bean.AccAndRef;
import cn.edu.zjut.dao.ManagerDao;
import cn.edu.zjut.dao.StraffDao;
import cn.edu.zjut.pojo.NotAccept;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Service("managerService")
public class ManagerService implements IManagerService {
    @Override
    public boolean refuse(AccAndRef number) {
        try{
            SqlSession session;
            InputStream config= Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory ssf= new SqlSessionFactoryBuilder().build(config);
            session = ssf.openSession();
            ManagerDao dao = session.getMapper(ManagerDao.class);
            dao.refuse(number);
            session.commit();
            session.close();
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean accept(AccAndRef number) {
        try{
            SqlSession session;
            InputStream config= Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory ssf= new SqlSessionFactoryBuilder().build(config);
            session = ssf.openSession();
            ManagerDao dao = session.getMapper(ManagerDao.class);
            dao.accept(number);
            dao.delete(number);
            session.commit();
            session.close();
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public ArrayList<NotAccept> getNotAccept(String id) {
        try{
            SqlSession session;
            InputStream config= Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory ssf= new SqlSessionFactoryBuilder().build(config);
            session = ssf.openSession();
            ManagerDao dao = session.getMapper(ManagerDao.class);
            ArrayList<NotAccept> list = dao.getNotAccept(id);
            session.commit();
            session.close();
            return list;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
