package com.example.demo.repository;


import com.example.demo.Entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PositionRepository extends JpaRepository<Position,Integer> {

    @Query(value = "Select * from cargo where idCargo=idCargo",nativeQuery=true)
    void metodo();
}
