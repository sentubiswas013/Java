package crud.example.crud.service;

import crud.example.crud.dao.EmployeeDao;
import crud.example.crud.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao dao;

    @Override
    public List<Employee> getEmployeeList() {
        return null;
    }

    @Override
    public Employee getEmployeeById(int id) {
        return null;
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return dao.createEmployee(employee);
    }

    @Override
    public Employee updateEmployee(int id, Employee employee) {
        return null;
    }

    @Override
    public Boolean deleteEmployee(int id) {
        return null;
    }
}
