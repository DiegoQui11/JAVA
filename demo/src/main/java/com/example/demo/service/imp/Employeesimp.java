package com.example.demo.service.imp;

import com.example.demo.Entity.Employees;
import com.example.demo.repository.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Employeesimp implements EmployeesService{

    @Autowired
    private EmployeesRepository employeesRepository;

    @Override
    public List<Employees> findAll() {
        return null;
    }

    @Override
    public void create(Employees employees) {
        this.employeesRepository.save(employees);
    }

    @Override
    public void update(Employees employees) {
        this.employeesRepository.save(employees);
    }

    @Override
    public void delete(Employees employees) {
        this.employeesRepository.delete(employees);
    }
}
