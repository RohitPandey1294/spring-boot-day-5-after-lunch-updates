package com.hrportal.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hrportal.main.domain.DocumentsDetails;

public class DocumentsDetailsRowMapper implements RowMapper<DocumentsDetails> {

	@Override
	public DocumentsDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		DocumentsDetails documentsDetails=new DocumentsDetails();
		documentsDetails.setDocId(rs.getString("doc_id"));
		documentsDetails.setDocName(rs.getString("doc_name"));
		documentsDetails.setDocType(rs.getString("doc_type"));
		documentsDetails.setUploadedFile(rs.getBytes("uploaded_file"));
		
		return documentsDetails;
	}

}
