package com.camunda.hospital.enrollment.utilities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class EnrollmentVerification {
	
	
	public boolean isDOBValid(String dob) {
		try {
			LocalDate.parse(dob,DateTimeFormatter.ofPattern("MM/dd/yyyy"));
		}catch (DateTimeParseException e) {
			return false;
		}
		return true;
	}
}
