package com.projet.professor.allocation.grupoJava.service;

import org.springframework.stereotype.Service;

import com.projet.professor.allocation.grupoJava.repository.CourseRepository;

@Service
public class CourseService {
	private final CourseRepository courseRepository;
	
	public CourseService(CourseRepository courseRepository) {
		super();
		this.courseRepository = courseRepository;
	}

}
