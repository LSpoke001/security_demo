package com.lspoke.security_demo.rest;

import com.lspoke.security_demo.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/api/employee")
public class EmployeeRestController {

    private List<Employee> employees = Stream.of(
            new Employee(1L, "Ivan", "Ivanov"),
            new Employee(2L, "Petya", "Petrov"),
            new Employee(3L, "Vasya", "Vasilyev")
    ).collect(Collectors.toList());

    @GetMapping
    public List<Employee> getAll(){
        return employees;
    }
    @GetMapping("/{id}")
    public Employee getById(@PathVariable Long id){
        return employees.stream().filter(employee -> employee.getId().equals(id)).findFirst().orElse(null);
    }
}
