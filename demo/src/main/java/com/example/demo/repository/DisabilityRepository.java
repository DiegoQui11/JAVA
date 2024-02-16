package com.example.demo.repository;


import com.example.demo.Entity.Disability;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DisabilityRepository extends JpaRepository<Disability,Integer> {

    @Query(value = "Select * from incapacidades where idIncapacidades=idIncapacidades",nativeQuery=true)
    void metodo();
}
