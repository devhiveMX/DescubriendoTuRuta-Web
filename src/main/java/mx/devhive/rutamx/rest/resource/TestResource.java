package mx.devhive.rutamx.rest.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

@Component
@Path("test")
public class TestResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String hello(){
		return "What's up?!";
	}
}
