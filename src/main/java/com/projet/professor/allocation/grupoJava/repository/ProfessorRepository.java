package com.projet.professor.allocation.grupoJava.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projet.professor.allocation.grupoJava.entity.Department;
import com.projet.professor.allocation.grupoJava.entity.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long>{
	List<Professor> findByNameContainingIgnoreCase(String name);

	List<Professor> findByDepartment(Department department);
}
