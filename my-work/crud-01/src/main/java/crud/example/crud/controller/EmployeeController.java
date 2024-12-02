package crud.example.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import crud.example.crud.model.Employee;
import crud.example.crud.service.EmployeeService;


@Controller
@RequestMapping("EmployeeService")
public class EmployeeController {

//    @Autowired
//    private EmployeeService employeeService;
//
//    @PostMapping("books")
//    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
//        Employee emp = employeeService.createEmployee(employee);
//        return new ResponseEntity<Employee>(emp, HttpStatus.OK);
//
//    }


}
