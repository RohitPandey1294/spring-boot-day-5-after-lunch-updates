package com.hrportal.main.service;

import java.util.List;

import com.hrportal.main.domain.ApplicantDetails;

public interface ApplicantDetailsServiceInterface {
	public boolean addNewApplicantByJobId(ApplicantDetails applicantDetails);

	public List<ApplicantDetails> getAllApplicantDetails();

	public List<ApplicantDetails> getApplicantDetailForHrByJobId(String jobId);

	public ApplicantDetails updateApplicantStatusByHrForPmByApplicantId(ApplicantDetails applicantDetails);

	public ApplicantDetails updateApplicantStatusByHrForInterviewByApplicantId(ApplicantDetails applicantDetails);
	
	public ApplicantDetails updateApplicantStatusByHrForOfferLetter(ApplicantDetails applicantDetails);
	
	public List<ApplicantDetails> getAllApplicantDetailsForOfferLetterByStatus();


}
