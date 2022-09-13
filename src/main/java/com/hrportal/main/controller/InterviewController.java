package com.hrportal.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hrportal.main.domain.Interview;
import com.hrportal.main.service.InterviewServiceInterface;

@CrossOrigin("*")
@RestController
@RequestMapping("interviewapi")

public class InterviewController {
	@Autowired
	private InterviewServiceInterface interviewServiceInterface;

	@RequestMapping(value = "interview/all", method = RequestMethod.GET)
	public List<Interview> getAllInterview() {

		return interviewServiceInterface.getAllInterview();
	}

	@RequestMapping(value = "interview/add", method = RequestMethod.POST)
	public boolean addNewInterview(@RequestBody Interview interview) {
		return interviewServiceInterface.addNewInterview(interview);
	}

	@RequestMapping(value = "interview/interviewer/status", method = RequestMethod.PUT)
	public @ResponseBody Interview updateInterviewStatusSelectedByInterviewNo(@RequestBody Interview interview) {

		return interviewServiceInterface.updateInterviewStatusSelectedByInterviewNo(interview);
	}

	@RequestMapping(value = "interview/rejected", method = RequestMethod.GET)
	public List<Interview> getFromInterviewByRejectedStatus() {

		return interviewServiceInterface.getFromInterviewByRejectedStatus();
	}

	@RequestMapping(value = "interview/selected", method = RequestMethod.GET)
	public List<Interview> getFromInterviewBySelectedStatus() {

		return interviewServiceInterface.getFromInterviewBySelectedStatus();
	}
	
	@RequestMapping(value = "interview/employeeid/{employeeid}", method = RequestMethod.GET)
	public List<Interview> getFromInterviewByEmployeeId(@PathVariable String employeeid) {

		return interviewServiceInterface.getFromInterviewByEmployeeId(employeeid);
	}

}
