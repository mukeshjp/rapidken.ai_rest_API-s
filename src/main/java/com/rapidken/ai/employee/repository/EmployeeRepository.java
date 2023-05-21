package com.rapidken.ai.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event.ID;

import com.rapidken.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
