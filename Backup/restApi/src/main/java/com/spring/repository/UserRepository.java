package com.spring.repository;

import com.spring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
 
//@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
