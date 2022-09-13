package com.hrportal.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrportal.main.domain.JobDescription;
import com.hrportal.main.repository.JobDescriptionRepositoryInterface;

@Service
public class JobDescriptionServiceIMPL implements JobDescriptionServiceInterface {
	@Autowired
	private JobDescriptionRepositoryInterface jobDescriptionRepositoryInterface;

	@Override
	public List<JobDescription> getallJobDescriptionDetails() {

		return jobDescriptionRepositoryInterface.getallJobDescriptionDetails();
	}

	@Override
	public List<JobDescription> getJobDescriptionByEmployeeId(String employeeId) {

		return jobDescriptionRepositoryInterface.getJobDescriptionByEmployeeId(employeeId);
	}

	@Override
	public boolean addNewJobDescription(JobDescription jobdescription) {
		// TODO Auto-generated method stub
		System.out.println("in serrvice");
		return jobDescriptionRepositoryInterface.addNewJobDescription(jobdescription);
	}

	@Override
	public List<JobDescription> getJobDescriptionByProjectId(String projectId) {
		// TODO Auto-generated method stub
		return jobDescriptionRepositoryInterface.getJobDescriptionByProjectId(projectId);
	}

	@Override
	public JobDescription updateRequiredCandidatesByJobId(JobDescription jobDescription) {

		return jobDescriptionRepositoryInterface.updateRequiredCandidatesByJobId(jobDescription);
	}

	@Override
	public JobDescription updateStatusByJobId(JobDescription jobDescription) {
		// TODO Auto-generated method stub
		return jobDescriptionRepositoryInterface.updateStatusByJobId(jobDescription);
	}

	@Override
	public JobDescription updateStatusForHrByJobId(JobDescription jobDescription) {
		// TODO Auto-generated method stub
		return jobDescriptionRepositoryInterface.updateStatusForHrByJobId(jobDescription);
	}

	@Override
	public List<JobDescription> getJobDescriptionForHrByProjectId(String projectId) {
		// TODO Auto-generated method stub
		return jobDescriptionRepositoryInterface.getJobDescriptionForHrByProjectId(projectId);
	}

	@Override
	public JobDescription getJobByJobId(String jobId) {
		// TODO Auto-generated method stub
		return jobDescriptionRepositoryInterface.getJobByJobId(jobId);
	}

	@Override
	public JobDescription updateStatusForPmByJobId(JobDescription jobDescription) {
		// TODO Auto-generated method stub
		return jobDescriptionRepositoryInterface.updateStatusForPmByJobId(jobDescription);
	}

	@Override
	public List<JobDescription> getJobDescriptionForCareers() {
		// TODO Auto-generated method stub
		return jobDescriptionRepositoryInterface.getJobDescriptionForCareers();
	}

	@Override
	public JobDescription updateStatusByHrForCarrersByJobId(JobDescription jobDescription) {
		// TODO Auto-generated method stub
		return jobDescriptionRepositoryInterface.updateStatusByHrForCarrersByJobId(jobDescription);
	}

}
