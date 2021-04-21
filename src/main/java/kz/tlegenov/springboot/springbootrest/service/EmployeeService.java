package kz.tlegenov.springboot.springbootrest.service;



import kz.tlegenov.springboot.springbootrest.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
