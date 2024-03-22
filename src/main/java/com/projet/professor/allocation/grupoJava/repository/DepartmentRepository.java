package com.projet.professor.allocation.grupoJava.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projet.professor.allocation.grupoJava.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {	
	List<Department> findByNameContainingIgnoreCase(String name); 
}
