package cn.edu.zjut.service;
import cn.edu.zjut.po.EmailVerify;

public interface IEmailVerifyService {
    boolean verifyEmail(EmailVerify verify);
    boolean sentEmail(EmailVerify verify);
}
