package com.demo.service;

import com.demo.pojo.Employee;
import com.demo.pojo.EmployeeVo;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author banzijian
 * @date 2018/11/26
 **/
public interface EmployeeService {
    List<EmployeeVo> getEmployeeList();

    Employee getEmployee(Long id);

    boolean addEmployee(Employee employee);

    boolean modEmployee(Employee employee);

    boolean remEmployee(Long id);
}
