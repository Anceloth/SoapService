package com.conseres.ws.soap.endpoints;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.apache.cxf.feature.Features;


@WebService 
 /** Esta anotación permite usar la clase LoggingFeature para hacer seguimiento 
 * a la ejecución del webservice en tiempo real 
 */
@Features(features="org.apache.cxf.feature.LoggingFeature") 
public class HelloWs {
	
	@WebMethod(action="hello")
	public String hello() {
		return "Hello";
	}
}
