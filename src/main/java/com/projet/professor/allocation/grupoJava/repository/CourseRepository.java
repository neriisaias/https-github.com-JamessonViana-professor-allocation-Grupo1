package com.projet.professor.allocation.grupoJava.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projet.professor.allocation.grupoJava.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{
	List<Course> findByNameContainingIgnoreCase(String name);
}
