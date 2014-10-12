package mx.devhive.rutamx.rest;

import mx.devhive.rutamx.rest.resource.RouteResource;
import mx.devhive.rutamx.rest.resource.SearchResource;
import mx.devhive.rutamx.rest.resource.ValidateLocationResource;

import org.glassfish.jersey.server.ResourceConfig;

public class RutaMXJerseyApp extends ResourceConfig {

	public RutaMXJerseyApp() {
		register(SearchResource.class);
		register(ValidateLocationResource.class);
		register(RouteResource.class);
	}
	
}
