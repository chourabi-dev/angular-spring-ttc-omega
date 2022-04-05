package com.ttcdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ttcdemo.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
