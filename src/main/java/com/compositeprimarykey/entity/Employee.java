package com.compositeprimarykey.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {

    @EmbeddedId
    private EmployeePrimaryData employeePrimaryData;
    private String designation;

    @ManyToOne(cascade = CascadeType.ALL)
   // @JsonManagedReference
    private Department department;
}
