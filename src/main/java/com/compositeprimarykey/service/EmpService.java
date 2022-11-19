package com.compositeprimarykey.service;

import com.compositeprimarykey.entity.Employee;
import com.compositeprimarykey.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {
    @Autowired
    private EmpRepo empRepo;

    public Employee addEmp(Employee employee){
       return empRepo.save(employee);
    }
}
