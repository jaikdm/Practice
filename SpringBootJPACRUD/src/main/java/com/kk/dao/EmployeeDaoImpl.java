package com.kk.dao;

import com.kk.model.Employee;
import com.kk.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EmployeeDaoImpl {

    @Autowired
    EmployeeRepository employeeRepositoryImpl;

    public Employee saveData(Employee employee) {
        return employeeRepositoryImpl.save(employee);
    }

    public List<Employee> getAllData(){
        return employeeRepositoryImpl.findAll();
    }

    public Employee updateData(Employee employee){
    return employeeRepositoryImpl.save(employee);
    }

    public void deleteData(int empId){
        employeeRepositoryImpl.deleteById(empId);
    }

    public List<Employee> getDataByFirstName(String empFirstName){
      //  return employeeRepositoryImpl.findAll().stream().filter(emp->emp.getEmpFirstName().equals(empFirstName)).collect(Collectors.toList());
        return employeeRepositoryImpl.findByEmpFirstName(empFirstName);
    }

    public Employee getDataByEmailId(String empEmailId){
        return employeeRepositoryImpl.findByEmpEmailId(empEmailId);
    }
}
