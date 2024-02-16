package com.example.demo.repository;

import com.example.demo.Entity.Costumer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CostumerRepository extends JpaRepository<Costumer, Integer> {

    @Query(value = "Select * from cliente where idCliente=idCliente",nativeQuery=true)
    void metodo();
}
