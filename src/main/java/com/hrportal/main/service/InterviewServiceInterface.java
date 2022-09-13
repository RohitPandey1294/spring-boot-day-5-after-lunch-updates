package com.hrportal.main.service;

import java.util.List;

import com.hrportal.main.domain.ApplicantDetails;
import com.hrportal.main.domain.Interview;

public interface InterviewServiceInterface {

	public List<Interview> getAllInterview();

	public boolean addNewInterview(Interview interview);

	public Interview updateInterviewStatusSelectedByInterviewNo(Interview interview);

	public List<Interview> getFromInterviewBySelectedStatus();

	public List<Interview> getFromInterviewByRejectedStatus();
	
	public List<Interview> getFromInterviewByEmployeeId(String employeeid);

}
