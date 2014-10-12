package mx.devhive.rutamx.rest.resource;

import java.net.URI;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.json.JSONObject;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Component
@Path("validate")
public class ValidateLocationResource {

	private static final String MAPPIR_BASE_URL = "http://ttr.sct.gob.mx/TTR";
	private static final String MAPPIR_VALIDATE_LOCATION = "/rest/GeoValidateSvt";
	private static final String MAPPIR_SERVICE_USR = "sct";
	private static final String MAPPIR_SERVICE_KEY = "sct";
	
	@GET
	@Path("{lat}/{lng}")
	@Produces(MediaType.APPLICATION_JSON)
	public String validateLocation(@PathParam("lat")double lat, @PathParam("lng")double lng){
		RestTemplate restTemplate = new RestTemplate();
		
		URI targetUrl= UriComponentsBuilder.fromUriString(MAPPIR_BASE_URL)
			    .path(MAPPIR_VALIDATE_LOCATION)
			    .queryParam("usr", MAPPIR_SERVICE_USR)
			    .queryParam("key", MAPPIR_SERVICE_KEY)
			    .queryParam("x", lng)
			    .queryParam("y", lat)
			    .build()
			    .toUri();
		JSONObject pulp = new JSONObject(restTemplate.getForObject(targetUrl, String.class));
		
		return pulp.toString();
	}
}
