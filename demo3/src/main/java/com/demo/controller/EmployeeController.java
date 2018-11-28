package com.demo.controller;

import com.demo.pojo.Employee;
import com.demo.pojo.EmployeeVo;
import com.demo.service.EmployeeService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author banzijian
 * @date 2018/11/26
 **/
@RestController
public class EmployeeController {
    @Resource
    private EmployeeService employeeService;

    @GetMapping("/employee/list")
    public List<EmployeeVo> getEmployeeList(){
        return employeeService.getEmployeeList();
    }

    @GetMapping("/employee/get")
    public Employee getEmployee(Long id){
        return employeeService.getEmployee(id);
    }

    @PostMapping("/employee/add")
    public boolean addEmployee(Employee employee){
        return employeeService.addEmployee(employee);
    }

    @PostMapping("/employee/mod")
    public boolean modEmployee(Employee employee){
        return employeeService.modEmployee(employee);
    }

    @PostMapping("/employee/rem")
    public boolean remEmployee(Long id){
        return employeeService.remEmployee(id);
    }
}
