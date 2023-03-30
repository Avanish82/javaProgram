package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.mail.SimpleMailMessage;

import com.app.entity.EmailDetails;

public interface EmailRepository extends JpaRepository<EmailDetails, Long>{

	void save(SimpleMailMessage mailMessage);

	//String save(SimpleMailMessage mailMessage);
	

}
