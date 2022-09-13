package com.hrportal.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hrportal.main.domain.ApplicantDetails;
import com.hrportal.main.domain.EmployeeDetails;
import com.hrportal.main.domain.Interview;

public class InterviewRowMapper implements RowMapper<Interview> {

	@Override
	public Interview mapRow(ResultSet rs, int rowNum) throws SQLException {

		EmployeeDetails employeeDetails = new EmployeeDetails();
		employeeDetails.setEmployeeId(rs.getString("employee_id"));

		ApplicantDetails applicantDetails = new ApplicantDetails();
		applicantDetails.setApplicantId(rs.getString("applicant_id"));

		Interview interview = new Interview();

		interview.setInterviewNo(rs.getInt("interview_no"));
		interview.setEmployeeDetails(employeeDetails);
		interview.setApplicantDetails(applicantDetails);
		interview.setTechnicalRound1(rs.getString("technical_round_1"));
		interview.setTechnicalRound2(rs.getString("technical_round_2"));
		interview.setHrRound3(rs.getString("hr_round_3"));
		interview.setFeedback(rs.getString("feedback"));

		return interview;
	}

}
