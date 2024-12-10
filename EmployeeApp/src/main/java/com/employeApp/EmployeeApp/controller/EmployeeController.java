package com.employeApp.EmployeeApp.controller;


import com.employeApp.EmployeeApp.dto.EmployeeRequest;
import com.employeApp.EmployeeApp.entity.Employee;
import com.employeApp.EmployeeApp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {


    @Autowired
    private EmployeeService service;

    @PostMapping("/create")
    public  void createEmployee(@RequestBody EmployeeRequest employeeRequest){

        service.createEmployee(employeeRequest);

    }
    @GetMapping("{id}")
    public Employee getEmployee(@PathVariable Long id){

      return   service.getEmployee(id);
    }

    @PutMapping("/update")
    public  void updateEmployee(@RequestBody EmployeeRequest employeeRequest ){


        service.updateEmployee(employeeRequest);
    }

    @DeleteMapping("{id}")

    public  void deleteEmployeeDetails(@PathVariable("id") Long id){

       service.deleteEmployeeDetails(id);

    }





}
