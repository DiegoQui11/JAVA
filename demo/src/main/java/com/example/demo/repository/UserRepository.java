package com.example.demo.repository;

import com.example.demo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    @Query(value = "Select * from usuarios where idUsuarios=idUsuarios",nativeQuery=true)
    void metodo();
}
