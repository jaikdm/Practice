package com.kk.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@AllArgsConstructor // Parameterized constructor
@NoArgsConstructor // Default constructor
public class Employee {

    @Id
    @GeneratedValue
    private int empId;

    private String empFirstName;

    private String empLastName;

    @Column(name = "empEmailId", unique = true)
    private String empEmailId;
}
