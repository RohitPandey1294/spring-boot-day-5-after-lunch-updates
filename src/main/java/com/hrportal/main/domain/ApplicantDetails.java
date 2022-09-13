package com.hrportal.main.domain;

import java.time.LocalDate;
import java.util.Objects;

public class ApplicantDetails {
	private String applicantId;
	private String applicantFirstName;
	private String applicantLastName;
	private DocumentsDetails documentsDetails;
	private JobDescription jobDescription;
	private String highestQualification;
	private String technicalskills1;
	private String technicalskills2;
	private String technicalskills3;
	private String gender;
	private String contactNo;
	private LocalDate dateOfBirth;
	private LocalDate passout;
	private String status;
	
	public ApplicantDetails() {
		// TODO Auto-generated constructor stub
	}
	
	public ApplicantDetails(String applicantId, String applicantFirstName, String applicantLastName,
			DocumentsDetails documentsDetails, JobDescription jobDescription, String highestQualification,
			String technicalskills1, String technicalskills2, String technicalskills3, String gender, String contactNo,
			LocalDate dateOfBirth, LocalDate passout, String status) {
		super();
		this.applicantId = applicantId;
		this.applicantFirstName = applicantFirstName;
		this.applicantLastName = applicantLastName;
		this.documentsDetails = documentsDetails;
		this.jobDescription = jobDescription;
		this.highestQualification = highestQualification;
		this.technicalskills1 = technicalskills1;
		this.technicalskills2 = technicalskills2;
		this.technicalskills3 = technicalskills3;
		this.gender = gender;
		this.contactNo = contactNo;
		this.dateOfBirth = dateOfBirth;
		this.passout = passout;
		this.status = status;
	}

	public String getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(String applicantId) {
		this.applicantId = applicantId;
	}

	public String getApplicantFirstName() {
		return applicantFirstName;
	}

	public void setApplicantFirstName(String applicantFirstName) {
		this.applicantFirstName = applicantFirstName;
	}

	public String getApplicantLastName() {
		return applicantLastName;
	}

	public void setApplicantLastName(String applicantLastName) {
		this.applicantLastName = applicantLastName;
	}

	public DocumentsDetails getDocumentsDetails() {
		return documentsDetails;
	}

	public void setDocumentsDetails(DocumentsDetails documentsDetails) {
		this.documentsDetails = documentsDetails;
	}

	public JobDescription getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(JobDescription jobDescription) {
		this.jobDescription = jobDescription;
	}

	public String getHighestQualification() {
		return highestQualification;
	}

	public void setHighestQualification(String highestQualification) {
		this.highestQualification = highestQualification;
	}

	public String getTechnicalskills1() {
		return technicalskills1;
	}

	public void setTechnicalskills1(String technicalskills1) {
		this.technicalskills1 = technicalskills1;
	}

	public String getTechnicalskills2() {
		return technicalskills2;
	}

	public void setTechnicalskills2(String technicalskills2) {
		this.technicalskills2 = technicalskills2;
	}

	public String getTechnicalskills3() {
		return technicalskills3;
	}

	public void setTechnicalskills3(String technicalskills3) {
		this.technicalskills3 = technicalskills3;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public LocalDate getPassout() {
		return passout;
	}

	public void setPassout(LocalDate passout) {
		this.passout = passout;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ApplicantDetails [applicantId=" + applicantId + ", applicantFirstName=" + applicantFirstName
				+ ", applicantLastName=" + applicantLastName + ", documentsDetails=" + documentsDetails
				+ ", jobDescription=" + jobDescription + ", highestQualification=" + highestQualification
				+ ", technicalskills1=" + technicalskills1 + ", technicalskills2=" + technicalskills2
				+ ", technicalskills3=" + technicalskills3 + ", gender=" + gender + ", contactNo=" + contactNo
				+ ", dateOfBirth=" + dateOfBirth + ", passout=" + passout + ", status=" + status + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(applicantFirstName, applicantId, applicantLastName, contactNo, dateOfBirth,
				documentsDetails, gender, highestQualification, jobDescription, passout, status, technicalskills1,
				technicalskills2, technicalskills3);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ApplicantDetails other = (ApplicantDetails) obj;
		return Objects.equals(applicantFirstName, other.applicantFirstName)
				&& Objects.equals(applicantId, other.applicantId)
				&& Objects.equals(applicantLastName, other.applicantLastName)
				&& Objects.equals(contactNo, other.contactNo) && Objects.equals(dateOfBirth, other.dateOfBirth)
				&& Objects.equals(documentsDetails, other.documentsDetails) && Objects.equals(gender, other.gender)
				&& Objects.equals(highestQualification, other.highestQualification)
				&& Objects.equals(jobDescription, other.jobDescription) && Objects.equals(passout, other.passout)
				&& Objects.equals(status, other.status) && Objects.equals(technicalskills1, other.technicalskills1)
				&& Objects.equals(technicalskills2, other.technicalskills2)
				&& Objects.equals(technicalskills3, other.technicalskills3);
	}
	
	
	
	
}
