package com.hrportal.main.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hrportal.main.domain.EmployeeDetails;

@Repository
public class EmployeeDetailsRepositoryIMPL implements EmployeeDetailsRepositoryInterface {
	private static final String GET_EMPLOYEE_DETAILS_BY_LOGIN_ID = "SELECT * FROM EMPLOYEE_DETAILS WHERE login_id=?";

	private static final String GET_EMPLOYEE_DETAILS_BY_JOBID_TECHNICALSKILLS = "select \r\n"
			+ "jd.job_id,jd.project_id as jd_project_id,jd.technical_skills_1,jd.technical_skills_2,jd.technical_skills_3,jd.required_candidates,jd.remaining_budget,jd.status,jd.employee_id as mgr_employee_id,\r\n"
			+ "ed.employee_id,ed.employee_first_name,ed.employee_last_name,ed.contact_no,ed.hiredate,ed.highest_qualification,ed.login_id,ed.gender,ed.date_of_birth,ed.salary,ed.ctc,ed.on_workbench,ed.designation,ed.reports_to,ed.technical_skills_1,ed.technical_skills_2,ed.technical_skills_3,ed.project_id\r\n"
			+ "from employee_details ed JOIN job_description jd\r\n" + "ON\r\n"
			+ "jd.technical_skills_1=ed.technical_skills_1 and\r\n"
			+ "jd.technical_skills_2=ed.technical_skills_2 and\r\n"
			+ "jd.technical_skills_3=ed.technical_skills_3 and\r\n" + "ed.project_id =100\r\n" + "and jd.job_id=?";

	private static final String UPDATE_EMPLOYEEDETAILS_BY_EMPLOYEEID = "UPDATE employee_details ed SET on_workbench='N',project_id=?,reports_to=? where ed.employee_id=?";

	private static final String GET_INTERVIEWER_BY_TECHNICAL_SKILLS = "select \r\n"
			+ "jd.job_id,jd.project_id,jd.technical_skills_1,jd.technical_skills_2,jd.technical_skills_3,jd.required_candidates,jd.remaining_budget,jd.status,jd.employee_id as mgr_employee_id,\r\n"
			+ "ed.employee_id,ed.employee_first_name,ed.employee_last_name,ed.contact_no,ed.hiredate,ed.highest_qualification,ed.login_id,ed.gender,ed.date_of_birth,ed.salary,ed.ctc,ed.on_workbench,ed.designation,ed.reports_to,ed.technical_skills_1,ed.technical_skills_2,ed.technical_skills_3,ed.project_id\r\n"
			+ "from employee_details ed JOIN job_description jd\r\n" + "ON\r\n"
			+ "jd.technical_skills_1=ed.technical_skills_1 and\r\n"
			+ "jd.technical_skills_2=ed.technical_skills_2 and\r\n"
			+ "jd.technical_skills_3=ed.technical_skills_3 and\r\n" + "ed.designation ='Interviewer'\r\n"
			+ "and jd.job_id=?";

//	private static final String INSERT_NEW_EMPLOYEE="insert into employee_details (employee_id,employee_first_name,employee_last_name ,project_id ,login_id ,\r\n"
//			+ "contact_no ,hiredate ,highest_qualification ,gender ,date_of_birth ,salary ,CTC ,on_workbench ,technical_skills_1 ,\r\n"
//			+ "technical_skills_2 ,technical_skills_3 ,designation ,reports_to ) \r\n"
//			+ "VALUES('MGS'||employee_id_seq.NEXTVAL,?,?,?,?,?,?,?,'Employee','null'\r\n"
//			+ ",?,?,'Y',?,?,?,?,?)";
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public EmployeeDetails getEmployeeDetailsByloginId(String loginId) {
//		System.out.println(loginId);
		EmployeeDetails employeeDetails = jdbcTemplate.queryForObject(GET_EMPLOYEE_DETAILS_BY_LOGIN_ID,
				new EmployeeDetailsRowMapper(), loginId);
		return employeeDetails;
	}

	@Override
	public List<EmployeeDetails> getEmployeeDetailsByJobIdAndTechSkills(String jobId) {
		return this.jdbcTemplate.query(GET_EMPLOYEE_DETAILS_BY_JOBID_TECHNICALSKILLS, new EmployeeDetailsRowMapper(),
				jobId);

	}

	@Override
	public EmployeeDetails updateEmployeeDetailsByEmployeeId(EmployeeDetails employeeDetails) {
		this.jdbcTemplate.update(UPDATE_EMPLOYEEDETAILS_BY_EMPLOYEEID,
				employeeDetails.getProjectDetails().getProjectId(), employeeDetails.getReportsto(),
				employeeDetails.getEmployeeId());
		return employeeDetails;
	}

	@Override
	public List<EmployeeDetails> getInterviewerByTechnicalSkills(String jobId) {
		
		return this.jdbcTemplate.query(GET_INTERVIEWER_BY_TECHNICAL_SKILLS, new EmployeeDetailsRowMapper(), jobId);
	}

	@Override
	public boolean addNewEmployee(EmployeeDetails employeeDetails) {
		// TODO Auto-generated method stub
		return false;
	}

}
