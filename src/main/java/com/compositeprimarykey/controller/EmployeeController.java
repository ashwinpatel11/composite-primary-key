package com.compositeprimarykey.controller;

import com.compositeprimarykey.entity.Employee;
import com.compositeprimarykey.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmpService empService;

    @PostMapping("/add")
    public Employee addEmp(@RequestBody Employee employee){
        return empService.addEmp(employee);
    }

}
