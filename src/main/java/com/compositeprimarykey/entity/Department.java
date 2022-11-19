package com.compositeprimarykey.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Department {

    @Id
    private int did;
    private String dname;

    @OneToMany(mappedBy = "department")
 //   @JsonBackReference
    private List<Employee> employee;
}
