package com.devglan.dao;

import com.devglan.model.User;

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository;

@Repository
//public interface UserDao extends CrudRepository<User, Long> {
public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
