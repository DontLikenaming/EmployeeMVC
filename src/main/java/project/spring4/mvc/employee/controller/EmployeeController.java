package project.spring4.mvc.employee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import project.spring4.mvc.employee.service.EmployeeSerivce;
import org.springframework.beans.factory.annotation.Autowired;


@Controller
public class EmployeeController {
    private EmployeeSerivce empsrv;

    @Autowired
    public EmployeeController(EmployeeSerivce empsrv) { this.empsrv = empsrv; }

    @GetMapping(value = "/list")
    public ModelAndView list(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("emp", empsrv.readEmployee());
        mav.setViewName("emplist");

        return mav;
    }
}
