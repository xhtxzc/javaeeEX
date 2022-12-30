package cn.edu.zjut.controller;

import cn.edu.zjut.bean.JSONPreference;
import cn.edu.zjut.bean.LoginAccount;
import cn.edu.zjut.bean.Preferences;
import cn.edu.zjut.pojo.Employee;
import cn.edu.zjut.service.EmployeeService;
import cn.edu.zjut.service.IEmployeeService;
import com.alibaba.fastjson.JSON;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/fow")
public class ForwardController {
    IEmployeeService employeeService;
    private static final Log logger = LogFactory.getLog(LoginController.class);

    @Autowired
    @Qualifier("employeeService")
    public void setiEmployeeService(IEmployeeService iEmployeeService) {
        this.employeeService = iEmployeeService;
    }

    @RequestMapping("/info/{id}")
    public String one(@PathVariable String id, Model model){
        model.addAttribute("personalData",employeeService.GetPersonaldata(id));
        Preferences preferences = employeeService.getPreById(id);
        for (cn.edu.zjut.pojo.Preference p :preferences.getPreferences()){
            if (p.getType().equals("day")){
                JSONPreference json = JSON.parseObject(p.getValue(),JSONPreference.class);
                for (String pre: json.getSelect()){
                    model.addAttribute("day"+pre,"true");
                }
            }
            else if (p.getType().equals("time")){
                JSONPreference json = JSON.parseObject(p.getValue(),JSONPreference.class);
                for (String pre: json.getSelect()){
                    model.addAttribute("time"+pre,"true");
                }
            }
            else {

            }
        }
        model.addAttribute("personalPreference",1);
        return "staff/info";
    }
    @RequestMapping("/app/{id}")
    public String two(@PathVariable String id, Model model){
        model.addAttribute("personalData",employeeService.GetPersonaldata(id));
        return "staff/approve";
    }
    @RequestMapping("/ros/{id}")
    public String three(@PathVariable String id, Model model){
        model.addAttribute("personalData",employeeService.GetPersonaldata(id));
        return "staff/ros";
    }
    @RequestMapping("/acp/{id}")
    public String four(@PathVariable String id, Model model){
        model.addAttribute("personalData",employeeService.GetPersonaldata(id));
        return "manager/acp";
    }
    @RequestMapping("/see/{id}")
    public String five(@PathVariable String id, Model model){
        model.addAttribute("personalData",employeeService.GetPersonaldata(id));
        return "manager/see";
    }
}
