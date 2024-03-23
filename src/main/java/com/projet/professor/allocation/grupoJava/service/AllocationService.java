package com.projet.professor.allocation.grupoJava.service;

import org.springframework.stereotype.Service;

import com.projet.professor.allocation.grupoJava.repository.AllocationRepository;

@Service
public class AllocationService {
	private final AllocationRepository allocationRepository;
	private final ProfessorService professorService;
	private final CourseService courseService;
	
	public AllocationService(AllocationRepository allocationRepository, ProfessorService professorService,
			CourseService courseService) {
		super();
		this.allocationRepository = allocationRepository;
		this.professorService = professorService;
		this.courseService = courseService;
	}
	
	
}
