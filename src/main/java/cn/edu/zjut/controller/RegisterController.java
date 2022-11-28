package cn.edu.zjut.controller;
import cn.edu.zjut.po.EmailVerify;
import cn.edu.zjut.service.IEmailVerifyService;
import cn.edu.zjut.util.MailUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.beans.factory.annotation.Autowired;

@Controller
@RequestMapping("/register")
public class RegisterController {
    private IEmailVerifyService emailVerifyService;
    private static final Log logger = LogFactory.getLog(RegisterController.class);
    @Autowired
    @Qualifier("emailVerifyService")
    public void setEmailVerifyService(IEmailVerifyService service){
        this.emailVerifyService = service;
    }
    @RequestMapping("/verify/{email}/{code}")
    public String verifyEmail(@PathVariable String email, @PathVariable String code, Model model){
        EmailVerify verify = new EmailVerify();
        verify.setEmail(email);
        verify.setVerificationCode(code);
        if (emailVerifyService.verifyEmail(verify)){
            model.addAttribute("1","cc");
            System.out.println("cg");
        }else {
            model.addAttribute("1","bb");
            System.out.println("sb");
        }
        return "log";
    }
    @RequestMapping("/sent/{email}")
    public String sentEmail(@PathVariable String email, Model model){
        EmailVerify verify = new EmailVerify();
        verify.setEmail(email);
        verify.setTime(System.currentTimeMillis());
        verify.setVerificationCode(String.valueOf(verify.getTime()%1000000));
        if (emailVerifyService.sentEmail(verify)){
            return "register/verifyEmail";
        }
        else{
            return "register/error";
        }
    }
}
