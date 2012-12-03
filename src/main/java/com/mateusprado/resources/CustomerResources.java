package com.mateusprado.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("customer")
public class CustomerResources {
	
	
	@Path("/find")
	@GET
	public String find() {
		
		return "entries";
	}

}
