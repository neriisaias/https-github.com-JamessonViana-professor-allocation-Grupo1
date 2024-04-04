package com.projet.professor.allocation.grupoJava.entity;

import java.sql.Time;
import java.time.DayOfWeek;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Allocation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
//	@Column(nullable = false)
//	@Enumerated(EnumType.STRING)
//	private DayOfWeek day;

	// Cuidado com esse nome de coluna ("start"), tem banco que não aceitaria
	@Column(nullable = false)
	private Time start;

	// Cuidado com esse nome de coluna ("end"), tem banco que não aceitaria
	@Column(nullable = false)
	private Time end;
	
	@ManyToOne(optional = false)
	@JoinColumn(nullable = false)
	private Professor professor;
	
	@ManyToOne(optional = false)
	@JoinColumn(nullable = false)
	private Course course;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "day", nullable = false)
	private DayOfWeek day;
	
	// Copiou e não apagou
////	@Schema(example = "19:00:00", type = "string")
//	@Column(name = "startHour", nullable = false)
//	private Time startHour;
//
////	@Schema(example = "22:00:00", type = "string")
//	@Column(name = "endHour", nullable = false)
//	private Time endHour;

	public Allocation() {

	}

	public Allocation(Long id, DayOfWeek day, Time start, Time end) {
		this.id = id;
		this.day = day;
		this.start = start;
		this.end = end;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public DayOfWeek getDay() {
		return day;
	}

	public void setDay(DayOfWeek day) {
		this.day = day;
	}

	public Time getStart() {
		return start;
	}

	public void setStart(Time start) {
		this.start = start;
	}

	public Time getEnd() {
		return end;
	}

	public void setEnd(Time end) {
		this.end = end;
	}
	
	public Professor getProfessor() {
		return professor;
	}
	
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	// Isso aqui eu nem expliquei
//	public void setProfessorId(Long id) {
//		Professor professor = new Professor();
//		professor.setId(id);
//		this.setProfessor(professor);
//	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	// Isso aqui eu nem expliquei
//	public void setCourseId(Long id) {
//		Course course = new Course();
//		course.setId(id);
//		this.setCourse(course);
//	}
	
	// Copiou e não apagou
//	public DayOfWeek getDayOfWeek() {
//		return day;
//	}
//	public Time getStartHour() {
//		return startHour;
//	}
//
//	public void setStartHour(Time startHour) {
//		this.startHour = startHour;
//	}
//
//	public Time getEndHour() {
//		return endHour;
//	}
//
//	public void setEndHour(Time endHour) {
//		this.endHour = endHour;
//	}

	@Override
	public String toString() {
		return "Allocation [id=" + id + ", start=" + start + ", end=" + end + ", professor=" + professor + ", course="
				+ course + ", day=" + day + "]";
	}
	 
}