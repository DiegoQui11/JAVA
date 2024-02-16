package com.example.demo.service.imp;

import com.example.demo.Entity.User;

import java.util.List;


public interface UserService {
    public List<User> findAll();
    public void create (User user);
    public void  update (User user);
    public void delete (User user);
}
