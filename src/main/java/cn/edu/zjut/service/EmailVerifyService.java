package cn.edu.zjut.service;
import cn.edu.zjut.dao.EmailVerifyDao;
import cn.edu.zjut.pojo.EmailVerifyAndTimeOut;
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

    @Override
    public boolean sendEmail(EmailVerify verify) {
        try {
            SqlSession session;
            InputStream config= Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory ssf= new SqlSessionFactoryBuilder().build(config);
            session = ssf.openSession();
            MailUtil.sendMail(verify.getEmail(), "验证码","验证码为："+verify.getTime()%1000000);
            EmailVerifyDao dao = session.getMapper(EmailVerifyDao.class);
            boolean num = dao.insertVerificationByEmail(verify);
            session.commit();
            session.close();
            return num;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;

    }

    @Override
    public boolean verifyEmail(EmailVerify verify) {
        try {
            System.out.println("verifyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy");
            SqlSession session;
            InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(config);
            session = ssf.openSession();
            EmailVerifyDao dao = session.getMapper(EmailVerifyDao.class);
            EmailVerifyAndTimeOut ver = dao.selectVerificationByEmail(verify);
            session.commit();
            session.close();
            if (!ver.isVerificationState() && System.currentTimeMillis() - ver.getTime() < 300000) {
                return true;
            }
            return false;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
