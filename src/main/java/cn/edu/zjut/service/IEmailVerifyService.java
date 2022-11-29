package cn.edu.zjut.service;
import cn.edu.zjut.po.EmailVerify;

public interface IEmailVerifyService {
    String verifyEmail(EmailVerify verify);
    boolean sendEmail(EmailVerify verify);
}
