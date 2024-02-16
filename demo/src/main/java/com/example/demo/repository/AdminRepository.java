package com.example.demo.repository;

import com.example.demo.Entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer> {

    @Query(value = "Select * from administrador where idAdmin=idAdmin",nativeQuery=true)
    void metodo();
}
