package com.demo.service.impl;

import com.demo.mapper.EmployeeMapper;
import com.demo.pojo.Employee;
import com.demo.service.EmployeeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author banzijian
 * @date 2018/11/26
 **/
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Resource
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> getEmployeeList(){
        return employeeMapper.selectList();
    }
}
