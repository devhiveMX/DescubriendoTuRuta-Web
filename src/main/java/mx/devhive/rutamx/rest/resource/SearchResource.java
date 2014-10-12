package mx.devhive.rutamx.rest.resource;

import java.net.URI;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Component
@Path("search")
public class SearchResource {
	
	@Value("${mappir.service.usr}")
	private String mappirUser;
	@Value("${mappir.service.key}")
	private String mappirKey;
	@Value("${foursquare.service.client_id}")
	private String foursquareClientId;
	@Value("${foursquare.service.client_secret}")
	private String foursquareClientSecret;
	@Value("${google.places.service.key}")
	private String googlePlacesKey;
	
	@Value("${mappir.rest.base_url}")
	private String mappirBaseUrl;
	@Value("${mappir.rest.urls.search}")
	private String mappirSearchUrl;
	@Value("${foursquare.rest.base_url}")
	private String foursquareBaseUrl;
	@Value("${foursquare.rest.urls.search}")
	private String foursquareSearchUrl;
	@Value("${google.places.rest.base_url}")
	private String googlePlacesBaseUrl;
	@Value("${google.places.rest.urls.search}")
	private String googlePlacesSearchUrl;

	@GET
	@Path("{filter}")
	@Produces(MediaType.APPLICATION_JSON)
	public String search(@PathParam("filter") String filter, @QueryParam("4sq")String foursquareFlag,
			@QueryParam("gplaces")String googlePlacesFlag){
		boolean includeFoursquare = (foursquareFlag != null);
		boolean includeGooglePlaces = (googlePlacesFlag != null);
		
		JSONObject result = new JSONObject();
		
		result.put("mappir", searchMappir(filter));
		
		if(includeGooglePlaces)
			result.put("gplaces", searchGooglePlaces(filter));
		
		if(includeFoursquare)
			result.put("foursquare", searchFoursquare(filter));
		
		return result.toString();
	}
	
	private JSONArray searchMappir(String filter){
		RestTemplate restTemplate = new RestTemplate();
				
		URI targetUrl= UriComponentsBuilder.fromUriString(mappirBaseUrl)
			    .path(mappirSearchUrl)
			    .queryParam("usr", mappirUser)
			    .queryParam("key", mappirKey)
			    .queryParam("search", filter)
			    .build()
			    .toUri();
		JSONObject pulp = new JSONObject(restTemplate.getForObject(targetUrl, String.class));
		
		JSONArray results = pulp.getJSONArray("results");
		
		JSONArray foundPlaces = new JSONArray();
		
		for(int i=0; i<results.length(); i++){
			JSONObject category = results.getJSONObject(i);

			JSONArray items = category.getJSONArray("items");
			for(int j=0; j<items.length(); j++){
				JSONObject item = items.getJSONObject(j);
				
				JSONObject digestedPlace = new JSONObject();

				digestedPlace.put("service", "mappir");
				digestedPlace.put("type", new JSONArray());
				digestedPlace.getJSONArray("type").put(category.getString("categoria"));
				digestedPlace.put("name", item.getString("desc"));
				digestedPlace.put("location", new JSONObject());
				digestedPlace.getJSONObject("location").put("lat", item.getDouble("y"));
				digestedPlace.getJSONObject("location").put("lng", item.getDouble("x"));
				digestedPlace.put("data", new JSONObject());
				digestedPlace.getJSONObject("data").put("source", item.getLong("source"));
				digestedPlace.getJSONObject("data").put("target", item.getLong("target"));
				digestedPlace.getJSONObject("data").put("idTramo", item.getLong("idTramo"));
				
				foundPlaces.put(digestedPlace);
			}
		}
		
		return foundPlaces;
	}
	
	private JSONArray searchGooglePlaces(String filter){
		
		RestTemplate restTemplate = new RestTemplate();
		
		URI targetUrl= UriComponentsBuilder.fromUriString(googlePlacesBaseUrl)
			    .path(googlePlacesSearchUrl)
			    .queryParam("sensor", "false")
			    .queryParam("key", googlePlacesKey)
			    .queryParam("query", filter)
			    .build()
			    .toUri();
		
		String pulp = restTemplate.getForObject(targetUrl, String.class);
		
		JSONObject original = new JSONObject(pulp);
		
		JSONArray items = original.getJSONArray("results");
		
		JSONArray foundPlaces = new JSONArray();
		
		for(int j=0; j<items.length(); j++){
			JSONObject item = items.getJSONObject(j);
			
			JSONObject digestedPlace = new JSONObject();

			digestedPlace.put("service", "gplaces");
			digestedPlace.put("type", item.getJSONArray("types"));
			digestedPlace.put("name", item.getString("name"));
			digestedPlace.put("location", item.getJSONObject("geometry").getJSONObject("location"));
			digestedPlace.put("data", new JSONObject());
			digestedPlace.getJSONObject("data").put("icon", item.getString("icon"));
			digestedPlace.getJSONObject("data").put("place_id", item.getString("place_id"));
			digestedPlace.getJSONObject("data").put("formatted_address", item.getString("formatted_address"));
			
			foundPlaces.put(digestedPlace);
		}
		
		return foundPlaces;
	}
	
	private JSONArray searchFoursquare(String filter){
		RestTemplate restTemplate = new RestTemplate();
				
		URI targetUrl= UriComponentsBuilder.fromUriString(foursquareBaseUrl)
			    .path(foursquareSearchUrl)
			    .queryParam("client_id", foursquareClientId)
			    .queryParam("client_secret", foursquareClientSecret)
			    .queryParam("v", "20141002")
			    .queryParam("m", "foursquare")
			    .queryParam("intent", "global")
			    .queryParam("query", filter)
			    .build()
			    .toUri();
		
		JSONObject pulp = new JSONObject(restTemplate.getForObject(targetUrl, String.class));
		
		JSONArray items = pulp.getJSONObject("response").getJSONArray("venues");
		
		JSONArray foundPlaces = new JSONArray();

		for(int j=0; j<items.length(); j++){
			JSONObject item = items.getJSONObject(j);
			
			JSONObject digestedPlace = new JSONObject();

			digestedPlace.put("service", "4sq");
			digestedPlace.put("type", new JSONArray());
			
			JSONArray categories = item.getJSONArray("categories");
			for(int k=0; k<categories.length(); k++){
				digestedPlace.getJSONArray("type").put(categories.getJSONObject(k).getString("name"));
			}
			
			digestedPlace.put("name", item.getString("name"));
			digestedPlace.put("location", new JSONObject());
			digestedPlace.getJSONObject("location").put("lat", item.getJSONObject("location").getDouble("lat"));
			digestedPlace.getJSONObject("location").put("lng", item.getJSONObject("location").getDouble("lng"));
			digestedPlace.put("data", new JSONObject());
			digestedPlace.getJSONObject("data").put("id", item.getString("id"));
			digestedPlace.getJSONObject("data").put("formattedAddress", item.getJSONObject("location").getJSONArray("formattedAddress"));
			digestedPlace.getJSONObject("data").put("verified", item.getBoolean("verified"));
			
			foundPlaces.put(digestedPlace);
		}
		
		return foundPlaces;
	}
}
