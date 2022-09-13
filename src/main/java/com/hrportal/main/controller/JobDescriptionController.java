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

import com.hrportal.main.domain.JobDescription;
import com.hrportal.main.service.JobDescriptionServiceInterface;

@CrossOrigin("*")
@RestController
@RequestMapping("jobdescriptionapi")
public class JobDescriptionController {

	@Autowired
	private JobDescriptionServiceInterface jobDescriptionServiceInterface;

	@RequestMapping(value = "jobdescription", method = RequestMethod.GET)
	public List<JobDescription> getallJobDescriptionDetails() {
		return jobDescriptionServiceInterface.getallJobDescriptionDetails();
	}

	@RequestMapping(value = "jobdescription/jd/{employeeId}", method = RequestMethod.GET)
	public @ResponseBody List<JobDescription> getJobDescriptionByEmployeeId(
			@PathVariable("employeeId") String employeeId) {
		return jobDescriptionServiceInterface.getJobDescriptionByEmployeeId(employeeId);
	}

	@RequestMapping(value = "jobdescription", method = RequestMethod.POST)
	public boolean addNewJobDescription(@RequestBody JobDescription jobdescription) {
		System.out.println("jobDescriptionS");
		return jobDescriptionServiceInterface.addNewJobDescription(jobdescription);
	}

	@RequestMapping(value = "jobdescription/pm/{projectId}", method = RequestMethod.GET)
	public @ResponseBody List<JobDescription> getJobDescriptionByProjectId(
			@PathVariable("projectId") String projectId) {
		return jobDescriptionServiceInterface.getJobDescriptionByProjectId(projectId);
	}

	@RequestMapping(value = "jobdescription/pm/requiredcandidates", method = RequestMethod.PUT)
	public @ResponseBody JobDescription updateRequiredCandidatesByJobId(@RequestBody JobDescription jobDescription) {
		System.out.println(jobDescription);
		return jobDescriptionServiceInterface.updateRequiredCandidatesByJobId(jobDescription);
	}

	@RequestMapping(value = "jobdescription/pm/status", method = RequestMethod.PUT)
	public @ResponseBody JobDescription updateStatusByJobId(@RequestBody JobDescription jobDescription) {
		System.out.println(jobDescription);
		return jobDescriptionServiceInterface.updateStatusByJobId(jobDescription);
	}

	@RequestMapping(value = "jobdescription/hr/status", method = RequestMethod.PUT)
	public @ResponseBody JobDescription updateStatusByHrForJobId(@RequestBody JobDescription jobDescription) {
		System.out.println(jobDescription);
		return jobDescriptionServiceInterface.updateStatusForHrByJobId(jobDescription);
	}

	@RequestMapping(value = "jobdescription/hr/career/status", method = RequestMethod.PUT)
	public @ResponseBody JobDescription updateStatusByHrForCarrersByJobId(@RequestBody JobDescription jobDescription) {
		return jobDescriptionServiceInterface.updateStatusByHrForCarrersByJobId(jobDescription);
	}

	@RequestMapping(value = "jobdescription/hr/{projectId}", method = RequestMethod.GET)
	public @ResponseBody List<JobDescription> getJobDescriptionByForHrByProjectId(
			@PathVariable("projectId") String projectId) {
		return jobDescriptionServiceInterface.getJobDescriptionForHrByProjectId(projectId);
	}

	@RequestMapping(value = "jobdescription/pm/job/{jobId}", method = RequestMethod.GET)
	public @ResponseBody JobDescription getJobByJobId(@PathVariable String jobId) {
		return jobDescriptionServiceInterface.getJobByJobId(jobId);

	}

	@RequestMapping(value = "jobdescription/pm/statuschange", method = RequestMethod.PUT)
	public @ResponseBody JobDescription updateStatusForPmByJobId(@RequestBody JobDescription jobDescription) {
		System.out.println(jobDescription);
		return jobDescriptionServiceInterface.updateStatusForPmByJobId(jobDescription);
	}
	@RequestMapping(value = "jobdescription/careers", method = RequestMethod.GET)
	public List<JobDescription> getJobDescriptionForCareers(){
		return jobDescriptionServiceInterface.getJobDescriptionForCareers();
	}
	

}
