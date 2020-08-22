package com.conseres.ws.soap.endpoints;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.apache.cxf.feature.Features;

@WebService
@Features(features="org.apache.cxf.feature.LoggingFeature")
public class OperacionesWS {
	
	@WebMethod(action="suma")
	public Double suma(@WebParam(name="x") Double x,@WebParam(name="y") Double y) {
		return x+y;
	}
	
	@WebMethod(action="resta")
	public Double resta(@WebParam(name="x") Double x,@WebParam(name="y") Double y) {
		return x-y;
	}
	
	@WebMethod(action="multiplicacion")
	public Double multiplicacion(@WebParam(name="x") Double x,@WebParam(name="y") Double y) {
		return x*y;
	}
	
	@WebMethod(action="division")
	public Double division(@WebParam(name="x") Double x,@WebParam(name="y") Double y) {
		Double result = 0D;
		if(x>=y)
			result = x/y;
		
		return result;
	}

}
