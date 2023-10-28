package com.fahed.hrpro.Repository;

import com.fahed.hrpro.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EmployeeRepository extends JpaRepository<Employee, Long> {


}