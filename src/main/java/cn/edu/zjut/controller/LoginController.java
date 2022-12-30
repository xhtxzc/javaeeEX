package cn.edu.zjut.controller;

import cn.edu.zjut.bean.LoginAccount;
import cn.edu.zjut.pojo.Employee;
import cn.edu.zjut.service.EmployeeService;
import cn.edu.zjut.service.IEmployeeService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/login")
public class LoginController {
    IEmployeeService employeeService;
    private static final Log logger = LogFactory.getLog(LoginController.class);

    @Autowired
    @Qualifier("employeeService")
    public void setiEmployeeService(IEmployeeService iEmployeeService) {
        this.employeeService = iEmployeeService;
    }

    @RequestMapping("/login")
    public String login(@ModelAttribute LoginAccount loginAccount , Model  model){
        if(loginAccount != null){
            Employee employee = employeeService.GetPersonaldata(loginAccount.getAccount());

            if(employee == null)
                return "r";
            //存入个人资料便于在个人页面展示
            model.addAttribute("personalData",employee);
            if(employee.getPosition().equals("admin")) {
                //是管理员的话在Model中加入全体人员的信息
                List<Employee> employeeList = employeeService.GetAllEmployee();
                model.addAttribute("employeeTable",employeeList);
                return "adminPage/adminPage";
            }
            else if(employee.getPosition().equals("staff")){
                return "staff/staffPage";
            }
            else if(employee.getPosition().equals("manager")||employee.getPosition().equals("dpManager"))
            {
                return "manager/managerPage";
            }
            else{
                return "r";
            }

        }
        else {
            return "r";
        }

    }
}
