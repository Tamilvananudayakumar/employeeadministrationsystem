package com.task.employeemanagementsystem.service;

import com.task.employeemanagementsystem.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee add(Employee employee);
    List<Employee> getAll();
    Employee getById(int id);
    Employee update(Employee employee);
    void deleteById(int id);
}
