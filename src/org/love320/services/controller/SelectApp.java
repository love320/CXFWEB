package org.love320.services.controller;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface SelectApp {
	
	@WebMethod
	public String oneAction();
	
}
