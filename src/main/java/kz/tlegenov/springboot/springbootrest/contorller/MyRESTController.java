package kz.tlegenov.springboot.springbootrest.contorller;


import kz.tlegenov.springboot.springbootrest.entity.Employee;
import kz.tlegenov.springboot.springbootrest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployees() {
        List<Employee> employees = employeeService.getAllEmployees();
        return employees;
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id) {
        Employee employee = employeeService.getEmployee(id);
//        if(employee == null) {
//            throw new NoSuchEmployeeException("There is not employee with ID: " + id + " in DataBase");
//        }
        return employee;
    }

    @PostMapping("/employees")
    public Employee addNewEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
        return employee;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
        return employee;
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id) {
        Employee employee = employeeService.getEmployee(id);
//        if(employee == null) {
//            throw new NoSuchEmployeeException("There is no employee with ID " + id + " in DataBase");
//        }
        employeeService.deleteEmployee(id);
        return "Employee with id " + id + " was deleted";
    }

}
