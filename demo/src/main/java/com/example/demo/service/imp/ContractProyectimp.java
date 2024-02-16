package com.example.demo.service.imp;

import com.example.demo.Entity.ContractProyct;
import com.example.demo.repository.ContractProyctRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractProyectimp implements ContractProyctService {

    @Autowired
    private ContractProyctRepository contractProyctRepository;

    @Override
    public List<ContractProyct> findAll() {
        return null;
    }

    @Override
    public void create(ContractProyct contractProyct) {
        this.contractProyctRepository.save(contractProyct);
    }

    @Override
    public void update(ContractProyct contractProyct) {
        this.contractProyctRepository.save(contractProyct);
    }

    @Override
    public void delete(ContractProyct contractProyct) {
        this.contractProyctRepository.delete(contractProyct);
    }
}
