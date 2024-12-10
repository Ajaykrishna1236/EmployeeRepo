package com.employeApp.EmployeeApp.service;

import com.employeApp.EmployeeApp.EmployeeRepo;
import com.employeApp.EmployeeApp.dto.EmployeeRequest;
import com.employeApp.EmployeeApp.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;


public interface EmployeeService {

       void createEmployee(EmployeeRequest employeeRequest);

       Employee getEmployee (long id);

       void updateEmployee(EmployeeRequest employeeRequest);

       void deleteEmployeeDetails(Long id);

}


