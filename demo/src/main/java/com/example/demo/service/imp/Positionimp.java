package com.example.demo.service.imp;

import com.example.demo.Entity.Position;
import com.example.demo.repository.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Positionimp implements PositionService{

    @Autowired
    private PositionRepository positionRepository;

    @Override
    public List<Position> findAll() {
        return null;
    }

    @Override
    public void create(Position position) {
        this.positionRepository.save(position);
    }

    @Override
    public void update(Position position) {
        this.positionRepository.save(position);
    }

    @Override
    public void delete(Position position) {
        this.positionRepository.delete(position);
    }
}
