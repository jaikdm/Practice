package com.kk.service;

import com.kk.dao.EmployeeDaoImpl;
import com.kk.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl {

    @Autowired
    EmployeeDaoImpl employeeDaoImpl;

    public Employee saveData(Employee employee) {
        return employeeDaoImpl.saveData(employee);
    }

    public List<Employee> getAllData(){
        return employeeDaoImpl.getAllData();
    }

    public Employee updateData(Employee employee){
        return employeeDaoImpl.updateData(employee);
    }

    public void deleteData(int empId){
        employeeDaoImpl.deleteData(empId);
    }

    public List<Employee> getDataByFirstName(String empFirstName){
        //  return employeeRepositoryImpl.findAll().stream().filter(emp->emp.getEmpFirstName().equals(empFirstName)).collect(Collectors.toList());
        return employeeDaoImpl.getDataByFirstName(empFirstName);
    }

    public Employee getDataByEmailId(String empEmailId){
        return employeeDaoImpl.getDataByEmailId(empEmailId);
    }
}
