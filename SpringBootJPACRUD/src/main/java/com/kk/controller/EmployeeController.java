package com.kk.controller;

import com.kk.model.Employee;
import com.kk.service.EmployeeServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@Slf4j
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeServiceImpl;

    @PostMapping("/savedata")
    public ResponseEntity<Employee> saveData(@RequestBody Employee employee){
        log.info("**************TRYING TO SAVE DATA FOR EMPLOYEE: "+ employee.getEmpFirstName());
        return ResponseEntity.ok(employeeServiceImpl.saveData(employee));
    }

    @GetMapping("/getalldata")
    public ResponseEntity<List<Employee>> getAllData(){
        return ResponseEntity.ok(employeeServiceImpl.getAllData());
    }

    @PutMapping("/updatedata/{empId}")
    public ResponseEntity<Employee> updateData(@PathVariable int empId , @RequestBody Employee employee){
        // Exception goes here

        return ResponseEntity.ok(employeeServiceImpl.updateData(employee));
    }

    @DeleteMapping("/deletedata/{empId}")
    public ResponseEntity<String> deleteData(@PathVariable int empId){
        employeeServiceImpl.deleteData(empId);
        return ResponseEntity.ok("Data Deleted Successfully");
    }

    @GetMapping("/getdatabyname/{empFirstName}")
    public ResponseEntity<List<Employee>> getDataByFirstName(@PathVariable String empFirstName){
        return ResponseEntity.ok(employeeServiceImpl.getDataByFirstName(empFirstName));
    }

    @GetMapping("/getdatabyemailid/{empEmailId}")
    public ResponseEntity<Employee> getDataByEmailId(@PathVariable String empEmailId){
        return ResponseEntity.ok(employeeServiceImpl.getDataByEmailId(empEmailId));
    }
}
