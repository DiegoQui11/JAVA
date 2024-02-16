package com.example.demo.repository;

import com.example.demo.Entity.TypeProyect;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeProyectRepository extends JpaRepository<TypeProyect,Integer> {

    @Query(value = "Select * from tipoproyecto where idTipoProyecto=idTipoProyecto",nativeQuery=true)
    void metodo();
}
