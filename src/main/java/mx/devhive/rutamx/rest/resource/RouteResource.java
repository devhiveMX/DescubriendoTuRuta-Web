package mx.devhive.rutamx.rest.resource;

import java.net.URI;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Component
@Path("route")
public class RouteResource {

	@Value("${mappir.service.usr}")
	private String mappirUser;
	@Value("${mappir.service.key}")
	private String mappirKey;

	@Value("${mappir.rest.base_url}")
	private String mappirBaseUrl;
	@Value("${mappir.rest.urls.route}")
	private String mappirRouteUrl;

	@POST
	@Path("{latsrc},{lngsrc}")
	@Produces(MediaType.APPLICATION_JSON)
	public String routeGenerator(
				@PathParam("latsrc")double latSource, @PathParam("lngsrc")double lngSource,
				@RequestBody String destinationJson
			){
		JSONArray destinations = new JSONArray(destinationJson);
		RestTemplate restTemplate = new RestTemplate();

		JSONObject json = new JSONObject("{\"usr\":\"sct\",\"key\":\"sct\",\"opciones\":{\"casetas\":true,\"alertas\":true},\"vehiculo\":{\"tipo\":1,\"subtipo\":1,\"rendimiento\":16,\"combustible\":3,\"costoltgas\":\"12.80\",\"excedente\":\"0\"},\"ruta\":2}");
		
		json.put("origen", new JSONObject(
					String.format("{\"x\":%f,\"y\":%f}", lngSource, latSource)
				));
		
		json.put("destinos", new JSONArray());
		
		for(int i=0; i<destinations.length(); i++){
			JSONObject destination = destinations.getJSONObject(i);
			
			json.getJSONArray("destinos")
				.put(new JSONObject(
						String.format("{\"x\":%f,\"y\":%f}", destination.getDouble("lng"), 
								destination.getDouble("lat"))
					));
		}
		
		URI targetUrl= UriComponentsBuilder.fromUriString(mappirBaseUrl)
			    .path(mappirRouteUrl)
			    .queryParam("usr", mappirUser)
			    .queryParam("key", mappirKey)
			    .queryParam("json", json.toString())
			    .build()
			    .toUri();
		JSONObject pulp = new JSONObject(restTemplate.getForObject(targetUrl, String.class));
		
		return pulp.toString();
	}
}
