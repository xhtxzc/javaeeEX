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
@Controller
@RequestMapping("/manager")
public class ManagerController {
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
    @RequestMapping("/accept/{number}/{id}")
    public String weq(@PathVariable int number,@PathVariable String id,Model model){
        model.addAttribute("personalData",employeeService.GetPersonaldata(id));
        AccAndRef num = new AccAndRef();
        num.setNumber(number);
        num.setId(id);
        managerService.accept(num);
        return "manager/managerPage";
    }
    @RequestMapping("/refuse/{number}/{id}")
    public String wq(@PathVariable int number,@PathVariable String id,Model model){
        model.addAttribute("personalData",employeeService.GetPersonaldata(id));
        AccAndRef num = new AccAndRef();
        num.setNumber(number);
        num.setId(id);
        managerService.refuse(num);
        return "manager/managerPage";
    }
}
