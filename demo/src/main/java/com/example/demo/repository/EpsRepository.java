package com.example.demo.repository;



import com.example.demo.Entity.Eps;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EpsRepository extends JpaRepository<Eps,Integer> {

    @Query(value = "Select * from eps where idEps=idEps",nativeQuery=true)
    void metodo();
}
