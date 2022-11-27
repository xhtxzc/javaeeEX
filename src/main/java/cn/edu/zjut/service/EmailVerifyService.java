package cn.edu.zjut.service;
import cn.edu.zjut.dao.EmailVerifyDao;
import cn.edu.zjut.pojo.Test;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;
import cn.edu.zjut.po.EmailVerify;

import java.io.InputStream;

@Service("emailVerifyService")
public class EmailVerifyService implements IEmailVerifyService{
    @Override
    public boolean verifyEmail(EmailVerify verify) {
        boolean bool = false;
        try {
            InputStream config= Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory ssf= new SqlSessionFactoryBuilder().build(config);
            SqlSession ss=ssf.openSession();
            EmailVerifyDao dao = ss.getMapper(EmailVerifyDao.class);
            bool = dao.selectVerificationByEmail(verify);
            ss.commit();
            ss.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return bool;
    }
}
