package com.join.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.join.entity.User;

 
public interface UserRepository extends JpaRepository<User, Integer> {
    
    @Query("SELECT u FROM User u JOIN u.roles r WHERE r.name LIKE %?1%")
    public Page<User> findAll(String keyword, Pageable pageable);

}