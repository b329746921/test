package com.demo.controller;

import com.demo.pojo.Employee;
import com.demo.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
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
    public List<Employee> getEmployeeList(){
        return employeeService.getEmployeeList();
    }
}
