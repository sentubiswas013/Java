package crud.example.crud.dao;

import crud.example.crud.model.Employee;

import java.util.List;

public interface EmployeeDao {
    List<Employee> getEmployeeList();
    Employee getEmployeeById(int id);
    Employee createEmployee(Employee employee);
    Employee updateEmployee(int id, Employee employee);
    Boolean deleteEmployee(int id);

}
