package com.innoventes.test.app.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.innoventes.test.app.entity.Company;


public interface CompanyRepository extends JpaRepository<Company, Long> {
	
}