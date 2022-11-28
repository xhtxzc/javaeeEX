package cn.edu.zjut.service;
import cn.edu.zjut.dao.EmailVerifyDao;
import cn.edu.zjut.pojo.Test;
import cn.edu.zjut.util.MailUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;
import cn.edu.zjut.po.EmailVerify;

import java.io.InputStream;

@Service("emailVerifyService")
public class EmailVerifyService implements IEmailVerifyService{
    SqlSession session;
    EmailVerifyService(){
        try {
            InputStream config= Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory ssf= new SqlSessionFactoryBuilder().build(config);
            session = ssf.openSession();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public boolean sentEmail(EmailVerify verify) {
        MailUtil.sendMail(verify.getEmail(), "验证码","验证码为："+verify.getTime()%1000000);
        EmailVerifyDao dao = session.getMapper(EmailVerifyDao.class);
        boolean num = dao.insertVerificationByEmail(verify);
        session.commit();
        session.close();
        return num;
    }

    @Override
    public boolean verifyEmail(EmailVerify verify) {
        boolean bool = false;
        EmailVerifyDao dao = session.getMapper(EmailVerifyDao.class);
        bool = dao.selectVerificationByEmail(verify);
        session.commit();
        session.close();
        return bool;
    }
}
