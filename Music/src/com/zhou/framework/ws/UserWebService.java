package com.zhou.framework.ws;

import javax.jws.WebService;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.zhou.framework.pojo.User;

@WebService
@Path("/")
public interface UserWebService {

	@Path("/login/{name}/{password}")
	@GET
	//@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	User login(@PathParam("name") String name,@PathParam("password") String password);

	@Path("/register")
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes({MediaType.TEXT_XML, MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	void register(User user);

	@GET
	@Path("/test")
	@Produces(MediaType.TEXT_PLAIN)
	String test();
}
