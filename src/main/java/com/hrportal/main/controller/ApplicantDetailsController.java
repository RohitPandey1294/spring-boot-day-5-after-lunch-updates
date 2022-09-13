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

import com.hrportal.main.domain.ApplicantDetails;
import com.hrportal.main.service.ApplicantDetailsServiceInterface;

@CrossOrigin("*")
@RestController
@RequestMapping("applicantdetailsapi")
public class ApplicantDetailsController {

	@Autowired
	private ApplicantDetailsServiceInterface applicantDetailsServiceInterface;

	@RequestMapping(value = "applicantdetails", method = RequestMethod.POST)
	public boolean addNewApplicantByJobId(@RequestBody ApplicantDetails applicantDetails) {
		System.out.println(applicantDetails);
		return applicantDetailsServiceInterface.addNewApplicantByJobId(applicantDetails);
	}

	@RequestMapping(value = "applicantdetails/all", method = RequestMethod.GET)
	public List<ApplicantDetails> getAllApplicantDetails() {
		return applicantDetailsServiceInterface.getAllApplicantDetails();
	}

	@RequestMapping(value = "applicantdetails/hr/{jobId}", method = RequestMethod.GET)
	public @ResponseBody List<ApplicantDetails> getApplicantDetailForHrByJobId(@PathVariable("jobId") String jobId) {
		return applicantDetailsServiceInterface.getApplicantDetailForHrByJobId(jobId);
	}

	@RequestMapping(value = "applicantdetails/hr/pm/status", method = RequestMethod.PUT)
	public @ResponseBody ApplicantDetails updateApplicantStatusByHrForPmByApplicantId(
			@RequestBody ApplicantDetails applicantDetails) {
		return applicantDetailsServiceInterface.updateApplicantStatusByHrForPmByApplicantId(applicantDetails);
	}

	@RequestMapping(value = "applicantdetails/hr/interview/status", method = RequestMethod.PUT)
	public @ResponseBody ApplicantDetails updateApplicantStatusByHrForInterviewByApplicantId(
			@RequestBody ApplicantDetails applicantDetails) {
		return applicantDetailsServiceInterface.updateApplicantStatusByHrForInterviewByApplicantId(applicantDetails);
	}

	@RequestMapping(value = "applicantdetails/hr/offerletter/status", method = RequestMethod.PUT)
	public @ResponseBody ApplicantDetails updateApplicantStatusByHrForOfferLetter(
			@RequestBody ApplicantDetails applicantDetails) {
		return applicantDetailsServiceInterface.updateApplicantStatusByHrForOfferLetter(applicantDetails);
	}

	@RequestMapping(value = "applicantdetails/interview/offerletter/status", method = RequestMethod.GET)
	public List<ApplicantDetails> getAllApplicantDetailsForOfferLetterByStatus() {
		return applicantDetailsServiceInterface.getAllApplicantDetailsForOfferLetterByStatus();
	}
}
