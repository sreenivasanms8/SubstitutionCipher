package com.substitutioncipher.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.BeanPropertyRowMapper; 

import com.substitutioncipher.model.SubstitutionCipherMapping;

public class SubstitutionCipherDao {

	static JdbcTemplate template;
	
	public void setTemplate (JdbcTemplate template) {
		this.template = template;
	}
	
	public List<SubstitutionCipherMapping> getSubstitutionCipherMapping(){
		
		return template.query("Select * from substitutionciphermapping", new RowMapper<SubstitutionCipherMapping>() {

			@Override
			public SubstitutionCipherMapping mapRow(ResultSet rs, int rowNum) throws SQLException {
				SubstitutionCipherMapping SubCipherMap = new SubstitutionCipherMapping();
				SubCipherMap.setAlp1mapping(rs.getString(1));
				SubCipherMap.setAlp2mapping(rs.getString(2));
				SubCipherMap.setAlp3mapping(rs.getString(3));
				SubCipherMap.setAlp4mapping(rs.getString(4));
				SubCipherMap.setAlp5mapping(rs.getString(5));
				SubCipherMap.setAlp6mapping(rs.getString(6));
				SubCipherMap.setAlp7mapping(rs.getString(7));
				SubCipherMap.setAlp8mapping(rs.getString(8));
				SubCipherMap.setAlp9mapping(rs.getString(9));
				SubCipherMap.setAlp10mapping(rs.getString(10));
				SubCipherMap.setAlp11mapping(rs.getString(11));
				SubCipherMap.setAlp12mapping(rs.getString(12));
				SubCipherMap.setAlp13mapping(rs.getString(13));
				SubCipherMap.setAlp14mapping(rs.getString(14));
				SubCipherMap.setAlp15mapping(rs.getString(15));
				SubCipherMap.setAlp16mapping(rs.getString(16));
				SubCipherMap.setAlp17mapping(rs.getString(17));
				SubCipherMap.setAlp18mapping(rs.getString(18));
				SubCipherMap.setAlp19mapping(rs.getString(19));
				SubCipherMap.setAlp20mapping(rs.getString(20));
				SubCipherMap.setAlp21mapping(rs.getString(21));
				SubCipherMap.setAlp22mapping(rs.getString(22));
				SubCipherMap.setAlp23mapping(rs.getString(23));
				SubCipherMap.setAlp24mapping(rs.getString(24));
				SubCipherMap.setAlp25mapping(rs.getString(25));
				SubCipherMap.setAlp26mapping(rs.getString(26));
				
				return SubCipherMap;
			}

		}
		
	);
		
	}
		
}
