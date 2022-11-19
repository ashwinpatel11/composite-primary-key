package com.compositeprimarykey;

import com.compositeprimarykey.entity.Department;
import com.compositeprimarykey.entity.Employee;
import com.compositeprimarykey.entity.EmployeePrimaryData;
import com.compositeprimarykey.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CompositePrimaryKeyApplication // implements CommandLineRunner
{

	@Autowired
	private EmpRepo empRepo;

	public static void main(String[] args) {
		SpringApplication.run(CompositePrimaryKeyApplication.class, args);
	}

	/*@Override
	public void run(String... args) throws Exception {
		EmployeePrimaryData employeePrimaryData=new EmployeePrimaryData(11,"ashwin");
		Employee e=new Employee(employeePrimaryData,"clerk",new Department(1,"it",null));
		empRepo.save(e);
	}*/
}
