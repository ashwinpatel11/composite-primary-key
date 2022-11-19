package com.compositeprimarykey.repository;

import com.compositeprimarykey.entity.Employee;
import com.compositeprimarykey.entity.EmployeePrimaryData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepo extends JpaRepository<Employee, EmployeePrimaryData> {
}
