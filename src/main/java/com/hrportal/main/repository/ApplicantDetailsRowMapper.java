package com.hrportal.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hrportal.main.domain.ApplicantDetails;
import com.hrportal.main.domain.DocumentsDetails;
import com.hrportal.main.domain.JobDescription;

public class ApplicantDetailsRowMapper implements RowMapper<ApplicantDetails> {

	@Override
	public ApplicantDetails mapRow(ResultSet rs, int rowNum) throws SQLException {

		DocumentsDetails documentsDetails = new DocumentsDetails();
		documentsDetails.setDocId(rs.getString("doc_id"));

		JobDescription jobDescription = new JobDescription();
		jobDescription.setJobId(rs.getString("job_id"));

		ApplicantDetails applicantDetails = new ApplicantDetails();

		applicantDetails.setApplicantId(rs.getString("applicant_id"));
		applicantDetails.setApplicantFirstName(rs.getString("applicant_first_name"));
		applicantDetails.setApplicantLastName(rs.getString("applicant_last_name"));
		applicantDetails.setDocumentsDetails(documentsDetails);
		applicantDetails.setJobDescription(jobDescription);
		applicantDetails.setHighestQualification(rs.getString("highest_qualification"));
		applicantDetails.setTechnicalskills1(rs.getString("technical_skills_1"));
		applicantDetails.setTechnicalskills2(rs.getString("technical_skills_2"));
		applicantDetails.setTechnicalskills3(rs.getString("technical_skills_3"));
		applicantDetails.setGender(rs.getString("gender"));
		applicantDetails.setContactNo(rs.getString("contact_no"));
		applicantDetails.setDateOfBirth(rs.getDate("date_of_birth").toLocalDate());
		applicantDetails.setPassout(rs.getDate("passout").toLocalDate());
		applicantDetails.setStatus(rs.getString("status"));

		return applicantDetails;
	}

}
