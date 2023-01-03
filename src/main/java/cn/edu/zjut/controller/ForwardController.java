package cn.edu.zjut.controller;

import cn.edu.zjut.bean.*;
import cn.edu.zjut.pojo.Employee;
import cn.edu.zjut.service.EmployeeService;
import cn.edu.zjut.service.IEmployeeService;
import cn.edu.zjut.service.IManagerService;
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
    IManagerService managerService;
    private static final Log logger = LogFactory.getLog(LoginController.class);

    @Autowired
    @Qualifier("employeeService")
    public void setiEmployeeService(IEmployeeService iEmployeeService) {
        this.employeeService = iEmployeeService;
    }
    @Autowired
    @Qualifier("managerService")
    public void setiManagerService(IManagerService iManagerService) {
        this.managerService = iManagerService;
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
        model.addAttribute("submits",employeeService.getLefts(id));
        model.addAttribute("ros",employeeService.getMyRos(id));
        return "staff/approve";
    }
    @RequestMapping("/ros/{id}")
    public String three(@PathVariable String id, Model model){
        model.addAttribute("personalData",employeeService.GetPersonaldata(id));
        SeeRos ros = new SeeRos();
        for (int i = 0; i < 42; i++) {
            SeeRosGroup group = employeeService.getOneTimeWorkers(i+1);
            ros.getNames().add(group.getName());
        }
        model.addAttribute("ross",ros);
        return "staff/ros";
    }
    @RequestMapping("/askLeave/{id}/{time}")
    public String sb(@PathVariable String id,@PathVariable int time, Model model){
        model.addAttribute("personalData",employeeService.GetPersonaldata(id));
        model.addAttribute("userId",id);
        model.addAttribute("time",time);
        return "staff/askLeave";
    }
    @RequestMapping("/acp/{id}")
    public String four(@PathVariable String id, Model model){
        model.addAttribute("personalData",employeeService.GetPersonaldata(id));
        model.addAttribute("subs",managerService.getNotAccept(id));
        return "manager/acp";
    }
    @RequestMapping("/see/{id}")
    public String five(@PathVariable String id, Model model){
        model.addAttribute("personalData",employeeService.GetPersonaldata(id));
        return "manager/see";
    }
}
