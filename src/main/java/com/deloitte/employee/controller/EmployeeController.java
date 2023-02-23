package com.deloitte.employee.controller;
 
import java.util.ArrayList;
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
 
import com.deloitte.employee.dao.EmployeeDao;
import com.deloitte.employee.model.Employee;
import com.deloitte.employee.model.EmploymentHistory;
import com.deloitte.employee.service.EmployeeService;
 
@Controller
public class EmployeeController {
 
    @Autowired
    EmployeeService employeeService;
    
    @Autowired
    EmployeeDao employeeDao;
    
    
    @RequestMapping("/")
    public ModelAndView home(){
    
        ModelAndView mav = new ModelAndView("home");
        mav.addObject("message", "List of Employees");
        List<Employee> employees = employeeService.findAll();
//        System.out.println(employees);
        mav.addObject("employees", employees);
        return mav;
    }
    
    @RequestMapping(value="/search", method = RequestMethod.POST)
    public ModelAndView search(@Param("empId") Long empId,@Param("firstName") String firstName, @ModelAttribute("emp")Employee employee) {
        ModelAndView mav = new ModelAndView("home");
        List<Employee> employees = new ArrayList<>();
        if(empId !=null)
        {
        employees = employeeDao.search(empId);
        }
        else if(firstName!=null)
        {
            employees= employeeDao.search(firstName);
        }
        else {
            System.out.println("name is null");
        }
//        System.out.println(employee);
//        employees.add(employee);
//        mav.addObject("employee",employee);
        mav.addObject("employees",employees);
        return mav;
        
    }
    
    @RequestMapping("/employee")
    public ModelAndView addExpense() {
        ModelAndView mav = new ModelAndView("employee");
        mav.addObject("employee", new Employee());
        return mav;
    }
    
    @RequestMapping(value="/employee",method= RequestMethod.POST)
    public String save(@ModelAttribute("expense") Employee employee) {
        employeeService.save(employee);
        return "redirect:/";
    }
    
    @RequestMapping(value = "/employee/{empId}")
    public ModelAndView edit(@PathVariable("empId")Long empId) {
        ModelAndView mav= new ModelAndView("employee");
        Employee employee = employeeService.findById(empId);
        mav.addObject("employee", employee);
        return mav;
    }
    
    @RequestMapping(value = "/{empId}")
    public String delete(@PathVariable("empId") Long empId) {
        employeeService.delete(empId);
        return "redirect:/";
    }
    
    @RequestMapping(value="/history/{emp_id}")
    public ModelAndView viewHistory(@PathVariable ("empId") Long emp_id) {
        ModelAndView mav= new ModelAndView("history");
        List<EmploymentHistory> employees=employeeDao.findHistory(emp_id);
         if(employees.isEmpty()) {
             mav.addObject("employees","no employment history");
             }else {
                 mav.addObject("employees",employees);
                 }
         return mav;
         }
    }
 


