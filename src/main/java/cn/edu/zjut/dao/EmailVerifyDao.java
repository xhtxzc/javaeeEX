package cn.edu.zjut.dao;
import cn.edu.zjut.po.EmailVerify;
import org.apache.ibatis.annotations.Mapper;

public interface EmailVerifyDao {
    boolean selectVerificationByEmail(EmailVerify verify);
    boolean insertVerificationByEmail(EmailVerify verify);
}
