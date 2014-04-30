package com.wsolutions.hateoas.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.links.AddLinks;
import org.jboss.resteasy.links.LinkResource;
import org.springframework.stereotype.Controller;

import com.wsolutions.hateoas.entity.Conference;
import com.wsolutions.hateoas.service.ConferenceService;

@Controller
@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
@Path("/rs/conferences")
public class ConferenceController extends AbstractController {

	@Resource
	private ConferenceService conferenceService;

	@GET
	@Path("/")
	@LinkResource(value = Conference.class)
	@AddLinks
	public List<Conference> getAll() {
		return conferenceService.getAll();
	}

	@GET
	@Path("/{id}")
	@LinkResource(value = Conference.class)
	@AddLinks
	public Conference getOneById(@PathParam("id") long id) {
		return conferenceService.getOneById(id);
	}

	@POST
	@Path("/{id}/subscribe")
	@LinkResource(value = Conference.class, rel = "subscribe", constraint = "${!past}")
	public Response testAction(@PathParam("id") long id) {
		return notImplemented();
	}

	@POST
	@Path("/")
	public Response post() {
		return notImplemented();
	}

	@PUT
	@Path("/")
	public Response put() {
		return notImplemented();
	}

	@DELETE
	@Path("/")
	public Response delete() {
		return notImplemented();
	}
}
