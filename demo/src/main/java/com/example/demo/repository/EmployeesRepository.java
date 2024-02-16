package com.example.demo.repository;


import com.example.demo.Entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeesRepository extends JpaRepository<Employees,Integer> {

    @Query(value = "Select * from empleados where idEmpleado=idEmpleado",nativeQuery=true)
    void metodo();
}
