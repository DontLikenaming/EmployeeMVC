package project.spring4.mvc.employee.service;

import project.spring4.mvc.employee.model.Employee;

import java.util.List;

public interface EmployeeSerivce {
    int newEmployee(Employee emp);
    List<Employee> readEmployee();
    Employee readOneEmployee(int empid);
    int modifyEmployee(Employee emp);
    int removeEmployee(int empid);
}
