package com.example.practice.dao;

import com.example.practice.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User,String> {
}
