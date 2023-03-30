package com.join.repository;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.join.entity.Brand;

 

public interface BrandRepository extends JpaRepository<Brand, Integer> {
	 
    @Query("SELECT DISTINCT b FROM Brand b JOIN b.categories c WHERE c.name LIKE %?1%")
    public Page<Brand> findAll(String keyword, Pageable pageable);
    
//    @Query("SELECT DISTINCT b FROM Brand b JOIN b.categories c WHERE c.name LIKE %?1%")
//    public Page<Brand> findAll(String keyword, Pageable pageable);

     
}

