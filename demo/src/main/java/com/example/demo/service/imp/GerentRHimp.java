package com.example.demo.service.imp;

import com.example.demo.Entity.GerentRH;
import com.example.demo.repository.GerenteRHRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GerentRHimp implements GerentRHService{

    @Autowired
    private GerenteRHRepository gerenteRHRepository;

    @Override
    public List<GerentRH> findAll() {
        return null;
    }

    @Override
    public void create(GerentRH gerentRH) {
        this.gerenteRHRepository.save(gerentRH);
    }

    @Override
    public void update(GerentRH gerentRH) {
        this.gerenteRHRepository.save(gerentRH);
    }

    @Override
    public void delete(GerentRH gerentRH) {
        this.gerenteRHRepository.delete(gerentRH);
    }
}
