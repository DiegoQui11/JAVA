package com.example.demo.service.imp;

import com.example.demo.Entity.Admin;
import com.example.demo.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Adminimp implements AdminService{

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public List<Admin> findAll() {
        return null;
    }

    @Override
    public void create(Admin admin) {
        this.adminRepository.save(admin);
    }

    @Override
    public void update(Admin admin) {
        this.adminRepository.save(admin);
    }

    @Override
    public void delete(Admin admin) {
        this.adminRepository.delete(admin);
    }
}
