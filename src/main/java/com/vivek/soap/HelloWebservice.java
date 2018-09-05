package com.vivek.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HelloWebservice{

	@WebMethod
	public String hello()
	{
		return "Hi hello ";
	}
	
	@WebMethod
	public int add()
	{
		return 5+10;
	}
	
	@WebMethod
	public int multiply()
	{
		return 5*10;
	}

	}
