package com.kk.repository;

import com.kk.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    // here Employee ->POJO class & Integer->Wrapper class as empId is our primary key

    // custom method goes here

    public List<Employee> findByEmpFirstName(String empFirstName);

    public Employee findByEmpEmailId(String empEmailId);
}
