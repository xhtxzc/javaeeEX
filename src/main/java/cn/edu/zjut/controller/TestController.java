package cn.edu.zjut.controller;
import cn.edu.zjut.bean.RegisterUser;
import cn.edu.zjut.bean.RegisterVerify;
import cn.edu.zjut.bean.WorkTable;
import cn.edu.zjut.po.EmailVerify;
import cn.edu.zjut.service.IEmailVerifyService;
import cn.edu.zjut.util.MailUtil;
import cn.edu.zjut.util.RosteringUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.beans.factory.annotation.Autowired;

@Controller
@RequestMapping("/test")
public class TestController {
    private IEmailVerifyService emailVerifyService;
    private static final Log logger = LogFactory.getLog(RegisterController.class);
    @RequestMapping("/test")
    public String verifyEmail( Model model){
        RosteringUtil.start(new WorkTable());
        return "re";
    }
}
