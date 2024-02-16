package com.task.employeemanagementsystem.controller;

import com.task.employeemanagementsystem.entity.Employee;
import com.task.employeemanagementsystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @PostMapping("/add")
    public Employee add(@RequestBody Employee employee){
        return employeeService.add(employee);
    }
    @GetMapping("/getAll")
    public List<Employee> getAll(){
        return employeeService.getAll();
    }
    @GetMapping("getById/{id}")
    public Employee getById(@PathVariable int id){
        return employeeService.getById(id);
    }
    @PutMapping("/update")
    public Employee update(@RequestBody Employee employee){
        return employeeService.update(employee);
    }
    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable int id){
        employeeService.deleteById(id);
    }
}
