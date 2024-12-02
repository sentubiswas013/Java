package crud.example.crud.service;
import crud.example.crud.model.Employee;
import java.util.List;

public interface EmployeeService {
    List<Employee> getEmployeeList();
    Employee getEmployeeById(int id);
    Employee createEmployee(Employee employee);
    Employee updateEmployee(int id, Employee employee);
    Boolean deleteEmployee(int id);
}
