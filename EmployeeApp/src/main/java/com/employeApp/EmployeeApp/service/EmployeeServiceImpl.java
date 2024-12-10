package com.employeApp.EmployeeApp.service;

import com.employeApp.EmployeeApp.EmployeeRepo;
import com.employeApp.EmployeeApp.dto.EmployeeRequest;
import com.employeApp.EmployeeApp.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServiceImpl implements  EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;
    @Override
    public void createEmployee(EmployeeRequest employeeRequest) {


     Employee employee=new Employee();
     employee.setEmployeeName(employeeRequest.getEmployeeName());
     employee.setEmail(employeeRequest.getEmail());
     employee.setDepartment(employeeRequest.getDepartment());
     employee.setSalary(employeeRequest.getSalary());
     employee.setNumber(employeeRequest.getNumber());

     employeeRepo.save(employee);




    }

    @Override
    public Employee getEmployee(long id) {

      return   employeeRepo.findById(id).get();

    }

    @Override
    public void updateEmployee(EmployeeRequest employeeRequest) {

        Optional<Employee> employeeOptional = employeeRepo.findById(employeeRequest.getEmployeeId());

        if(employeeOptional.isPresent()){
            Employee employee = employeeOptional.get();
            employee.setEmployeeName(employeeRequest.getEmployeeName());
            employee.setEmail(employeeRequest.getEmail());
            employee.setDepartment(employeeRequest.getDepartment());
            employee.setSalary(employeeRequest.getSalary());
            employee.setNumber(employeeRequest.getNumber());

            employeeRepo.save(employee);
        }



    }

    @Override
    public void deleteEmployeeDetails(Long id) {
       Employee employeeid= employeeRepo.findById(id).get();
        employeeRepo.delete(employeeid);
    }
}
