package mx.devhive.rutamx.rest;

import mx.devhive.rutamx.rest.resource.TestResource;

import org.glassfish.jersey.server.ResourceConfig;

public class RutaMXJerseyApp extends ResourceConfig {

	public RutaMXJerseyApp() {
		register(TestResource.class);
	}
	
}
