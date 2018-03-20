package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	private Enrollment() {
		
	}
	
	public Enrollment(UUID StudentID, UUID SectionID) {
		UUID EnrollmentID = this.EnrollmentID;
		
		this.StudentID = StudentID;
		this.SectionID = SectionID;
		
	}

	public void setGrade(double grade) {
		Grade = grade;
	}
	
	

}
