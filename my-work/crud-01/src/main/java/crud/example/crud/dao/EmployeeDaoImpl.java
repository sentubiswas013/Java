package crud.example.crud.dao;

import crud.example.crud.model.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Transactional
@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    @PersistenceContext
    private EntityManager entityManager;

    @SuppressWarnings("unchecked")
    @Override
    public List<Employee> getEmployeeList() { return null; }

    @Override
    public Employee getEmployeeById(int id) {
        return null;
    }

    @Override
    public Employee createEmployee(Employee employee) {
        entityManager.persist(employee);
        Employee emp = getLastInsertedEmployee();
        return emp;
    }

    @Override
    public Employee updateEmployee(int id, Employee employee) {
        return null;
    }

    @Override
    public Boolean deleteEmployee(int id) {
        return null;
    }

    /**
     * This method will get the latest inserted record from the database and return the object of Book Employee
     * @return employee
     */
    public Employee getLastInsertedEmployee() {
        String str = "from employee order by id desc";
        Query query = entityManager.createQuery(str);
        query.setMaxResults(1);
        Employee employee = (Employee)query.getSingleResult();
        return employee;
    };
}
