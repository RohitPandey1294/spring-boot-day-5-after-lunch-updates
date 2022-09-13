package com.hrportal.main.domain;

import java.util.Objects;

public class Interview {
	private int interviewNo;
	private EmployeeDetails employeeDetails;
	private ApplicantDetails applicantDetails;
	private String status;
	private String technicalRound1;
	private String technicalRound2;
	private String hrRound3;
	private String feedback;

	public Interview() {
		// TODO Auto-generated constructor stub
	}

	public Interview(int interviewNo, EmployeeDetails employeeDetails, ApplicantDetails applicantDetails, String status,
			String technicalRound1, String technicalRound2, String hrRound3, String feedback) {
		super();
		this.interviewNo = interviewNo;
		this.employeeDetails = employeeDetails;
		this.applicantDetails = applicantDetails;
		this.status = status;
		this.technicalRound1 = technicalRound1;
		this.technicalRound2 = technicalRound2;
		this.hrRound3 = hrRound3;
		this.feedback = feedback;
	}

	public int getInterviewNo() {
		return interviewNo;
	}

	public void setInterviewNo(int interviewNo) {
		this.interviewNo = interviewNo;
	}

	public EmployeeDetails getEmployeeDetails() {
		return employeeDetails;
	}

	public void setEmployeeDetails(EmployeeDetails employeeDetails) {
		this.employeeDetails = employeeDetails;
	}

	public ApplicantDetails getApplicantDetails() {
		return applicantDetails;
	}

	public void setApplicantDetails(ApplicantDetails applicantDetails) {
		this.applicantDetails = applicantDetails;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTechnicalRound1() {
		return technicalRound1;
	}

	public void setTechnicalRound1(String technicalRound1) {
		this.technicalRound1 = technicalRound1;
	}

	public String getTechnicalRound2() {
		return technicalRound2;
	}

	public void setTechnicalRound2(String technicalRound2) {
		this.technicalRound2 = technicalRound2;
	}

	public String getHrRound3() {
		return hrRound3;
	}

	public void setHrRound3(String hrRound3) {
		this.hrRound3 = hrRound3;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	@Override
	public String toString() {
		return "Interview [interviewNo=" + interviewNo + ", employeeDetails=" + employeeDetails + ", applicantDetails="
				+ applicantDetails + ", status=" + status + ", technicalRound1=" + technicalRound1
				+ ", technicalRound2=" + technicalRound2 + ", hrRound3=" + hrRound3 + ", feedback=" + feedback + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(applicantDetails, employeeDetails, feedback, hrRound3, interviewNo, status, technicalRound1,
				technicalRound2);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Interview other = (Interview) obj;
		return Objects.equals(applicantDetails, other.applicantDetails)
				&& Objects.equals(employeeDetails, other.employeeDetails) && Objects.equals(feedback, other.feedback)
				&& Objects.equals(hrRound3, other.hrRound3) && interviewNo == other.interviewNo
				&& Objects.equals(status, other.status) && Objects.equals(technicalRound1, other.technicalRound1)
				&& Objects.equals(technicalRound2, other.technicalRound2);
	}

}
