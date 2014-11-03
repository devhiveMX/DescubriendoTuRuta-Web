package mx.devhive.rutamx.rest.resource;

import java.net.URI;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Component
@Path("createIncident")
public class CreateIncident {
	
	@GET
	@Path("{user},{description},{share},{type},{latsrc},{lngsrc}")
	@Produces(MediaType.APPLICATION_JSON)
	public String createIncident(
				@PathParam("user")String user, @PathParam("description")String description, @PathParam("share")String share, @PathParam("type")String type, @PathParam("latsrc")double latSource, @PathParam("lngsrc")double lngSource
			){
		JSONArray incidentArray = new JSONArray();
		JSONObject incident = new JSONObject();
		incident.put("result", "0");
		return incident.toString();
	}
}