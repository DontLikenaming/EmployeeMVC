package project.spring4.mvc.employee.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import project.spring4.mvc.employee.model.Employee;
import project.spring4.mvc.employee.service.EmployeeSerivce;
import org.springframework.beans.factory.annotation.Autowired;


@Controller
public class EmployeeController {
    private EmployeeSerivce empsrv;
    private static final Logger logger = LogManager.getLogger(EmployeeController.class);

    @Autowired
    public EmployeeController(EmployeeSerivce empsrv) { this.empsrv = empsrv; }

    @GetMapping(value = "/list")
    public ModelAndView list(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("emp", empsrv.readEmployee());
        mav.setViewName("emplist");

        return mav;
    }

    @GetMapping(value = "/add")
    public String add(){
        return "empadd";
    }

    @PostMapping(value = "/add")
    public ModelAndView addok(Employee emp){
        ModelAndView mv = new ModelAndView();
        String view = "empfail";
        if(empsrv.newEmployee(emp)) {
            view = "redirect:/view?empid="+emp.getEmpid();
            mv.addObject("emp", emp);
        }

        mv.setViewName(view);

        return mv;
    }

    @GetMapping(value = "/view")
    public ModelAndView listOne(@RequestParam int empid){
        ModelAndView mav = new ModelAndView();
        String view = "empfail";
        Employee emp = empsrv.readOneEmployee(empid);

        if(emp!=null) {
            view = "empview";
            mav.addObject("emp", emp);
        }

        mav.setViewName(view);

        return mav;
    }

    @GetMapping(value = "/remove")
    public String delete(int empid){
        empsrv.removeEmployee(empid);

        return "redirect:/list";
    }


    @ExceptionHandler(BindException.class)
    public String typeMismatchParam(BindException ex){
        logger.info("매개변수 관련 오류!");
        logger.info(ex.getMessage());
        return "empfail";
    }
}
