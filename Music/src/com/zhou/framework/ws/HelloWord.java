package com.zhou.framework.ws;

import javax.jws.WebService;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.zhou.framework.ws.impl.Employee;


@WebService
@Path("/ws")
public interface HelloWord {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("helloWord/say")
	public String say();
	
	@GET
	//@Produces(MediaType.APPLICATION_XML)
	@Produces("application/json")
	@Consumes("application/json")
	@Path("helloWord/get")
	public Employee get();
}
