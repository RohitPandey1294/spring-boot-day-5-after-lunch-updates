package com.hrportal.main.repository;

import java.util.List;

import com.hrportal.main.domain.Interview;

public interface InterviewRepositoryInterface {

	public List<Interview> getAllInterview();

	public boolean addNewInterview(Interview interview);

	public Interview updateInterviewStatusSelectedByInterviewNo(Interview interview);

	public List<Interview> getFromInterviewBySelectedStatus();

	public List<Interview> getFromInterviewByRejectedStatus();
	
	public List<Interview> getFromInterviewByEmployeeId(String employeeid);

}
