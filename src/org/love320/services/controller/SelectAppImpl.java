package org.love320.services.controller;

import javax.jws.WebMethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class SelectAppImpl implements SelectApp {
	
	@Autowired
	private JdbcTemplate resJdbc;

	@Override
	@WebMethod
	public String oneAction() {
		
		return null;
	}

}
