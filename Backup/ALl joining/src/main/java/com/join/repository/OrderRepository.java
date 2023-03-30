package com.join.repository;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.join.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
 
    @Query("SELECT DISTINCT o FROM Order o JOIN o.orderDetails od JOIN od.product p"
            + " WHERE p.name LIKE %?1%")
    public Page<Order> findAll(String keyword, Pageable pageable);   
 
}
