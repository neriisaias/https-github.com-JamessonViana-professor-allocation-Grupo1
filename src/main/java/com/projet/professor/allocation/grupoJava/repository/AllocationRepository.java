package com.projet.professor.allocation.grupoJava.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projet.professor.allocation.grupoJava.entity.Allocation;
import com.projet.professor.allocation.grupoJava.entity.Course;
import com.projet.professor.allocation.grupoJava.entity.Professor;

@Repository
public interface AllocationRepository extends JpaRepository<Allocation, Long> {
	List<Allocation> findByProfessor(Professor professor);

	List<Allocation> findByCourse(Course course);
}
