package com.wsolutions.hateoas.controller;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

public abstract class AbstractController {

	public Response notImplemented() {
		return Response.status(Status.NOT_IMPLEMENTED).build();
	}

}
