package cn.edu.zjut.dao;
import cn.edu.zjut.po.EmailVerify;
import cn.edu.zjut.pojo.EmailVerifyAndTimeOut;
import org.apache.ibatis.annotations.Mapper;

public interface EmailVerifyDao {
    EmailVerifyAndTimeOut selectVerificationByEmail(EmailVerify verify);
    boolean insertVerificationByEmail(EmailVerify verify);
}
