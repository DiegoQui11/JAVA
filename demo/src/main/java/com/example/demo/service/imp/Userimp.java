package com.example.demo.service.imp;

import com.example.demo.Entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Userimp implements UserService{

    @Autowired
    private UserRepository userRepository;


    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public void create(User user) {
        this.userRepository.save(user);
    }

    @Override
    public void update(User user) {
        this.userRepository.save(user);
    }

    @Override
    public void delete(User user) {
        this.userRepository.delete(user);
    }
}
