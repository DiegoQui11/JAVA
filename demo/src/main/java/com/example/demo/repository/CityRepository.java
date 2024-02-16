package com.example.demo.repository;

import com.example.demo.Entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City,Integer> {

    @Query(value = "Select * from ciudad where idCiudad=idCiudad",nativeQuery=true)
    void metodo();
}
