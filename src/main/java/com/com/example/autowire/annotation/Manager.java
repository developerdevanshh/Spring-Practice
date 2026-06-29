package com.com.example.autowire.annotation;

import com.example.componentscan.Employee;
import org.springframework.beans.factory.annotation.Autowired;

public class Manager {
    private Employee employee;

    @Autowired
    public Manager(Employee employee) {
        this.employee = employee;
    }

}
