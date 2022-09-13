package com.hrportal.main.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hrportal.main.domain.Interview;

@Repository
public class InterviewRepositoryIMPL implements InterviewRepositoryInterface {

	private static final String SELECT_ALL_INTERVIEW = "select * from interview";
	
	private static final String GET_FROM_INTERVIEW_BY_EMPLOYEE_ID="select * from interview WHERE employee_id=?";
	

	private static final String INSERT_NEW_INTERVIEW = "INSERT INTO INTERVIEW (interview_no,employee_id,applicant_id,status) \r\n"
			+ "VALUES(interview_no_seq.NEXTVAL,?,?,'for interview')";

	private static final String UPDATE_INTERVIEW_STATUS_SELECTED_BY_INTERVIEW_NO = "update interview set status=?,technical_round_1=?,technical_round_2=?,hr_round_3=?,feedback=? where interview_no=?";

	private static final String GET_FROM_INTERVIEW_BY_SELECTED_STATUS = "select * from interview where status='selected'";

	private static final String GET_FROM_INTERVIEW_BY_REJECTED_STATUS = "select * from interview where status='rejected'";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Interview> getAllInterview() {
		List<Interview> allinterviewer = jdbcTemplate.query(SELECT_ALL_INTERVIEW, new InterviewRowMapper());
		return allinterviewer;
	}

	@Override
	public boolean addNewInterview(Interview interview) {
		Object[] params = { interview.getEmployeeDetails().getEmployeeId(),
				interview.getApplicantDetails().getApplicantId() };
		int result = jdbcTemplate.update(INSERT_NEW_INTERVIEW, params);
		if (result > 0) {
			return true;
		}
		return false;
	}

	@Override
	public Interview updateInterviewStatusSelectedByInterviewNo(Interview interview) {
		System.out.println(interview);
		Object[] params = { interview.getStatus(), interview.getTechnicalRound1(), interview.getTechnicalRound2(),
				interview.getHrRound3(), interview.getFeedback(), interview.getInterviewNo() };
		this.jdbcTemplate.update(UPDATE_INTERVIEW_STATUS_SELECTED_BY_INTERVIEW_NO, params);
		return interview;
	}

	@Override
	public List<Interview> getFromInterviewBySelectedStatus() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(GET_FROM_INTERVIEW_BY_SELECTED_STATUS, new InterviewRowMapper());
	}

	@Override
	public List<Interview> getFromInterviewByRejectedStatus() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(GET_FROM_INTERVIEW_BY_REJECTED_STATUS, new InterviewRowMapper());
	}

	@Override
	public List<Interview> getFromInterviewByEmployeeId(String employeeid) {
		List<Interview> interviewer=jdbcTemplate.query(GET_FROM_INTERVIEW_BY_EMPLOYEE_ID, new InterviewRowMapper(), employeeid);
		return interviewer;
	}

}
