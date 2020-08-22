package com.conseres.ws.soap.config;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.conseres.ws.soap.endpoints.OperacionesWS;

@Configuration
public class WebServiceConfig {
	
	//Este Bus se crea en tiempo de ejecución para nosotros
	@Autowired
	private Bus bus;
	
	
	@Bean
	public Endpoint operacionesEndpoint() {
		Endpoint endpoint = new EndpointImpl(bus, new OperacionesWS());
		endpoint.publish("/operaciones");
		return endpoint;
	}
	

}
																																																																																																