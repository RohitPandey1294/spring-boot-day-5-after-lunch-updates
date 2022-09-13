package com.hrportal.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrportal.main.domain.ApplicantDetails;
import com.hrportal.main.repository.ApplicantDetailsReposirtoryInterface;

@Service
public class ApplicantDetailsServiceIMPL implements ApplicantDetailsServiceInterface {
	@Autowired
	private ApplicantDetailsReposirtoryInterface applicantDetailsReposirtoryInterface;

	@Override
	public boolean addNewApplicantByJobId(ApplicantDetails applicantDetails) {

		return applicantDetailsReposirtoryInterface.addNewApplicantByJobId(applicantDetails);
	}

	@Override
	public List<ApplicantDetails> getAllApplicantDetails() {

		return applicantDetailsReposirtoryInterface.getAllApplicantDetails();
	}

	@Override
	public List<ApplicantDetails> getApplicantDetailForHrByJobId(String jobId) {

		return applicantDetailsReposirtoryInterface.getApplicantDetailForHrByJobId(jobId);
	}

	@Override
	public ApplicantDetails updateApplicantStatusByHrForPmByApplicantId(ApplicantDetails applicantDetails) {
		// TODO Auto-generated method stub
		return applicantDetailsReposirtoryInterface.updateApplicantStatusByHrForPmByApplicantId(applicantDetails);
	}

	@Override
	public ApplicantDetails updateApplicantStatusByHrForInterviewByApplicantId(ApplicantDetails applicantDetails) {
		// TODO Auto-generated method stub
		return applicantDetailsReposirtoryInterface
				.updateApplicantStatusByHrForInterviewByApplicantId(applicantDetails);
	}

	@Override
	public ApplicantDetails updateApplicantStatusByHrForOfferLetter(ApplicantDetails applicantDetails) {
		// TODO Auto-generated method stub
		return applicantDetailsReposirtoryInterface
				.updateApplicantStatusByHrForInterviewByApplicantId(applicantDetails);
	}

	@Override
	public List<ApplicantDetails> getAllApplicantDetailsForOfferLetterByStatus() {
		// TODO Auto-generated method stub
		return applicantDetailsReposirtoryInterface.getAllApplicantDetailsForOfferLetterByStatus();
	}

}
