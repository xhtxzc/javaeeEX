package cn.edu.zjut.controller;
import cn.edu.zjut.bean.*;
import cn.edu.zjut.po.AlterDayInDB;
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
@Controller
@RequestMapping("/staff")
public class StaffController {
    IEmployeeService employeeService;
    private static final Log logger = LogFactory.getLog(LoginController.class);

    @Autowired
    @Qualifier("employeeService")
    public void setiEmployeeService(IEmployeeService iEmployeeService) {
        this.employeeService = iEmployeeService;
    }

    @RequestMapping("/alterDay/{id}")
    public String one(@ModelAttribute AlterDay day,@PathVariable String id, Model model){
        JSONPreference json = new JSONPreference();
        if (day.getDay1()!=null){
            json.getSelect().add("1");
        }
        if (day.getDay2()!=null){
            json.getSelect().add("2");
        }
        if (day.getDay3()!=null){
            json.getSelect().add("3");
        }
        if (day.getDay4()!=null){
            json.getSelect().add("4");
        }
        if (day.getDay5()!=null){
            json.getSelect().add("5");
        }
        if (day.getDay6()!=null){
            json.getSelect().add("6");
        }
        if (day.getDay7()!=null){
            json.getSelect().add("7");
        }
        AlterDayInDB dayInDB = new AlterDayInDB();
        dayInDB.setType("day");
        dayInDB.setValue(JSON.toJSONString(json));
        dayInDB.setEmployeeId(id);
        employeeService.AlterDay(dayInDB);
        return "staff/info";

    }
    @RequestMapping("/alterTime/{id}")
    public String two(@ModelAttribute AlterTime time ,@PathVariable String id, Model model){
        JSONPreference json = new JSONPreference();
        if (time.getTime1()!=null){
            json.getSelect().add("1");
        }
        if (time.getTime2()!=null){
            json.getSelect().add("2");
        }
        if (time.getTime3()!=null){
            json.getSelect().add("3");
        }
        if (time.getTime4()!=null){
            json.getSelect().add("4");
        }
        if (time.getTime5()!=null){
            json.getSelect().add("5");
        }
        if (time.getTime6()!=null){
            json.getSelect().add("6");
        }
        AlterDayInDB dayInDB = new AlterDayInDB();
        dayInDB.setType("time");
        dayInDB.setValue(JSON.toJSONString(json));
        dayInDB.setEmployeeId(id);
        employeeService.AlterDay(dayInDB);
        return "staff/info";

    }
}
