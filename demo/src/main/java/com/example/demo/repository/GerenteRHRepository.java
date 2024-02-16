package com.example.demo.repository;


import com.example.demo.Entity.GerentRH;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface GerenteRHRepository extends JpaRepository<GerentRH,Integer> {

    @Query(value = "Select * from gerenterh where idRecHum=idRecHum",nativeQuery=true)
    void metodo();
}
