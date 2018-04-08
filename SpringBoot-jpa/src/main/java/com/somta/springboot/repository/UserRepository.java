package com.somta.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.somta.springboot.pojo.User;


public interface UserRepository  extends JpaRepository<User, String>{

}
