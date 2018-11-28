package com.demo.service.impl;

import com.demo.mapper.EmployeeMapper;
import com.demo.mapper.JobMapper;
import com.demo.pojo.Employee;
import com.demo.pojo.EmployeeVo;
import com.demo.pojo.Job;
import com.demo.service.EmployeeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author banzijian
 * @date 2018/11/26
 **/
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Resource
    private EmployeeMapper employeeMapper;
    @Resource
    private JobMapper jobMapper;

    @Override
    public List<EmployeeVo> getEmployeeList(){
        List<Job> jobs = jobMapper.selectList();
        Map<Long, String> map = new HashMap<>();
        for (Job job : jobs) {
            map.put(job.getId(), job.getJobName());
        }
        List<EmployeeVo> result = new ArrayList<>();
        List<Employee> employees = employeeMapper.selectList();
        for (Employee employee : employees) {
            EmployeeVo employeeVo = new EmployeeVo();
            employeeVo.setId(employee.getId());
            employeeVo.setEmployeeNo(employee.getEmployeeNo());
            employeeVo.setEmployeeName(employee.getEmployeeName());
            employeeVo.setJobId(map.get(employee.getJobId()));
            result.add(employeeVo);
        }
        return result;
    }

    @Override
    public Employee getEmployee(Long id){
        return employeeMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean addEmployee(Employee employee){
        int i = employeeMapper.insertSelective(employee);
        if (i != 1) {
            return false;
        }
        return true;
    }

    @Override
    public boolean modEmployee(Employee employee){
        int i = employeeMapper.updateByPrimaryKeySelective(employee);
        if (i != 1) {
            return false;
        }
        return true;
    }

    @Override
    public boolean remEmployee(Long id){
        int i = employeeMapper.deleteByPrimaryKey(id);
        if (i != 1) {
            return false;
        }
        return true;
    }
}
