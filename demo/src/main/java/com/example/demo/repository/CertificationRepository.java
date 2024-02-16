package com.example.demo.repository;

import com.example.demo.Entity.Certification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface CertificationRepository extends JpaRepository<Certification,Integer> {

    @Query(value = "Select * from certificados where idCertificado=idCertificado",nativeQuery=true)
    void metodo();
}
