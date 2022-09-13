package com.hrportal.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrportal.main.domain.Interview;
import com.hrportal.main.repository.InterviewRepositoryInterface;

@Service
public class InterviewServiceIMPL implements InterviewServiceInterface {
	@Autowired
	private InterviewRepositoryInterface interviewRepositoryInterface;

	@Override
	public List<Interview> getAllInterview() {
		// TODO Auto-generated method stub
		return interviewRepositoryInterface.getAllInterview();
	}

	@Override
	public boolean addNewInterview(Interview interview) {

		return interviewRepositoryInterface.addNewInterview(interview);
	}

	@Override
	public Interview updateInterviewStatusSelectedByInterviewNo(Interview interview) {
		// TODO Auto-generated method stub
		return interviewRepositoryInterface.updateInterviewStatusSelectedByInterviewNo(interview);
	}

	@Override
	public List<Interview> getFromInterviewBySelectedStatus() {
		// TODO Auto-generated method stub
		return interviewRepositoryInterface.getFromInterviewBySelectedStatus();
	}

	@Override
	public List<Interview> getFromInterviewByRejectedStatus() {
		// TODO Auto-generated method stub
		return interviewRepositoryInterface.getFromInterviewByRejectedStatus();
	}

	@Override
	public List<Interview> getFromInterviewByEmployeeId(String employeeid) {
		// TODO Auto-generated method stub
		return interviewRepositoryInterface.getFromInterviewByEmployeeId(employeeid);
	}

}
